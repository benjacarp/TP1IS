package model;

import java.util.Date;

/**
 * Created by ASUS on 27/08/2016.
 */
public class Transporte extends Servicio {

    private Ciudad origen;
    private Ciudad destino;
    private Unidad unidad;

    public Transporte(Date inicio, Date fin, Unidad unidad) {
        super(inicio, fin);
        this.unidad = unidad;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }
}
