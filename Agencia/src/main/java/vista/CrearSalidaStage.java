package vista;

import dto.CiudadDTO;
import dto.HotelDTO;
import dto.UnidadDTO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
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
    private ChoiceBox<HotelDTO> hotelChoiceBox;
    private TextField baseSimple;
    private TextField baseDoble;
    private TextField baseTriple;
    private TextField baseCuad;
    private TextField baseQuin;
    private TextField campoNombre;
    private TextArea areaCondiciones;
    private Button confirmarButton;

    public CrearSalidaStage(int largo, int ancho, List<CiudadDTO> ciudades) {
        this.setTitle(WINDOWS_TITLE);
        initComponents(ciudades);
        buildStage(largo, ancho);
    }

    private void initComponents(List<CiudadDTO> ciudades) {

        this.ciudadChoiceBox = new ChoiceBox<>();
        this.hotelChoiceBox = new ChoiceBox<>();
        this.ciudadChoiceBox.getItems().addAll(ciudades);
        this.unidadesListView = new ListView<>();

        this.baseSimple = new TextField();
        this.baseDoble = new TextField();
        this.baseTriple = new TextField();
        this.baseCuad = new TextField();
        this.baseQuin = new TextField();

        this.campoNombre = new TextField();
        this.areaCondiciones = new TextArea();

        this.confirmarButton = new Button("Crear Salida");

    }

    private void buildStage(int largo, int ancho) {
        VBox pane = new VBox();
        pane.getChildren().add(new Label("Destinos"));
        pane.getChildren().add(this.ciudadChoiceBox);
        pane.getChildren().add(new Label("Unidades"));
        pane.getChildren().add(this.unidadesListView);
        pane.getChildren().add(new Label("Hoteles"));
        pane.getChildren().add(this.hotelChoiceBox);
        pane.getChildren().add(new Label(""));
        pane.getChildren().add(new Label("Precios de las bases"));
        pane.getChildren().add(bases());
        pane.getChildren().add(new Label(""));
        pane.getChildren().add(new Label("Datos del paquete: "));
        pane.getChildren().add(createHBox(new Label("Nombre del paquete: "), this.campoNombre));
        pane.getChildren().add(createHBox(new Label("Condiciones: "), this.areaCondiciones));
        pane.getChildren().add(new Label(""));
        pane.getChildren().add(this.confirmarButton);

        Scene scene = new Scene(pane,largo,ancho);

        //set the scene to the stage
        this.setScene(scene);
    }

    private Node createHBox(Label label, Node node) {
        HBox hBox = new HBox();
        hBox.getChildren().addAll(label, node);
        return hBox;
    }

    private Node bases() {
        HBox hBox = new HBox();
        hBox.getChildren().add(createVBox(new Label("Simple"),this.baseSimple));
        hBox.getChildren().add(createVBox(new Label("Doble"),this.baseDoble));
        hBox.getChildren().add(createVBox(new Label("Triple"),this.baseTriple));
        hBox.getChildren().add(createVBox(new Label("Cuadruple"),this.baseCuad));
        hBox.getChildren().add(createVBox(new Label("Quintuple"),this.baseQuin));
        return hBox;
    }

    private Node createVBox(Label label, TextField textField) {
        VBox vBox = new VBox();
        vBox.getChildren().add(label);
        vBox.getChildren().add(textField);
        return vBox;
    }

    public ChoiceBox<CiudadDTO> getCiudadChoiceBox() {
        return ciudadChoiceBox;
    }

    public ListView<UnidadDTO> getUnidadesListView() {
        return unidadesListView;
    }

    public ChoiceBox<HotelDTO> getHotelChoiceBox() {
        return hotelChoiceBox;
    }
}
