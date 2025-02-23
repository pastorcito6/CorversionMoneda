package mx.itson.edu.conversionmoneda.controller;

import mx.itson.edu.conversionmoneda.service.Artimetica;

public class Conversion {
    double precioMoneda;
    double cantidad;
    double total;
    double cambio;
    //
    public double getPrecioMoneda() {
        return precioMoneda;
    }

    public void setPrecioMoneda(double precioMoneda) {
        this.precioMoneda = precioMoneda;
    }

    //
    public double getCantidad() {

        return cantidad;
    }
    //
    public void setCantidad() {
        cantidad = Artimetica.DIVIDIR.calcular(getPrecioMoneda(),getPrecioMoneda());
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
        cambio = Artimetica.RESTAR.calcular(getTotal(),dinero);
    }
}
