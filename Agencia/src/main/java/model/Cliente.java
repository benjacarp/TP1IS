package model;

/**
 * Created by ASUS on 28/08/2016.
 */
public class Cliente {

    private String nombre;
    private int dni;
    private int telefono;
    private String mail;

    public Cliente(String nombre, int dni, int telefono, String mail) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getMail() {
        return mail;
    }
}
