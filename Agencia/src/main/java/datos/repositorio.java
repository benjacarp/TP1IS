package datos;

import model.Alojamiento;
import model.Ciudad;
import model.Hotel;
import model.Salida;
import model.Transporte;
import model.Unidad;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ASUS on 27/08/2016.
 */
public class Repositorio {

    private static final Repositorio INSTANCE = new Repositorio();
    private List<Hotel> hoteles = new ArrayList<>();
    private List<Salida> salidas = new ArrayList<>();

    private Repositorio() {
    }

    public static Repositorio getInstance() {
        return INSTANCE;
    }

    public void cargarDatos() {
        cargarHoteles();
        cargarSalidas();
    }

    private void cargarSalidas() {

        Unidad unidad = new Unidad();
        Ciudad tucuman = new Ciudad("San Miguel de Tucumán", "Tucumán", "Argentina");
        Hotel hotel = new Hotel(1, "Le Parc", tucuman, 3);

        Transporte transporte = new Transporte(new Date(2016,9,1), new Date(2016,9,8), unidad);
        Alojamiento alojamiento = new Alojamiento(new Date(2016,9,1), new Date(2016,9,8), hotel);

        Salida salida1 = new Salida(1, transporte, alojamiento);
        salida1.setEstado("En Venta");
        salida1.setNombre("Jardín de la república 2016");
        salida1.setCondiciones("Condiciones....");
        salida1.setDescripcion("Un viaje muy picante");

        System.out.println(salida1);
    }

    private void cargarHoteles() {
        Ciudad tucuman = new Ciudad("San Miguel de Tucumán", "Tucumán", "Argentina");
        hoteles.add(new Hotel(1, "Le Parc"          , tucuman, 3));
        hoteles.add(new Hotel(2, "Hilton"           , tucuman, 5));
        hoteles.add(new Hotel(3, "Howard Johnson"   , tucuman, 4));

        Ciudad salta = new Ciudad("Salta", "Salta", "Argentina");
        hoteles.add(new Hotel(4, "Le Parc"          , tucuman, 3));
        hoteles.add(new Hotel(5, "Hilton"           , tucuman, 5));
        hoteles.add(new Hotel(6, "Howard Johnson"   , tucuman, 4));
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
