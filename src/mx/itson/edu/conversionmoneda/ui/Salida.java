/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.edu.conversionmoneda.ui;

import mx.itson.edu.conversionmoneda.config.Moneda;
import mx.itson.edu.conversionmoneda.controller.Conversion;

/**
 *
 * @author DELL
 */
public class Salida {
    //se necesita crear una salida de datos donde se vea lo se le da al cliente
    Conversion conversiones = new Conversion();
    //mostrar cantidad
    public void MostrarCantidad(Moneda moneda) {
        System.out.println("Usted compro: "+conversiones.getCantidad()+" "+moneda+" con el valor de C/U "+conversiones.getPrecioMoneda());
    }
    //generar total
    public void Mostrartotal(){
        System.out.println("por el precio total de"+conversiones.getTotal());
    }
    //genera el cambio
    public void MostrarCambio(){
        System.out.println(conversiones.getCambio());
    }

    public void MostrarResumen(){
        Mostrartotal();
        MostrarCambio();
    }
}
