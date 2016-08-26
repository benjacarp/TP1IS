package dto;

/**
 * Created by ASUS on 26/08/2016.
 */
public class UnidadDTO {

    private int cantidadButacas;
    private String dominio;
    private String marca;
    private int numero;
    private String tipo;

    public UnidadDTO() {
    }

    public int getCantidadButacas() {
        return cantidadButacas;
    }

    public void setCantidadButacas(int cantidadButacas) {
        this.cantidadButacas = cantidadButacas;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "(" + numero + ") " + marca + " " + tipo + ", dominio: " + dominio + ". Butacas: " + cantidadButacas;
    }
}
