package controlador;

import datos.Repositorio;
import dto.SalidaDTO;
import dto.SalidaInfoDTO;
import model.Salida;
import org.datacontract.schemas._2004._07.sge_service_contracts.ArrayOfButacaSvc;
import org.datacontract.schemas._2004._07.sge_service_contracts.ButacaSvc;
import org.tempuri.BusService;
import org.tempuri.IBusService;
import org.tempuri.IBusServiceObtenerButacasBusServiceFaultFaultFaultMessage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 28/08/2016.
 */
public class ReservarSalidaControlador extends GenericControlador {

    private static final ReservarSalidaControlador INSTANCE = new ReservarSalidaControlador();

    private ReservarSalidaControlador() {
    }

    public static ReservarSalidaControlador getInstance() {
        return INSTANCE;
    }


    public List<SalidaDTO> getSalidas() {

        List<Salida> salidas = Repositorio.getInstance().getSalidas();

        List<SalidaDTO> salidaDTOList = new ArrayList<>();
        SalidaDTO salidaDTO;
        for (Salida salida : salidas) {
            salidaDTO = new SalidaDTO(salida.getId(), salida.getNombre());
            salidaDTOList.add(salidaDTO);
        }

        return salidaDTOList;
    }

    public int getCupos(int salidaId) throws IBusServiceObtenerButacasBusServiceFaultFaultFaultMessage {
        BusService client = new BusService();
        IBusService stub = client.getSGEBusService();

        Salida salida = Repositorio.getInstance().getSalidaPorId(salidaId);

        ArrayOfButacaSvc arrayOfButacaSvcutacas = stub.obtenerButacas(CODIGO, salida.getTransporte().getUnidad().getNumero());

        int cupo = 0;
        for (ButacaSvc butacaSvc : arrayOfButacaSvcutacas.getButacaSvc()) {
            if (!butacaSvc.isOcupada()) {
                cupo++;
            }
        }

        if (cupo == 0) {
            salida.setEstado("En pausa");
        }
        return cupo;
    }

    public SalidaInfoDTO getSalidaInfo(int salidaId) {
        Salida salida = Repositorio.getInstance().getSalidaPorId(salidaId);

        SalidaInfoDTO salidaInfoDTO = new SalidaInfoDTO();
        salidaInfoDTO.setBaseSimple(salida.getBaseSimple());
        salidaInfoDTO.setBaseDoble(salida.getBaseDoble());
        salidaInfoDTO.setBaseTriple(salida.getBaseTriple());
        salidaInfoDTO.setBaseCuadruple(salida.getBaseCuadruple());
        salidaInfoDTO.setBaseQuintuple(salida.getBaseQuintuple());

        return salidaInfoDTO;
    }
}
