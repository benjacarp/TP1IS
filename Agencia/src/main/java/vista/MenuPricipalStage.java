package vista;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Created by ASUS on 25/08/2016.
 */
public class MenuPricipalStage extends Stage{

    public static final String WINDOWS_TITLE = "Menu Pricipal";

    private MenuBar menuBar;
    private Menu menuSalida;
    private MenuItem itemCrearSalida;
    private MenuItem itemReservarSalida;

    public MenuPricipalStage(int largo, int ancho) {
        this.setTitle(WINDOWS_TITLE);
        initComponents();
        buildStage(largo, ancho);
    }

    private void initComponents() {

        this.menuBar = new MenuBar();
        this.menuSalida = new Menu("Salida");
        this.itemCrearSalida = new MenuItem("Crear Salida");
        this.itemReservarSalida = new MenuItem("Reservar Salida");

        this.menuSalida.getItems().addAll(this.itemCrearSalida, this.itemReservarSalida);
        this.menuBar.getMenus().add(this.menuSalida);
    }

    private void buildStage(int largo, int ancho) {

        // create layout
        BorderPane pane = new BorderPane();

        pane.setTop(this.menuBar);

        //create the scene with layout and sizes.
        Scene scene = new Scene(pane,largo,ancho);
        //set the scene to the stage
        this.setScene(scene);
    }

    public MenuItem getItemReservarSalida() {
        return itemReservarSalida;
    }

    public MenuItem getItemCrearSalida() {
        return itemCrearSalida;
    }
}
