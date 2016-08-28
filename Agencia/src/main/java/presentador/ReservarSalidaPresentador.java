package presentador;

import controlador.ReservarSalidaControlador;
import datos.Repositorio;
import dto.SalidaDTO;
import javafx.scene.control.Alert;
import model.Salida;
import vista.ReservarSalidaStage;

import java.util.List;

/**
 * Created by ASUS on 26/08/2016.
 */
public class ReservarSalidaPresentador extends GenericPresentador{

    private ReservarSalidaStage stage;

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

    }

}
