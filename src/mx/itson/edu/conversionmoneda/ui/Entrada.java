package mx.itson.edu.conversionmoneda.ui;

import mx.itson.edu.conversionmoneda.config.Menu;

import mx.itson.edu.conversionmoneda.controller.Conversion;
import mx.itson.edu.conversionmoneda.user.Cliente;

import java.util.Scanner;

public class Entrada {
    Scanner sc = new Scanner(System.in);
    Cliente clientes = new Cliente();
    Conversion conversiones = new Conversion();
    Menu menu = new Menu();
    //verificar dinero
    public void EntradaDinero() {
        Banner();
        System.out.println("Ingrese su dinero:");
        double valorDinero = sc.nextDouble();
        clientes.setDinero(valorDinero);
        System.out.println("salio bien");
        EntradaMoneda();
    }
    //elige la moneda
    public void EntradaMoneda() {
        System.out.println("Ingrese la moneda que desea comprar:\n[1] Dollar\n[2] Euro\n[3]Mexicano");
        //selecciona 1
        menu.MenuOpciones(sc.nextInt());
    }
    //genera el precio de moneda elegida
    public void EntradaCambioMoneda(double precio) {
        conversiones.setPrecioMoneda(precio);
        conversiones.setCantidad();
    }
    //genera el total
    public void Entradatotal(){
        conversiones.setTotal();
    }
    //genera el cambio
    public void EntradaCambio(){
        conversiones.setCambio(clientes.getDinero());
    }
    //banner app
    public void Banner(){
        System.out.println("" +
                "#     #                                    #     # #     # ######  \n" +
                "##   ##  ####  #    # ###### #   #         #     # #     # #     # \n" +
                "# # # # #    # ##   # #       # #          #     # #     # #     # \n" +
                "#  #  # #    # # #  # #####    #           ####### #     # ######  \n" +
                "#     # #    # #  # # #        #           #     # #     # #     # \n" +
                "#     # #    # #   ## #        #           #     # #     # #     # \n" +
                "#     #  ####  #    # ######   #           #     #  #####  ######  \n" +
                "                                   #######            ");
    }
}
