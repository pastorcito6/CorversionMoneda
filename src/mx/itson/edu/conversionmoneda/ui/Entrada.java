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
        try {
            Banner();
            System.out.println("Ingrese el dinero su dinero mayor a 22 MX");
            double dinero = sc.nextDouble();
            if (dinero >22){
                clientes.setDinero(dinero);
            }
            else{
                EntradaDinero();
            }
        }
        catch (Exception e) {
            System.out.println("Ingrese dinero solamente");
        }
    }
    //elige la moneda
    public void EntradaMoneda() {
        System.out.println("Ingrese la moneda que desea comprar:\n[1] Dollar\n[2] Euro\n[3] Dinar Kuwaiti");
        menu.MenuOpciones(sc.nextInt());
    }
    //genera el precio de moneda elegida
    public void EntradaCambioMoneda(double precioMoneda) {
        Banner();
        conversiones.setPrecioMoneda(precioMoneda);
        EntradaDinero();
        conversiones.setCantidad(clientes.getDinero());
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
        System.out.println("""
                #     #                                    #     # #     # ###### \s
                ##   ##  ####  #    # ###### #   #         #     # #     # #     #\s
                # # # # #    # ##   # #       # #          #     # #     # #     #\s
                #  #  # #    # # #  # #####    #           ####### #     # ###### \s
                #     # #    # #  # # #        #           #     # #     # #     #\s
                #     # #    # #   ## #        #           #     # #     # #     #\s
                #     #  ####  #    # ######   #           #     #  #####  ###### \s
                                                   #######           \s""");
    }
}
