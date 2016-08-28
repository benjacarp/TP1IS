package vista;

import dto.SalidaDTO;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Salida;

import java.util.List;

/**
 * Created by ASUS on 26/08/2016.
 */
public class ReservarSalidaStage extends Stage {

    private static final String WINDOWS_TITLE = "Reservar Salida";
    private ChoiceBox<SalidaDTO> choiceBoxSalidas;
    private Label labelcupos;
    private Label labelPrecios;

    public ReservarSalidaStage(int largo, int ancho, List<SalidaDTO> salidas) {
        this.setTitle(WINDOWS_TITLE);
        initComponents(salidas);
        buildStage(largo, ancho);
    }

    private void initComponents(List<SalidaDTO> salidas) {

        this.choiceBoxSalidas = new ChoiceBox<SalidaDTO>();
        this.choiceBoxSalidas.getItems().addAll(salidas);
        this.labelcupos = new Label();
        this.labelPrecios = new Label();

    }

    private void buildStage(int largo, int ancho) {

        VBox pane = new VBox();
        pane.getChildren().add(new Label("Elija la salida que desea reservar: "));
        pane.getChildren().add(this.choiceBoxSalidas);

        HBox hBox = new HBox();
        hBox.getChildren().addAll(new Label("Cupos disponibles: "), this.labelcupos);
        pane.getChildren().add(hBox);
        pane.getChildren().add(this.labelPrecios);

        Scene scene = new Scene(pane,largo,ancho);
        //set the scene to the stage
        this.setScene(scene);
    }

    public Label getLabelcupos() {
        return labelcupos;
    }

    public ChoiceBox<SalidaDTO> getChoiceBoxSalidas() {
        return choiceBoxSalidas;
    }

    public Label getLabelPrecios() {
        return labelPrecios;
    }
}
