package dto;

/**
 * Created by ASUS on 26/08/2016.
 */
public class HotelDTO {

    private int id;
    private String nombre;
    private int estrellas;

    public HotelDTO() {
    }

    public HotelDTO(int id, String nombre, int estrellas) {
        this.id = id;
        this.nombre = nombre;
        this.estrellas = estrellas;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "" + nombre + " (" + estrellas + " estrellas)";
    }
}
