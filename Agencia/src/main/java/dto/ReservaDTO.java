package dto;

/**
 * Created by ASUS on 28/08/2016.
 */
public class ReservaDTO {

    private boolean exito;
    private String descripcion;

    public ReservaDTO(boolean exito, String descripcion) {
        this.exito = exito;
        this.descripcion = descripcion;
    }

    public boolean isExito() {
        return exito;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
