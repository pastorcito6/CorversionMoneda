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
    Conversion[] conversion = new Conversion[0];
    //mostrar cantidad
    public void MostrarCantidad(Moneda moneda) {
        System.out.println("Usted compro: "+conversion[0].getCantidad()+" "+moneda+" con el valor de C/U "+conversion[0].getPrecioMoneda());
    }
    //generar total
    public void Mostrartotal(){
        System.out.println("por el precio total de"+conversion[0].getTotal());
    }
    //genera el cambio
    public void MostrarCambio(){
        System.out.println(conversion[0].getCambio());
    }

    public void MostrarResumen(){
        Mostrartotal();
        MostrarCambio();
    }
}
