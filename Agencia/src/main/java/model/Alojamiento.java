package model;

import java.util.Date;

/**
 * Created by ASUS on 27/08/2016.
 */
public class Alojamiento extends Servicio {

    private Hotel hotel;

    public Alojamiento(Date inicio, Date fin, Hotel hotel) {
        super(inicio, fin);
        this.hotel = hotel;
    }

    public Hotel getHotel() {
        return hotel;
    }
}
