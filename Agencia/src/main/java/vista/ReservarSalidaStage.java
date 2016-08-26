package vista;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by ASUS on 26/08/2016.
 */
public class ReservarSalidaStage extends Stage {

    private static final String WINDOWS_TITLE = "Reservar Salida";

    public ReservarSalidaStage(int largo, int ancho) {
        this.setTitle(WINDOWS_TITLE);
        initComponents();
        buildStage(largo, ancho);
    }

    private void initComponents() {

    }

    private void buildStage(int largo, int ancho) {
        Scene scene = new Scene(new StackPane(),largo,ancho);
        //set the scene to the stage
        this.setScene(scene);
    }
}
