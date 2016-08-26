package presentador;

import controlador.CrearSalidaControlador;
import dto.CiudadDTO;
import javafx.scene.control.Alert;
import org.tempuri.IBusServiceObtenerCiudadesBusServiceFaultFaultFaultMessage;
import vista.CrearSalidaStage;

import java.util.List;

/**
 * Created by ASUS on 25/08/2016.
 */
public class CrearSalidaPresentador {

    private CrearSalidaStage stage;

    public CrearSalidaPresentador(int largo, int ancho) {
        List<CiudadDTO> ciudades = null;
        try {
            ciudades = CrearSalidaControlador.getInstance().iniciarSalida();
            this.stage = new CrearSalidaStage(largo, ancho, ciudades);
            this.setActions();
            this.stage.show();

        } catch (Exception e) {
            this.alertaCiudades();
        }
    }

    private void setActions() {

    }

    private void alertaCiudades() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Advertencia");
        alert.setHeaderText("No se pudo encontrar los destinos disponibles");
        alert.setContentText("Momentaneamente no se puedieron encontrar los " +
                "destinos disponibles, por favor intente de nuevo mas tarde" +
                "o verifique su conexion a Internet.");

        alert.showAndWait();
    }

}
