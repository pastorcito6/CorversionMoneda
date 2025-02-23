package mx.itson.edu.conversionmoneda.config;

import mx.itson.edu.conversionmoneda.ui.Entrada;
import mx.itson.edu.conversionmoneda.ui.Salida;

public class Menu {
    public void MenuOpciones(int opcion) {
        Entrada entrada = new Entrada();
        Salida salida = new Salida();
        switch(opcion) {
            case 1:
                // Dollar
                Moneda moneda1 = Moneda.DO;
                //Se toma el valor del dolar
                entrada.EntradaCambioMoneda(moneda1.getvalor());
                entrada.Entradatotal();
                entrada.EntradaCambio();
                salida.MostrarCantidad(moneda1);
//                salida.MostrarResumen();
                break;
            case 2:
                // Euro
//                Moneda moneda2 = Moneda.EU;
//                entrada.EntradaCambioMoneda(moneda2.getvalor());
//                salida.MostrarCantidad(moneda2);
//                salida.MostrarResumen();

                break;
            case 3:
                // Mexicano
//                Moneda moneda3 = Moneda.MX;
//                entrada.EntradaCambioMoneda(moneda3.getvalor());
//                salida.MostrarCantidad(moneda3);
//                salida.MostrarResumen();
                break;
            default:
                // code block
        }
    }
}
