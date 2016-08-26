package presentador;

import vista.CrearSalidaStage;
import vista.MenuPricipalStage;

/**
 * Created by ASUS on 25/08/2016.
 */
public class CrearSalidaPresentador {

    private CrearSalidaStage stage;

    public CrearSalidaPresentador(int largo, int ancho) {
        this.stage = new CrearSalidaStage(largo, ancho);
        this.setActions();
        this.stage.show();
    }

    private void setActions() {

    }

}
