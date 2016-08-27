package datos;

import model.Hotel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 27/08/2016.
 */
public class Repositorio {

    private static final Repositorio INSTANCE = new Repositorio();
    private List<Hotel> hoteles = new ArrayList<>();

    private Repositorio() {
    }

    public static Repositorio getInstance() {
        return INSTANCE;
    }

    public void cargarDatos() {
        hoteles.add(new Hotel("Le Parc", "San Miguel de Tucumán", 3));
        hoteles.add(new Hotel("Hilton", "San Miguel de Tucumán", 5));
        hoteles.add(new Hotel("Howard Johnson", "San Miguel de Tucumán", 4));
    }

    public List<Hotel> buscarHotelesPorCiudad(String codigoDeCiudad) {

        List<Hotel> hoteles = new ArrayList<>();
        for (Hotel hotel : this.hoteles) {
            if (hotel.getCiudad().equals(codigoDeCiudad)) {
                hoteles.add(hotel);
            }
        }
        return hoteles;
    }

}
