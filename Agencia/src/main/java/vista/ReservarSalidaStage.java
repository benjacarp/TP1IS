package vista;

import dto.SalidaDTO;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;

/**
 * Created by ASUS on 26/08/2016.
 */
public class ReservarSalidaStage extends Stage {

    private static final String WINDOWS_TITLE = "Reservar Salida";
    private ChoiceBox<SalidaDTO> choiceBoxSalidas;
    private Label labelcupos;
    private Label labelPrecios;
    private Label labelPrecioTotal;
    private ChoiceBox<Integer> choiceBoxBase;
    private Button buttonElegirButacas;
    private Label butacasElegidas;
    private Button buttonConfirmarReserva;
    private Button buttonActualizar;
    private TextField campoNombreCliente;
    private TextField campoTelCliente;
    private TextField campoMailCliente;
    private TextField campoDNICliente;

    public ReservarSalidaStage(int largo, int ancho, List<SalidaDTO> salidas) {
        this.setTitle(WINDOWS_TITLE);
        initComponents(salidas);
        buildStage(largo, ancho);
    }

    private void initComponents(List<SalidaDTO> salidas) {

        this.campoNombreCliente = new TextField();
        this.choiceBoxSalidas = new ChoiceBox<SalidaDTO>();
        this.choiceBoxSalidas.getItems().addAll(salidas);
        this.buttonActualizar = new Button("Actualizar");
        this.labelcupos = new Label();
        this.labelPrecios = new Label();
        this.choiceBoxBase = new ChoiceBox<Integer>();
        this.choiceBoxBase.getItems().addAll(1,2,3,4,5);
        this.labelPrecioTotal = new Label("");
        this.buttonElegirButacas = new Button("Elegir Butacas");
        this.butacasElegidas = new Label("");
        this.buttonConfirmarReserva = new Button("Confirmar Reserva");
        this.campoTelCliente = new TextField();
        this.campoMailCliente = new TextField();
        this.campoDNICliente = new TextField();
    }

    private void buildStage(int largo, int ancho) {

        VBox pane = new VBox();
        pane.getChildren().add(new Label("Cliente: "));
        pane.getChildren().add(this.campoNombreCliente);
        pane.getChildren().add(new Label("DNI: "));
        pane.getChildren().add(this.campoDNICliente);
        pane.getChildren().add(new Label("tel: "));
        pane.getChildren().add(this.campoTelCliente);
        pane.getChildren().add(new Label("mail: "));
        pane.getChildren().add(this.campoMailCliente);
        pane.getChildren().add(new Label(""));
        pane.getChildren().add(new Label("Elija la salida que desea reservar: "));
        HBox hBox = new HBox();
        hBox.getChildren().addAll(this.choiceBoxSalidas, this.buttonActualizar);
        pane.getChildren().add(hBox);

        hBox = new HBox();
        hBox.getChildren().addAll(new Label("Cupos disponibles: "), this.labelcupos);
        pane.getChildren().add(hBox);
        pane.getChildren().add(this.labelPrecios);

        pane.getChildren().add(new Label(""));
        hBox = new HBox();
        hBox.getChildren().addAll(new Label("Cupos disponibles: "), this.choiceBoxBase, new Label("Precio Total: $"),this.labelPrecioTotal);
        pane.getChildren().add(hBox);

        pane.getChildren().add(this.buttonElegirButacas);
        pane.getChildren().add(this.butacasElegidas);
        pane.getChildren().add(this.buttonConfirmarReserva);

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

    public Label getLabelPrecioTotal() {
        return labelPrecioTotal;
    }

    public ChoiceBox<Integer> getChoiceBoxBase() {
        return choiceBoxBase;
    }

    public Button getButtonElegirButacas() {
        return buttonElegirButacas;
    }

    public Label getButacasElegidas() {
        return butacasElegidas;
    }

    public Button getButtonConfirmarReserva() {
        return buttonConfirmarReserva;
    }

    public Button getButtonActualizar() {
        return buttonActualizar;
    }

    public void setButtonActualizar(Button buttonActualizar) {
        this.buttonActualizar = buttonActualizar;
    }

    public TextField getCampoNombreCliente() {
        return campoNombreCliente;
    }

    public TextField getCampoTelCliente() {
        return campoTelCliente;
    }

    public void setCampoTelCliente(TextField campoTelCliente) {
        this.campoTelCliente = campoTelCliente;
    }

    public TextField getCampoMailCliente() {
        return campoMailCliente;
    }

    public TextField getCampoDNICliente() {
        return campoDNICliente;
    }
}
