package presentador;

import controlador.CrearSalidaControlador;
import dto.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import model.Transporte;
import vista.CrearSalidaStage;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

/**
 * Created by ASUS on 25/08/2016.
 */
public class CrearSalidaPresentador extends GenericPresentador{

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
        this.stage.getConfirmarButton().setOnAction(event -> confirmarCreacionDeSalida());
    }

    /**
     * Crear salidaDTO con los campos de la UI.
     *
     */
    private void confirmarCreacionDeSalida() {

        SalidaDTO salidaDTO = new SalidaDTO();

        salidaDTO.setBaseSimple(Double.parseDouble(this.stage.getBaseSimple().getText()));
        salidaDTO.setBaseDoble(Double.parseDouble(this.stage.getBaseDoble().getText()));
        salidaDTO.setBaseTriple(Double.parseDouble(this.stage.getBaseTriple().getText()));
        salidaDTO.setBaseCuadruple(Double.parseDouble(this.stage.getBaseCuad().getText()));
        salidaDTO.setBaseQuintuple(Double.parseDouble(this.stage.getBaseQuin().getText()));

        salidaDTO.setNombre(this.stage.getCampoNombre().getText());
        salidaDTO.setDescripcion(this.stage.getCampoDescripcion().getText());
        salidaDTO.setCondiciones(this.stage.getAreaCondiciones().getText());
        salidaDTO.setItinerario(this.stage.getAreaItinerario().getText());
        salidaDTO.setOrigen(new CiudadDTO(0,this.stage.getCiudadChoiceBox().getSelectionModel().getSelectedItem().getNombre()));

        Date inicioHotelDate = Date.from(Instant.from(this.stage.getFechaIngresoHotel().getValue().atStartOfDay(ZoneId.systemDefault())));
        Date finHotelDate = Date.from(Instant.from(this.stage.getFechaEgresoHotel().getValue().atStartOfDay(ZoneId.systemDefault())));
        AlojamientoDTO alojamientoDTO = new AlojamientoDTO(inicioHotelDate,finHotelDate,this.stage.getHotelChoiceBox().getSelectionModel().getSelectedItem());

        salidaDTO.setAlojamiento(alojamientoDTO);

        Date inicioTranspDate = Date.from(Instant.from(this.stage.getFechaSalida().getValue().atStartOfDay(ZoneId.systemDefault())));
        Date finTranspDate = Date.from(Instant.from(this.stage.getFechaRegreso().getValue().atStartOfDay(ZoneId.systemDefault())));
        TransporteDTO transporteDTO = new TransporteDTO(inicioTranspDate, finTranspDate, this.stage.getUnidadesListView().getSelectionModel().getSelectedItem());
        transporteDTO.setDestino(this.stage.getCiudadChoiceBox().getSelectionModel().getSelectedItem().getNombre());
        transporteDTO.setOrigen(this.stage.getCampoLugarDeSalida().getText());

        salidaDTO.setTransporte(transporteDTO);

        CrearSalidaControlador.getInstance().guardarSalida(salidaDTO);

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

}
