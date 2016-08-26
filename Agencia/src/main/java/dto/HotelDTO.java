package dto;

/**
 * Created by ASUS on 26/08/2016.
 */
public class HotelDTO {

    private String nombre;
    private int estrellas;

    public HotelDTO() {
    }

    public HotelDTO(int estrellas, String nombre) {
        this.estrellas = estrellas;
        this.nombre = nombre;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "" + nombre + " (" + estrellas + " estrellas)";
    }
}
