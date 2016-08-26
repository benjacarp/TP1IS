package presentador;

import vista.MenuPricipalStage;

/**
 * Created by ASUS on 25/08/2016.
 */
public class MenuPrincipalPresentador {

    private MenuPricipalStage stage;

    public MenuPrincipalPresentador(int largo, int ancho) {
        this.stage = new MenuPricipalStage(largo, ancho);
        this.setActions();
        this.stage.show();
    }

    private void setActions() {
        this.stage.getItemCrearSalida().setOnAction(e -> itemCrearSalida_Click());
        this.stage.getItemReservarSalida().setOnAction(e -> itemReservarSalida_Click());
    }
    private void itemReservarSalida_Click() {
        System.out.println("Reservar salida");
        new ReservarSalidaPresentador(250,200);
    }

    private void itemCrearSalida_Click() {
        System.out.println("Crear salida");
        new CrearSalidaPresentador(500,550);
    }
}
