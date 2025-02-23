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
        System.out.println("el precio de la moneda es: "+precioMoneda);
        this.precioMoneda = precioMoneda;
    }

    //
    public double getCantidad() {

        return cantidad;
    }
    //
    public void setCantidad( double dineroCliente) {
        cantidad = (int) Math.round(Artimetica.DIVIDIR.calcular(dineroCliente, getPrecioMoneda()));
        System.out.println("Resultado division: "+cantidad);
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

    public void setCambio(double dineroCliente) {
        cambio = Artimetica.RESTAR.calcular(dineroCliente,getTotal());
    }
}
