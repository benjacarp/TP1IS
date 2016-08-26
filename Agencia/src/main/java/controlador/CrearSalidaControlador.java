package controlador;

import dto.CiudadDTO;
import dto.HotelDTO;
import dto.UnidadDTO;
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
public class CrearSalidaControlador {

    public static final String CODIGO = "a41f7fdb-ed81-4025-909f-1e3607f27f6a";

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
    public List<HotelDTO> getHoteles(int codigoDeCiudad) {
        List<HotelDTO> list = new ArrayList<>();

        if (codigoDeCiudad == 1) {
            list.add(new HotelDTO(3,"Zeus"));
            list.add(new HotelDTO(5,"Prive"));
            list.add(new HotelDTO(4,"Amadeus"));

        } else if (codigoDeCiudad == 2) {
            list.add(new HotelDTO(3,"abc"));
            list.add(new HotelDTO(5,"def"));
            list.add(new HotelDTO(4,"ghi"));

        } else if (codigoDeCiudad == 3) {
            list.add(new HotelDTO(3,"jkl"));
            list.add(new HotelDTO(5,"mno"));
            list.add(new HotelDTO(4,"pqr"));

        } else if (codigoDeCiudad == 4) {
            list.add(new HotelDTO(3,"stu"));
            list.add(new HotelDTO(5,"vw"));
            list.add(new HotelDTO(4,"xyz"));

        } else {
            list.add(new HotelDTO(3,"hotel 1"));
            list.add(new HotelDTO(5,"hotel 2"));
            list.add(new HotelDTO(4,"hotel 3"));

        }
        return list;
    }
}
