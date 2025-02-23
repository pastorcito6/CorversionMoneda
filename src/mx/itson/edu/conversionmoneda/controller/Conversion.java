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

    //Paso
    public int getCantidad() {

        return cantidad;
    }
    //Paso
    public void setCantidad( double dineroCliente) {
        //paso
        cantidad = (int) Math.floor(Artimetica.DIVIDIR.calcular(dineroCliente, getPrecioMoneda()));
        System.out.println("Resultado division: "+cantidad);
    }

    public double getTotal() {
        return total;
    }

    public void setTotal() {
        //paso
        total = Artimetica.MULTIPLICAR.calcular(getPrecioMoneda(),getCantidad());
        total = Math.round(total);
        System.out.println("Resultado multiplicacion: "+total);
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double dineroCliente) {
        cambio = Artimetica.RESTAR.calcular(dineroCliente,getTotal());
        cambio = Math.round(cambio);
        System.out.println("Resultado restar: "+cambio);
    }
}
