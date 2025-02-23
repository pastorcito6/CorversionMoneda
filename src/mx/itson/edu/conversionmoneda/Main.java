package mx.itson.edu.conversionmoneda;

import mx.itson.edu.conversionmoneda.config.Moneda;
import mx.itson.edu.conversionmoneda.controller.Conversion;
import mx.itson.edu.conversionmoneda.test.Integracion;
import mx.itson.edu.conversionmoneda.ui.Entrada;
import mx.itson.edu.conversionmoneda.ui.Salida;
import mx.itson.edu.conversionmoneda.user.Cliente;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integracion integracion = new Integracion();
        integracion.IniciarConversion();
    }
    
}
