package model;

import java.util.Date;

/**
 * Created by ASUS on 27/08/2016.
 */
public abstract class Servicio {

    private Date inicio;
    private Date fin;

    public Servicio(Date inicio, Date fin) {
        this.inicio = inicio;
        this.fin = fin;
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
}
