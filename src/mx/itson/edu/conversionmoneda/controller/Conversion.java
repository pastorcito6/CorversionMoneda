package mx.itson.edu.conversionmoneda.controller;

import mx.itson.edu.conversionmoneda.service.Artimetica;
import mx.itson.edu.conversionmoneda.user.Cliente;

public class Conversion {
    double precioMoneda;
    double cantidad;
    double total;
    double cambio;
    //Paso la prueba
    public double getPrecioMoneda() {
        return precioMoneda;
    }

    public void setPrecioMoneda(double precioMoneda) {
        System.out.println("precioMoneda: "+precioMoneda);
        this.precioMoneda = precioMoneda;
    }

    //
    public double getCantidad() {

        return cantidad;
    }
    //
    public void setCantidad( double dinero, double precio) {
        if (getPrecioMoneda() == 0) {
            throw new ArithmeticException("Error: No se puede dividir entre cero");
        }
        cantidad = Artimetica.DIVIDIR.calcular(dinero, precio);
        System.out.println("setCantidad: " + cantidad);
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
