package vista;

import dto.CiudadDTO;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;

/**
 * Created by ASUS on 25/08/2016.
 */
public class CrearSalidaStage extends Stage {

    private static final String WINDOWS_TITLE = "Crear Salida";

    private ChoiceBox<CiudadDTO> ciudadChoiceBox;

    public CrearSalidaStage(int largo, int ancho, List<CiudadDTO> ciudades) {
        this.setTitle(WINDOWS_TITLE);
        initComponents(ciudades);
        buildStage(largo, ancho);
    }

    private void initComponents(List<CiudadDTO> ciudades) {

        this.ciudadChoiceBox = new ChoiceBox<>();
        this.ciudadChoiceBox.getItems().addAll(ciudades);

    }

    private void buildStage(int largo, int ancho) {
        VBox pane = new VBox();
        pane.getChildren().add(this.ciudadChoiceBox);
        Scene scene = new Scene(pane,largo,ancho);
        //set the scene to the stage
        this.setScene(scene);
    }
}
