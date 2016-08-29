package dto;

import java.util.Date;

/**
 * Created by ASUS on 28/08/2016.
 */
public class TransporteDTO {

    private Date inicio;
    private Date fin;
    private UnidadDTO unidad;
    private String origen;
    private String destino;

    public TransporteDTO(Date inicio, Date fin, UnidadDTO unidad) {
        this.inicio = inicio;
        this.fin = fin;
        this.unidad = unidad;
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

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public UnidadDTO getUnidad() {
        return unidad;
    }

    public void setUnidad(UnidadDTO unidad) {
        this.unidad = unidad;
    }
}
