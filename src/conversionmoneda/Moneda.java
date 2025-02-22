package conversionmoneda;

public enum Moneda {
    DO(20.44), EU(21.36), MX(20);

    private double valor;

    Moneda(double valor) {
        this.valor = valor;

    }
    public double getvalor() {
    return valor;

    }
}
