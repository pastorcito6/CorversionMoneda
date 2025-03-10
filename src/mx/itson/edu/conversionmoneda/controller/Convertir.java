package mx.itson.edu.conversionmoneda.controller;


import mx.itson.edu.conversionmoneda.service.Artimetica;
import mx.itson.edu.conversionmoneda.ui.Entrada;

public class Convertir {
    Entrada entrada;
    private double cantidad;
    private double total;
    private double cambio;

    public Convertir(Entrada entrada) {
        this.entrada = entrada;
        convertirDinero();
    }

    public void convertirDinero() {
        double precio = entrada.getMoneda().getvalor();
        cantidad = Artimetica.DIVIDIR.calcular((int) entrada.getCliente().getDinero(), precio);
        total = Artimetica.MULTIPLICAR.calcular(cantidad, precio);
        cambio = Artimetica.RESTAR.calcular(entrada.getCliente().getDinero(), total);
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return total;
    }

    public double getCambio() {
        return cambio;
    }
}
