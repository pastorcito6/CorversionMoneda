package conversionmoneda;

public class Cliente {
    private double cantidad;
    private Moneda tipoMoneda;

    public Cliente(double cantidad, Moneda tipoMoneda) {
        this.cantidad = cantidad;
        this.tipoMoneda = tipoMoneda;
    }

    public Moneda getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(Moneda tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
}
