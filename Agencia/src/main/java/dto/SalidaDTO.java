package dto;

/**
 * Created by ASUS on 28/08/2016.
 */
public class SalidaDTO {

    private int id;

    //datos
    private String nombre;
    private String condiciones;
    private String descripcion;
    private String itinerario;
    private CiudadDTO origen;

    // precios de las bases
    private double baseSimple;
    private double baseDoble;
    private double baseTriple;
    private double baseCuadruple;
    private double baseQuintuple;

    private AlojamientoDTO alojamiento;
    private TransporteDTO transporte;

    public SalidaDTO() {
    }

    public SalidaDTO(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public CiudadDTO getOrigen() {
        return origen;
    }

    public void setOrigen(CiudadDTO origen) {
        this.origen = origen;
    }

    public double getBaseSimple() {
        return baseSimple;
    }

    public void setBaseSimple(double baseSimple) {
        this.baseSimple = baseSimple;
    }

    public double getBaseDoble() {
        return baseDoble;
    }

    public void setBaseDoble(double baseDoble) {
        this.baseDoble = baseDoble;
    }

    public double getBaseTriple() {
        return baseTriple;
    }

    public void setBaseTriple(double baseTriple) {
        this.baseTriple = baseTriple;
    }

    public double getBaseCuadruple() {
        return baseCuadruple;
    }

    public void setBaseCuadruple(double baseCuadruple) {
        this.baseCuadruple = baseCuadruple;
    }

    public double getBaseQuintuple() {
        return baseQuintuple;
    }

    public void setBaseQuintuple(double baseQuintuple) {
        this.baseQuintuple = baseQuintuple;
    }

    public AlojamientoDTO getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(AlojamientoDTO alojamiento) {
        this.alojamiento = alojamiento;
    }

    public TransporteDTO getTransporte() {
        return transporte;
    }

    public void setTransporte(TransporteDTO transporte) {
        this.transporte = transporte;
    }

    public String getItinerario() {
        return itinerario;
    }

    public void setItinerario(String itinerario) {
        this.itinerario = itinerario;
    }

    @Override
    public String toString() {
        return "Salida " + id + ": " + nombre;
    }
}
