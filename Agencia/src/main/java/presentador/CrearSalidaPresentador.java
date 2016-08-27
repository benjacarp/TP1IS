package presentador;

import controlador.CrearSalidaControlador;
import dto.CiudadDTO;
import dto.HotelDTO;
import dto.UnidadDTO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
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
            this.alertaMaker(Alert.AlertType.ERROR, "Error", "Hubo un problema", "No se pudieron encontrar los destinos");
            e.printStackTrace();
        }
    }

    private void setActions() {
        this.stage.getCiudadChoiceBox().setOnAction(event -> choiceBoxSelectionChange());
    }

    private void choiceBoxSelectionChange() {
        ObservableList<UnidadDTO> unidades = FXCollections.observableArrayList();
        ObservableList<HotelDTO> hoteles = FXCollections.observableArrayList();
        int codigoDeCiudad = this.stage.getCiudadChoiceBox().getSelectionModel().getSelectedItem().getCodigo();
        String nombreDeCiudad = this.stage.getCiudadChoiceBox().getSelectionModel().getSelectedItem().getNombre();

        try {
            unidades.addAll(CrearSalidaControlador.getInstance().getUnidades(codigoDeCiudad));
            hoteles.addAll(CrearSalidaControlador.getInstance().getHoteles(nombreDeCiudad));
        } catch (Exception e) {
            this.alertaMaker(Alert.AlertType.WARNING, "Advertencia", "Hubo un problema", "No se pudieron encontrar las unidades para el destino");
            e.printStackTrace();
        }

        this.stage.getUnidadesListView().setItems(unidades);
        this.stage.getHotelChoiceBox().setItems(hoteles);
    }

    private void alertaMaker(Alert.AlertType error, String advertencia, String headerText, String contentText) {
        Alert alert = new Alert(error);
        alert.setTitle(advertencia);
        alert.setHeaderText(headerText);
        alert.setContentText(contentText);

        alert.showAndWait();
    }

}
