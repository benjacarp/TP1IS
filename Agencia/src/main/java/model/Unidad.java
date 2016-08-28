package model;

/**
 * Esta clase tiene los mismos datos que la unidad de la API, pero no uso la de ellos por si la cambian.
 *
 * Created by ASUS on 27/08/2016.
 */
public class Unidad {

    private int numero;
    private int cantButacas;
    private String dominio;
    private String marca;
    private String tipo;

    public Unidad() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCantButacas() {
        return cantButacas;
    }

    public void setCantButacas(int cantButacas) {
        this.cantButacas = cantButacas;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
