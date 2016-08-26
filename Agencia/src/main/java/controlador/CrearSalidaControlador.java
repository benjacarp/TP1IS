package controlador;

import dto.CiudadDTO;
import org.datacontract.schemas._2004._07.sge_service_contracts.ArrayOfCiudadSvc;
import org.datacontract.schemas._2004._07.sge_service_contracts.CiudadSvc;
import org.tempuri.BusService;
import org.tempuri.IBusService;
import org.tempuri.IBusServiceObtenerCiudadesBusServiceFaultFaultFaultMessage;

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
}
