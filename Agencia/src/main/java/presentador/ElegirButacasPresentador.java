package presentador;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import controlador.ReservarSalidaControlador;
import org.tempuri.IBusServiceObtenerButacasBusServiceFaultFaultFaultMessage;
import vista.ElegirButacasVista;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 28/08/2016.
 */
public class ElegirButacasPresentador {

    private ElegirButacasVista stage;
    private ReservarSalidaPresentador parent;

    public ElegirButacasPresentador(int base, int largo, int ancho, ReservarSalidaPresentador parent) {
        this.parent = parent;
        String butacas = null;
        try {
            butacas = ReservarSalidaControlador.getInstance().getButacasDisponibles();
            this.stage = new ElegirButacasVista(base, largo, ancho, butacas);
            this.setActions();
            this.stage.show();
        } catch (IBusServiceObtenerButacasBusServiceFaultFaultFaultMessage e) {
            e.printStackTrace();
        }
    }

    private void setActions() {
        this.stage.getButtonConfirmar().setOnAction(event -> confirmarClick());

    }

    private void confirmarClick() {

        List<Integer> arrayOfint = new ArrayList<>();
        if (this.stage.getPrimerTF().isVisible()) {
            arrayOfint.add(Integer.valueOf(this.stage.getPrimerTF().getText()));
        }
        if (this.stage.getSegundoTF().isVisible()) {
            arrayOfint.add(Integer.valueOf(this.stage.getSegundoTF().getText()));
        }
        if (this.stage.getTercerTF().isVisible()) {
            arrayOfint.add(Integer.valueOf(this.stage.getTercerTF().getText()));
        }
        if (this.stage.getCuartoTF().isVisible()) {
            arrayOfint.add(Integer.valueOf(this.stage.getCuartoTF().getText()));
        }
        if (this.stage.getQuintoTF().isVisible()) {
            arrayOfint.add(Integer.valueOf(this.stage.getQuintoTF().getText()));
        }

        parent.setButacas(arrayOfint);
        this.stage.close();
        this.parent.actualizarButacas();
    }
}
