package mx.itson.edu.conversionmoneda.ui;

import mx.itson.edu.conversionmoneda.config.Moneda;
import mx.itson.edu.conversionmoneda.controller.Conversion;

/**
 *
 * @author DELL
 */
public class Salida {
    Conversion conversiones = new Conversion();
    //mostrar cantidad
    public void MostrarCantidad(Moneda moneda) {
        System.out.println("Conversion de: "+moneda);
    }
    //generar total
    public void Mostrartotal(){
        System.out.println("test: "+conversiones.getTotal());
    }
    //genera el cambio

}
