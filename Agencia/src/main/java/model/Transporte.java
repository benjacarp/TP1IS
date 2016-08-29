package model;

import java.util.Date;

/**
 * Created by ASUS on 27/08/2016.
 */
public class Transporte extends Servicio {

    private String origen;
    private String destino;
    private Unidad unidad;

    public Transporte(Date inicio, Date fin, Unidad unidad) {
        super(inicio, fin);
        this.unidad = unidad;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "Transporte{" +
                "origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", unidad=" + unidad +
                '}';
    }
}
