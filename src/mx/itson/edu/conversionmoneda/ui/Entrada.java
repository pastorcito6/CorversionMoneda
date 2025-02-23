package mx.itson.edu.conversionmoneda.ui;

import mx.itson.edu.conversionmoneda.user.Cliente;

import java.util.Scanner;

public class Entrada extends Cliente {
    Scanner sc = new Scanner(System.in);

    //
    public void EntradaDinero() {
        System.out.println("Ingrese su dinero:");
        setCantidad(sc.nextDouble());
    }
    public void EntradaMoneda() {
     //
        System.out.println("Ingrese su moneda:\n[1] Dollar\n[2] Euro\n[3]Mexicano");
    }
}
