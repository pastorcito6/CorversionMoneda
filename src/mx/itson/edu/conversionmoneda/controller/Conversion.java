package mx.itson.edu.conversionmoneda.controller;

import mx.itson.edu.conversionmoneda.service.Artimetica;

public class Conversion {
    double precioMoneda;
    int cantidad;
    double total;
    double cambio;
    //Paso la prueba
    public double getPrecioMoneda() {
        return precioMoneda;
    }

    public void setPrecioMoneda(double precioMoneda) {
        this.precioMoneda = precioMoneda;
    }

    //
    public int getCantidad() {

        return cantidad;
    }
    //
    public void setCantidad( double dinero) {
        cantidad = (int) Math.floor(Artimetica.DIVIDIR.calcular(dinero, getPrecioMoneda()));
    }

    public double getTotal() {
        return total;
    }

    public void setTotal() {
        total = Artimetica.MULTIPLICAR.calcular(getPrecioMoneda(),getCantidad());

    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double dinero) {
        cambio = Artimetica.RESTAR.calcular(dinero,getTotal());
    }
}
