package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 28/08/2016.
 */
public class Paquete {

    private String cliente;
    private List<Integer> butacas = new ArrayList<>();
    private int base;
    private double total;

    public Paquete(String cliente, List<Integer> butacas, int base, double total) {
        this.cliente = cliente;
        this.butacas = butacas;
        this.base = base;
        this.total = total;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Integer> getButacas() {
        return butacas;
    }

    public void setButacas(List<Integer> butacas) {
        this.butacas = butacas;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "cliente='" + cliente + '\'' +
                ", butacas=" + butacas +
                ", base=" + base +
                ", total=" + total +
                '}';
    }
}
