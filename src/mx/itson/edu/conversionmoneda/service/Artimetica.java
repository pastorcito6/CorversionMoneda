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
        public double calcular(double a, double b) {
            return a - b;
        }
    },
    MULTIPLICAR {
        @Override
        public double calcular(double a, double b) {
            return Math.floor((a*b *100)/100);
        }
    },
    DIVIDIR {
        @Override
        public double calcular(double a, double b) {
            return Math.floor((a/b *100)/100);
        }
    };

    public abstract double calcular(double a, double b);
}
