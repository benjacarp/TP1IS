package dto;

/**
 * Created by ASUS on 28/08/2016.
 */
public class SalidaDTO {

    private int id;
    private String nombre;

    public SalidaDTO() {
    }

    public SalidaDTO(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Salida " + id + ": " + nombre;
    }
}
