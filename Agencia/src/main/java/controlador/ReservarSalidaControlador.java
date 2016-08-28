package controlador;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import datos.Repositorio;
import dto.ReservaDTO;
import dto.SalidaDTO;
import dto.SalidaInfoDTO;
import model.Paquete;
import model.Salida;
import org.datacontract.schemas._2004._07.sge_service_contracts.ArrayOfButacaSvc;
import org.datacontract.schemas._2004._07.sge_service_contracts.ButacaSvc;
import org.datacontract.schemas._2004._07.sge_service_contracts.Resultado;
import org.tempuri.BusService;
import org.tempuri.IBusService;
import org.tempuri.IBusServiceObtenerButacasBusServiceFaultFaultFaultMessage;
import org.tempuri.IBusServiceReservarButacasBusServiceFaultFaultFaultMessage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 28/08/2016.
 */
public class ReservarSalidaControlador extends GenericControlador {

    private static final ReservarSalidaControlador INSTANCE = new ReservarSalidaControlador();
    private List<ButacaSvc> butacas;
    private Salida salida;
    private double precio;
    private int base;

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
        this.butacas = arrayOfButacaSvcutacas.getButacaSvc();
        for (ButacaSvc butacaSvc : this.butacas) {
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
        this.salida = Repositorio.getInstance().getSalidaPorId(salidaId);

        SalidaInfoDTO salidaInfoDTO = new SalidaInfoDTO();
        salidaInfoDTO.setBaseSimple(salida.getBaseSimple());
        salidaInfoDTO.setBaseDoble(salida.getBaseDoble());
        salidaInfoDTO.setBaseTriple(salida.getBaseTriple());
        salidaInfoDTO.setBaseCuadruple(salida.getBaseCuadruple());
        salidaInfoDTO.setBaseQuintuple(salida.getBaseQuintuple());

        return salidaInfoDTO;
    }

    public double calcularTotal(int base) {
        this.precio = 0;
        this.base = base;
        if (base == 1) {
            this.precio = this.salida.getBaseSimple();
        } else if (base == 2) {
            this.precio = this.salida.getBaseDoble() * 2;
        } else if (base == 3) {
            this.precio = this.salida.getBaseTriple() * 3;
        } else if (base == 4) {
            this.precio = this.salida.getBaseCuadruple() * 4;
        } else if (base == 5) {
            this.precio = this.salida.getBaseQuintuple() * 5;
        }
        return this.precio;
    }

    public String getButacasDisponibles() throws IBusServiceObtenerButacasBusServiceFaultFaultFaultMessage {

        String butacasMessage = "";
        int unidad = this.salida.getTransporte().getUnidad().getNumero();

        /*BusService client = new BusService();
        IBusService stub = client.getSGEBusService();

        ArrayOfButacaSvc array = stub.obtenerButacas(CODIGO, unidad);
        List<ButacaSvc> butacas = array.getButacaSvc();*/

        for (ButacaSvc butacaSvc : this.butacas) {
            if (!butacaSvc.isOcupada()) {
                if (butacaSvc.getNumero() < 10) {
                    butacasMessage = butacasMessage + "0" + butacaSvc.getNumero() + "     ";
                } else {
                    butacasMessage = butacasMessage + butacaSvc.getNumero() + "     ";
                }
            }
        }

        return butacasMessage;
    }

    public ReservaDTO ReservarSalida(String cliente, List<Integer> butacas) throws IBusServiceReservarButacasBusServiceFaultFaultFaultMessage {
        //armar el array con el formato de la API
        ArrayOfint arrayOfint = new ArrayOfint();
        for (int butaca : butacas) {
            arrayOfint.getInt().add(butaca);
        }

        BusService client = new BusService();
        IBusService stub = client.getSGEBusService();

        Resultado resultado = stub.reservarButacas(CODIGO, this.salida.getTransporte().getUnidad().getNumero(), arrayOfint);

        ReservaDTO reservaDTO;
        if (resultado.isCorrecto()) {
            reservaDTO = new ReservaDTO(true, "La operación de reserva fue exitosa");
            this.guardarPaquete(cliente, butacas);
        } else {
            reservaDTO = new ReservaDTO(false, resultado.getError().getValue());
        }
        return reservaDTO;
    }

    private void guardarPaquete(String cliente, List<Integer> butacas) {

        Paquete p = new Paquete(cliente, butacas, this.base, this.precio);
        this.salida.getPaquetes().add(p);

        System.out.println(p);
        Repositorio.getInstance().getSalidas().add(this.salida);

    }
}
