package model;

/**
 * Created by ASUS on 27/08/2016.
 */
public class Hotel {

    private String nombre;
    private Ciudad ciudad;
    private int estrellas;
    private int id;

    public Hotel() {
    }

    public Hotel(int id, String nombre, Ciudad ciudad, int estrellas) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estrellas = estrellas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
