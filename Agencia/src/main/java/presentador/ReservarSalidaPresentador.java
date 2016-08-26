package presentador;

import vista.ReservarSalidaStage;

/**
 * Created by ASUS on 26/08/2016.
 */
public class ReservarSalidaPresentador {

    private ReservarSalidaStage stage;

    public ReservarSalidaPresentador(int largo, int ancho) {
        this.stage = new ReservarSalidaStage(largo, ancho);
        this.setActions();
        this.stage.show();
    }

    private void setActions() {

    }

}
