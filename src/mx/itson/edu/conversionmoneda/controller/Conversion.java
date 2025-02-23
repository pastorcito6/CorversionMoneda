package mx.itson.edu.conversionmoneda.controller;


import mx.itson.edu.conversionmoneda.service.Artimetica;

public enum Conversion {
    CANTIDAD {
        @Override
        public double calcular(double moneda, double dinero) {
            double cantidad = Artimetica.DIVIDIR.calcular(moneda, dinero);
            return cantidad;
        }

    },
    //falta
    ;
    public abstract double calcular(double a, double b);

    }
