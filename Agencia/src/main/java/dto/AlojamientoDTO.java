package dto;

import java.util.Date;

/**
 * Created by ASUS on 28/08/2016.
 */
public class AlojamientoDTO {

    private Date inicio;
    private Date fin;
    private HotelDTO hotel;

    public AlojamientoDTO(Date inicio, Date fin, HotelDTO hotel) {
        this.inicio = inicio;
        this.fin = fin;
        this.hotel = hotel;
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

    public HotelDTO getHotel() {
        return hotel;
    }

    public void setHotel(HotelDTO hotel) {
        this.hotel = hotel;
    }
}
