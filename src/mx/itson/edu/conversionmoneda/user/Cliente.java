package mx.itson.edu.conversionmoneda.user;

import mx.itson.edu.conversionmoneda.config.Moneda;

public abstract class Cliente {
    private double cantidad;
    private Moneda tipoMoneda;
    //
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
