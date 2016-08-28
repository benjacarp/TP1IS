package model;

import java.util.Date;
import java.util.List;

/**
 * Created by ASUS on 27/08/2016.
 */
public class Salida {

    private int id;
    private String estado;  //hacer enum despues

    //datos
    private String nombre;
    private String condiciones;
    private String descripcion;
    private int dias;
    private int noches;
    private Ciudad origen;

    private Alojamiento alojamiento;
    private Transporte transporte;

    public Salida(int id,Transporte transporte, Alojamiento alojamiento) {
        this.id = id;
        this.transporte = transporte;
        this.alojamiento = alojamiento;
        this.dias = calcularDias();
        this.noches = calcularNoches();
        this.origen = this.transporte.getOrigen();
    }

    private int calcularNoches() {
        int inicio = this.alojamiento.getInicio().getDate();
        int fin = this.alojamiento.getFin().getDate();
        return fin - inicio;
    }

    private int calcularDias() {
        int inicio = this.transporte.getInicio().getDate();
        int fin = this.transporte.getFin().getDate();
        return fin - inicio;
    }

    public int getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDias() {
        return dias;
    }

    public int getNoches() {
        return noches;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    @Override
    public String toString() {
        return "Salida{" +
                "id=" + id +
                ", estado='" + estado + '\'' +
                ", nombre='" + nombre + '\'' +
                ", condiciones='" + condiciones + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", dias=" + dias +
                ", noches=" + noches +
                ", origen=" + origen +
                ", alojamiento=" + alojamiento +
                ", transporte=" + transporte +
                '}';
    }
}