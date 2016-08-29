package vista;

import dto.CiudadDTO;
import dto.HotelDTO;
import dto.UnidadDTO;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
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
    private DatePicker fechaSalida;
    private DatePicker fechaRegreso;
    private TextArea areaItinerario;
    private DatePicker fechaIngresoHotel;
    private DatePicker fechaEgresoHotel;
    private TextField campoDescripcion;
    private TextField campoLugarDeSalida;

    public CrearSalidaStage(int largo, int ancho, List<CiudadDTO> ciudades) {
        this.setTitle(WINDOWS_TITLE);
        initComponents(ciudades);
        buildStage(largo, ancho);
    }

    private void initComponents(List<CiudadDTO> ciudades) {

        this.fechaSalida = new DatePicker();
        this.fechaRegreso = new DatePicker();
        this.fechaIngresoHotel = new DatePicker();
        this.fechaEgresoHotel = new DatePicker();

        this.campoLugarDeSalida = new TextField();

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
        this.areaItinerario = new TextArea();
        this.campoDescripcion = new TextField();

        this.confirmarButton = new Button("Crear Salida");

    }

    private void buildStage(int largo, int ancho) {
        VBox pane = new VBox();
        pane.getChildren().add(new Label("Datos del paquete: "));
        pane.getChildren().add(createHBox(new Label("Nombre del paquete: "), this.campoNombre));
        pane.getChildren().add(createHBox(new Label("Descripción del paquete: "), this.campoDescripcion));
        pane.getChildren().add(createHBox(new Label("Condiciones: "), this.areaCondiciones));
        pane.getChildren().add(createHBox(new Label("Itinerario: "), this.areaItinerario));
        pane.getChildren().add(new Label("Fechas"));
        pane.getChildren().add(createHBox(new Label("Salida:  "), this.fechaSalida));
        pane.getChildren().add(createHBox(new Label("Lugar:  "), this.campoLugarDeSalida));
        pane.getChildren().add(createHBox(new Label("Regreso: "), this.fechaRegreso));
        pane.getChildren().add(new Label("Destinos"));
        pane.getChildren().add(this.ciudadChoiceBox);
        pane.getChildren().add(new Label("Unidades"));
        pane.getChildren().add(this.unidadesListView);
        pane.getChildren().add(new Label("Hoteles"));
        pane.getChildren().add(this.hotelChoiceBox);
        pane.getChildren().add(createHBox(new Label("Ingreso al hotel: "), this.fechaIngresoHotel));
        pane.getChildren().add(createHBox(new Label("Egreso del hotel: "), this.fechaEgresoHotel));
        pane.getChildren().add(new Label(""));
        pane.getChildren().add(new Label("Precios de las bases"));
        pane.getChildren().add(bases());
        pane.getChildren().add(new Label(""));
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

    public Button getConfirmarButton() {
        return confirmarButton;
    }

    public TextField getBaseSimple() {
        return baseSimple;
    }

    public TextField getBaseDoble() {
        return baseDoble;
    }

    public TextField getBaseTriple() {
        return baseTriple;
    }

    public TextField getBaseCuad() {
        return baseCuad;
    }

    public TextField getBaseQuin() {
        return baseQuin;
    }

    public TextField getCampoNombre() {
        return campoNombre;
    }

    public TextArea getAreaCondiciones() {
        return areaCondiciones;
    }

    public DatePicker getFechaSalida() {
        return fechaSalida;
    }

    public DatePicker getFechaRegreso() {
        return fechaRegreso;
    }

    public TextArea getAreaItinerario() {
        return areaItinerario;
    }

    public DatePicker getFechaIngresoHotel() {
        return fechaIngresoHotel;
    }

    public DatePicker getFechaEgresoHotel() {
        return fechaEgresoHotel;
    }

    public TextField getCampoDescripcion() {
        return campoDescripcion;
    }

    public TextField getCampoLugarDeSalida() {
        return campoLugarDeSalida;
    }
}
