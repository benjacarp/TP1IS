package vista;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by ASUS on 28/08/2016.
 */
public class ElegirButacasVista extends Stage{

    public static final String WINDOWS_TITLE = "Elegir Butacas";
    public static final int MAX_WIDTH = 50;
    private final int base;

    private TextField primerTF;
    private TextField segundoTF;
    private TextField tercerTF;
    private TextField cuartoTF;
    private TextField quintoTF;

    private TextArea butacasDisp;
    private Button buttonConfirmar;

    public ElegirButacasVista(int base, int largo, int ancho, String butacas) {
        this.setTitle(WINDOWS_TITLE);
        this.base = base;
        initComponents(butacas);
        buildStage(largo, ancho);
    }

    private void initComponents(String butacas) {

        this.butacasDisp = new TextArea(butacas);
        this.butacasDisp.setMaxWidth(350);
        this.butacasDisp.setMinHeight(140);
        this.butacasDisp.setMinHeight(140);
        this.butacasDisp.setWrapText(true);
        this.butacasDisp.setText(butacas);
        this.buttonConfirmar = new Button("Confirmar");

        this.primerTF = new TextField();
        this.segundoTF = new TextField();
        this.tercerTF = new TextField();
        this.cuartoTF = new TextField();
        this.quintoTF = new TextField();

        this.primerTF.setMaxWidth(MAX_WIDTH);
        this.segundoTF.setVisible(false);
        this.segundoTF.setMaxWidth(MAX_WIDTH);
        this.tercerTF.setVisible(false);
        this.tercerTF.setMaxWidth(MAX_WIDTH);;
        this.cuartoTF.setVisible(false);
        this.cuartoTF.setMaxWidth(MAX_WIDTH);
        this.quintoTF.setVisible(false);
        this.quintoTF.setMaxWidth(MAX_WIDTH);

        this.primerTF.setVisible(true);
        if (base > 1)
            this.segundoTF.setVisible(true);
        if (base > 2)
            this.tercerTF.setVisible(true);
        if (base > 3)
            this.cuartoTF.setVisible(true);
        if (base > 4)
            this.quintoTF.setVisible(true);

    }

    private void buildStage(int largo, int ancho) {

        VBox pane = new VBox();
        pane.getChildren().add(new Label("Elija las butacas que desea reservar: "));
        pane.getChildren().addAll(this.primerTF, this.segundoTF, this.tercerTF, this.cuartoTF, this.quintoTF);
        pane.getChildren().add(new Label(""));
        pane.getChildren().add(new Label("Butacas disponibles: "));
        pane.getChildren().add(this.butacasDisp);
        pane.getChildren().add(new Label(""));
        pane.getChildren().add(this.buttonConfirmar);

        Scene scene = new Scene(pane,largo,ancho);
        //set the scene to the stage
        this.setScene(scene);
    }

    public Button getButtonConfirmar() {
        return buttonConfirmar;
    }

    public TextField getPrimerTF() {
        return primerTF;
    }

    public TextField getSegundoTF() {
        return segundoTF;
    }

    public TextField getTercerTF() {
        return tercerTF;
    }

    public TextField getCuartoTF() {
        return cuartoTF;
    }

    public TextField getQuintoTF() {
        return quintoTF;
    }

    public int getBase() {
        return base;
    }
}
