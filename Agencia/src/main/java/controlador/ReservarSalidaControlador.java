package controlador;

import datos.Repositorio;
import dto.SalidaDTO;
import model.Salida;

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
}
