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
            return a * b;
        }
    },
    DIVIDIR {
        @Override
        public double calcular(double a, double b) {
            if (b == 0) {
                throw new ArithmeticException("No se puede dividir por cero");
            }
            double resultado = a/b;
            return resultado;
        }
    };

    public abstract double calcular(double a, double b);//metodo abstracto
}
