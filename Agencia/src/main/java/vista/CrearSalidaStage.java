package vista;

import dto.CiudadDTO;
import dto.UnidadDTO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
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
    private ListView<UnidadDTO> unidadesListView;

    public CrearSalidaStage(int largo, int ancho, List<CiudadDTO> ciudades) {
        this.setTitle(WINDOWS_TITLE);
        initComponents(ciudades);
        buildStage(largo, ancho);
    }

    private void initComponents(List<CiudadDTO> ciudades) {

        this.ciudadChoiceBox = new ChoiceBox<>();
        this.ciudadChoiceBox.getItems().addAll(ciudades);
        this.unidadesListView = new ListView<>();

    }

    private void buildStage(int largo, int ancho) {
        VBox pane = new VBox();
        pane.getChildren().add(new Label("Destinos"));
        pane.getChildren().add(this.ciudadChoiceBox);
        pane.getChildren().add(new Label("Unidades"));
        pane.getChildren().add(this.unidadesListView);
        pane.getChildren().add(new Label("Unidades"));
        Scene scene = new Scene(pane,largo,ancho);

        //set the scene to the stage
        this.setScene(scene);
    }

    public ChoiceBox<CiudadDTO> getCiudadChoiceBox() {
        return ciudadChoiceBox;
    }

    public ListView<UnidadDTO> getUnidadesListView() {
        return unidadesListView;
    }
}
