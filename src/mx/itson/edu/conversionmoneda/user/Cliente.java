package mx.itson.edu.conversionmoneda.user;

public class Cliente {
    private double dinero;

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        System.out.println("dinero del cliente: "+dinero);
        this.dinero = dinero;
    }
}
