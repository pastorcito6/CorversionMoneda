package mx.itson.edu.conversionmoneda.service;

public enum Artimetica {
    SUMAR {
        @Override
        public double calcular(double a, double b) {
            return a + b;
        }
    },
    RESTAR {
        @Override
        public double calcular(double total, double dinero) {
            return total - dinero;
        }
    },
    MULTIPLICAR {
        @Override
        public double calcular(double moneda, double cantidad) {
            return moneda * cantidad;//120
        }
    },
    DIVIDIR {
        @Override
        public double calcular(double moneda, double dinero) {
            return moneda / dinero;
        }
    }
    ;

    public abstract double calcular(double a, double b);//metodo abstracto
}
