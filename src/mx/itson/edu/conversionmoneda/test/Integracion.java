package mx.itson.edu.conversionmoneda.test;

import mx.itson.edu.conversionmoneda.ui.Entrada;

public class Integracion {
    Entrada entrada = new Entrada();

    public void IniciarConversion() {
        try {
            entrada.EntradaMoneda();
        }
        catch (Exception e) {
            System.out.println("Elige opcion valida");
            IniciarConversion();
        }
    }
}
