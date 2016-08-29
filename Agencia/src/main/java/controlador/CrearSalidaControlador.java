package controlador;

import datos.Repositorio;
import dto.CiudadDTO;
import dto.HotelDTO;
import dto.SalidaDTO;
import dto.UnidadDTO;
import model.*;
import org.datacontract.schemas._2004._07.sge_service_contracts.ArrayOfCiudadSvc;
import org.datacontract.schemas._2004._07.sge_service_contracts.ArrayOfUnidadSvc;
import org.datacontract.schemas._2004._07.sge_service_contracts.CiudadSvc;
import org.datacontract.schemas._2004._07.sge_service_contracts.UnidadSvc;
import org.tempuri.BusService;
import org.tempuri.IBusService;
import org.tempuri.IBusServiceObtenerCiudadesBusServiceFaultFaultFaultMessage;
import org.tempuri.IBusServiceObtenerUnidadesBusServiceFaultFaultFaultMessage;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase se corresponde con el caso de uso Crear Salida.
 *
 * Created by ASUS on 26/08/2016.
 */
public class CrearSalidaControlador extends GenericControlador{

//    public static final String CODIGO = "a41f7fdb-ed81-4025-909f-1e3607f27f6a";

    private static final CrearSalidaControlador INSTANCE = new CrearSalidaControlador();

    private CrearSalidaControlador() {

    }

    public static CrearSalidaControlador getInstance() {
        return INSTANCE;
    }

    /**
     * Secuencia: Iniciar Salida
     *
     * @return
     * @throws IBusServiceObtenerCiudadesBusServiceFaultFaultFaultMessage
     */
    public List<CiudadDTO> iniciarSalida() throws IBusServiceObtenerCiudadesBusServiceFaultFaultFaultMessage {

        List<CiudadDTO> CiudadDTOList = new ArrayList<>();

        BusService client = new BusService();
        IBusService stub = client.getSGEBusService();
        ArrayOfCiudadSvc array = stub.obtenerCiudades(CODIGO);
        List<CiudadSvc> ciudadSvcList = array.getCiudadSvc();

        CiudadDTO ciudadDTO;
        for (CiudadSvc ciudadSvc : ciudadSvcList) {
            ciudadDTO = new CiudadDTO(ciudadSvc.getCodigo(), ciudadSvc.getDescripcion().getValue());
            CiudadDTOList.add(ciudadDTO);
        }

        return CiudadDTOList;
    }

    /**
     * Secuencia: Elegir Ciudad
     *
     * @param codigoDeCiudad
     * @return
     * @throws IBusServiceObtenerUnidadesBusServiceFaultFaultFaultMessage
     */
    public List<UnidadDTO> getUnidades(int codigoDeCiudad) throws IBusServiceObtenerUnidadesBusServiceFaultFaultFaultMessage {

        BusService client = new BusService();
        IBusService stub = client.getSGEBusService();

        ArrayOfUnidadSvc array = stub.obtenerUnidades(CODIGO, codigoDeCiudad);
        List<UnidadSvc> unidades = array.getUnidadSvc();

        List<UnidadDTO> list = new ArrayList<>();
        UnidadDTO unidadDTO;

        for (UnidadSvc unidad : unidades) {
            unidadDTO = new UnidadDTO();

            unidadDTO.setNumero(unidad.getNumero());
            unidadDTO.setDominio(unidad.getDominio().getValue());
            unidadDTO.setMarca(unidad.getMarca().getValue());
            unidadDTO.setTipo(unidad.getTipo().getValue());
            unidadDTO.setCantidadButacas(unidad.getCantidadButacas());

            list.add(unidadDTO);
        }
        return list;
    }

    /**
     * Secuencia: Elegir Ciudad
     *
     * hoteles hardcodeados
     *
     * @param codigoDeCiudad
     * @return
     */
    public List<HotelDTO> getHoteles(String codigoDeCiudad) {
        List<HotelDTO> list = new ArrayList<>();

        // recuperar hoteles del repositorio
        List<Hotel> hoteles = Repositorio.getInstance().buscarHotelesPorCiudad(codigoDeCiudad);

        // transformar los hoteles al dto para pasarselo a la UI
        List<HotelDTO> hotelDTOList = new ArrayList<>();
        for (Hotel hotel : hoteles) {
            hotelDTOList.add(new HotelDTO(hotel.getId(), hotel.getNombre(), hotel.getEstrellas()));
        }

        return hotelDTOList;
    }

    public void guardarSalida(SalidaDTO salidaDTO) {
        Unidad unidad = new Unidad();
        UnidadDTO unidadDTO = salidaDTO.getTransporte().getUnidad();

        unidad.setNumero(unidadDTO.getNumero());
        unidad.setDominio(unidadDTO.getDominio());
        unidad.setMarca(unidadDTO.getMarca());
        unidad.setTipo(unidadDTO.getTipo());
        unidad.setCantButacas(unidadDTO.getCantidadButacas());

        Transporte transporte = new Transporte(salidaDTO.getTransporte().getInicio(), salidaDTO.getTransporte().getFin(), unidad);
        transporte.setOrigen(salidaDTO.getTransporte().getOrigen());
        transporte.setDestino(salidaDTO.getTransporte().getDestino());
        Hotel hotel = Repositorio.getInstance().getHotelPorId(salidaDTO.getAlojamiento().getHotel().getId());
        Alojamiento alojamiento = new Alojamiento(salidaDTO.getAlojamiento().getInicio(), salidaDTO.getAlojamiento().getFin(),hotel);
        Salida salida = new Salida(transporte, alojamiento);

        salida.setNombre(salidaDTO.getNombre());
        salida.setCondiciones(salidaDTO.getCondiciones());
        salida.setDescripcion(salidaDTO.getDescripcion());

        salida.setBaseSimple(salidaDTO.getBaseSimple());
        salida.setBaseDoble(salidaDTO.getBaseDoble());
        salida.setBaseTriple(salidaDTO.getBaseTriple());
        salida.setBaseCuadruple(salidaDTO.getBaseCuadruple());
        salida.setBaseQuintuple(salidaDTO.getBaseQuintuple());

        salida.setEstado("En Venta");

        Repositorio.getInstance().guardarSalida(salida);
    }
}
