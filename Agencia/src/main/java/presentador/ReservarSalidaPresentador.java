package presentador;

import controlador.ReservarSalidaControlador;
import dto.SalidaDTO;
import dto.SalidaInfoDTO;
import javafx.scene.control.Alert;
import org.tempuri.IBusServiceObtenerButacasBusServiceFaultFaultFaultMessage;
import vista.ReservarSalidaStage;

import java.util.List;

/**
 * Created by ASUS on 26/08/2016.
 */
public class ReservarSalidaPresentador extends GenericPresentador{

    private ReservarSalidaStage stage;
    private SalidaInfoDTO salidaInfoDTO;

    public ReservarSalidaPresentador(int largo, int ancho) {

        List<SalidaDTO> salidas = ReservarSalidaControlador.getInstance().getSalidas();
        if (salidas.size() > 0) {
            this.stage = new ReservarSalidaStage(largo, ancho, salidas);
            this.setActions();
            this.stage.show();

        } else {
            this.alertaMaker(Alert.AlertType.ERROR, "Error", "No hay salidas creadas previamente.", "No se encontraron salidas.");
        }
    }

    private void setActions() {
        this.stage.getChoiceBoxSalidas().setOnAction(event -> choiceBoxSalidasSelectionChange());
        this.stage.getChoiceBoxBase().setOnAction(event -> choiceBoxBaseSelectionChange());
    }

    private void choiceBoxBaseSelectionChange() {
        int base = this.stage.getChoiceBoxBase().getSelectionModel().getSelectedItem();
        double total = ReservarSalidaControlador.getInstance().calcularTotal(base);
        this.stage.getLabelPrecioTotal().setText(String.valueOf(total));
    }

    private void choiceBoxSalidasSelectionChange() {
        int salidaId = this.stage.getChoiceBoxSalidas().getSelectionModel().getSelectedItem().getId();
        this.salidaInfoDTO = ReservarSalidaControlador.getInstance().getSalidaInfo(salidaId);
        this.stage.getLabelPrecios().setText(this.crearLabelPrecios(salidaInfoDTO));
        try {
            int cupos = ReservarSalidaControlador.getInstance().getCupos(salidaId);
            this.stage.getLabelcupos().setText(String.valueOf(cupos));
            if (cupos == 0) {
                this.alertaMaker(Alert.AlertType.WARNING, "Ciudado", "No hay cupos disponibles, salida en pausa", "Esta salida no esta disponible a la venta en estos momentos.");
            }
        } catch (IBusServiceObtenerButacasBusServiceFaultFaultFaultMessage e) {
            e.printStackTrace();
            this.alertaMaker(Alert.AlertType.ERROR, "Error", "Error de conexion", "No se pudo consultar los cupos disponibles.");
        }
    }

    private String crearLabelPrecios(SalidaInfoDTO salidaInfoDTO) {
        String string = "Base simple: ";
        string = string + salidaInfoDTO.getBaseSimple();
        string = string + ", doble: " + salidaInfoDTO.getBaseDoble();
        string = string + ", triple: " + salidaInfoDTO.getBaseTriple();
        string = string + ", cuadruple: " + salidaInfoDTO.getBaseCuadruple();
        string = string + ", quintuple: " + salidaInfoDTO.getBaseQuintuple();

        return string;
    }

}
