package conversionmoneda;

public enum OperacionConversion {
    CANTIDAD {
        @Override
        public double calcular(double moneda, double dinero) {
            double cantidad = OperacionAritmetica.DIVIDIR.calcular(moneda, dinero);

            return cantidad;
        }

    },
    //falta
    TOTAL{
        @Override
        public double calcular(double moneda, double cantidad) {
            double total = OperacionAritmetica.MULTIPLICAR.calcular(moneda, cantidad);
            return total;
        }
    }
    ;
    public abstract double calcular(double a, double b);

    }
