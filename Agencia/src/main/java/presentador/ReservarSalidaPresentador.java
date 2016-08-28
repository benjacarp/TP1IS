package presentador;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import controlador.ReservarSalidaControlador;
import dto.SalidaDTO;
import dto.SalidaInfoDTO;
import javafx.scene.control.Alert;
import org.tempuri.IBusServiceObtenerButacasBusServiceFaultFaultFaultMessage;
import vista.ReservarSalidaStage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 26/08/2016.
 */
public class ReservarSalidaPresentador extends GenericPresentador{

    private ReservarSalidaStage stage;
    private SalidaInfoDTO salidaInfoDTO;
    private List<Integer> butacas = new ArrayList<>();

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
        this.stage.getButtonActualizar().setOnAction(event -> choiceBoxSalidasSelectionChange());

//        int base = this.stage.getChoiceBoxBase().getSelectionModel().getSelectedItem();
        this.stage.getChoiceBoxBase().setOnAction(event -> choiceBoxBaseSelectionChange(this.stage.getChoiceBoxBase().getSelectionModel().getSelectedItem()));
        this.stage.getButtonElegirButacas().setOnAction(event -> buttonElegirButacasClick(this.stage.getChoiceBoxBase().getSelectionModel().getSelectedItem()));
        this.stage.getButtonConfirmarReserva().setOnAction(event -> buttonConfirmarReservaClick());
    }

    private void choiceBoxBaseSelectionChange(int base) {
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

    private void buttonElegirButacasClick(int base) {
        new ElegirButacasPresentador(base,300,400, this);
    }

    public void setButacas(List<Integer> butacas) {
        this.butacas = butacas;
    }

    public List<Integer> getButacas() {
        return butacas;
    }

    private void buttonConfirmarReservaClick() {
        for (int i : this.butacas) {
            System.out.println(i);
        }
    }

    public void actualizarButacas() {
        String butacas = "Butacas a reservar: ";
        for (int i : this.butacas) {
            butacas = butacas + i + "   ";
        }
        this.stage.getButacasElegidas().setText(butacas);
    }
}
