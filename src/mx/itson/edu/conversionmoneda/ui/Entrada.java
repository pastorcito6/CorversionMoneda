package mx.itson.edu.conversionmoneda.ui;

import mx.itson.edu.conversionmoneda.user.Cliente;

import java.util.Scanner;

public class Entrada extends Cliente {
    Scanner sc = new Scanner(System.in);

    //
    public void EntradaDinero() {
        System.out.println("Verificar dinero:");
        setCantidad(sc.nextDouble());
    }
    public void EntradaMoneda() {
        System.out.println("Verificar moneda:\n[1] Dollar\n[2] Euro\n");
    }
}
