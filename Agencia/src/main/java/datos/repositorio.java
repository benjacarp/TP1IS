package datos;

import model.*;

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

    /**
     * Aca se hardcodean las salidas que ya he reservado, para no tener
     * que crear una nueva cada vez y así no quedarme sin salidas disponibles
     */
    private void cargarSalidas() {
        Unidad unidad = new Unidad();
        unidad.setNumero(1);
        unidad.setMarca("Ivecco");
        unidad.setTipo("Cama");
        unidad.setDominio("LAO 191");
        unidad.setCantButacas(40);

        Hotel hotel = new Hotel(1, "Le Parc", "San Miguel de Tucumán", 3);

        Transporte transporte = new Transporte(new Date(2016,9,1), new Date(2016,9,8), unidad);
        transporte.setOrigen("Capital");
        transporte.setDestino("San Miguel de Tucumán");
        Alojamiento alojamiento = new Alojamiento(new Date(2016,9,1), new Date(2016,9,7), hotel);

        Salida salida1 = new Salida(transporte, alojamiento);
        salida1.setId(1);
        salida1.setEstado("En Venta");
        salida1.setNombre("Jardín de la república 2016");
        salida1.setCondiciones("Condiciones....");
        salida1.setDescripcion("Un viaje muy picante");

        salida1.setBaseSimple(5000);
        salida1.setBaseDoble(4000);
        salida1.setBaseTriple(3500);
        salida1.setBaseCuadruple(3000);
        salida1.setBaseQuintuple(2800);

        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(6);
        salida1.getPaquetes().add(new Paquete(new Cliente("Juan Sosa",34123456,4347009,"Juan@gmail.com"),list1,2,8000));
        List<Integer> list2 = new ArrayList<>();
        list2.add(7);
        list2.add(8);
        salida1.getPaquetes().add(new Paquete(new Cliente("Ana Maria",34123456,4347009,"Ana@gmail.com"),list2,2,8000));

        this.salidas.add(salida1);

        System.out.println(salida1);
    }

    private void cargarHoteles() {
        hoteles.add(new Hotel(1, "Le Parc"          , "San Miguel de Tucumán", 3));
        hoteles.add(new Hotel(2, "Hilton"           , "San Miguel de Tucumán", 5));
        hoteles.add(new Hotel(3, "Howard Johnson"   , "San Miguel de Tucumán", 4));

        hoteles.add(new Hotel(4, "Almería"          , "Salta", 3));
        hoteles.add(new Hotel(5, "Ankara Suites"    , "Salta", 5));
        hoteles.add(new Hotel(6, "Wilson Hotel"     , "Salta", 4));

        hoteles.add(new Hotel(7, "Apart Urbanus"            , "San Fernando del Valle de Catamarca", 3));
        hoteles.add(new Hotel(8, "Hotel Arenales"           , "San Fernando del Valle de Catamarca", 5));
        hoteles.add(new Hotel(9, "Grand Hotel"              , "San Fernando del Valle de Catamarca", 4));

        hoteles.add(new Hotel(10, "Hotel Altos del Estero"  , "Santiago del Estero", 3));
        hoteles.add(new Hotel(11, "Hotel Carlos V"          , "Santiago del Estero", 5));
        hoteles.add(new Hotel(12, "Hotel Savoy"             , "Santiago del Estero", 4));

        hoteles.add(new Hotel(13, "Posada El Arribo"    , "San Salvador de Jujuy", 3));
        hoteles.add(new Hotel(14, "Fenicia"             , "San Salvador de Jujuy", 5));
        hoteles.add(new Hotel(15, "Hotel Augustus"      , "San Salvador de Jujuy", 4));
    }

    public List<Hotel> buscarHotelesPorCiudad(String nombreDeCiudad) {

        List<Hotel> hoteles = new ArrayList<>();
        for (Hotel hotel : this.hoteles) {
            if (hotel.getCiudad().equals(nombreDeCiudad)) {
                hoteles.add(hotel);
            }
        }
        return hoteles;
    }

    public List<Salida> getSalidas() {
        return salidas;
    }

    public Salida getSalidaPorId(int id) {

        for (Salida salida : this.salidas) {
            if (salida.getId() == id) {
                return salida;
            }
        }
        return null;
    }

    public void guardarSalida(Salida salida) {
        int id = 0;
        for (Salida salidaDB : this.salidas){
            id++;
        }
        salida.setId(++id);
        this.salidas.add(salida);
        System.out.println("Salida creada: ");
        System.out.println(salida);
    }

    public Hotel getHotelPorId(int id) {
        for (Hotel hotel : this.hoteles) {
            if (id == hotel.getId()) {
                return hotel;
            }
        }
        return null;
    }
}
