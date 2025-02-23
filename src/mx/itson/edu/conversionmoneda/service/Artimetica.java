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
            double cambio = total - dinero; //120 - 130 = 10

            return cambio;//10
        }
    },
    MULTIPLICAR {
        @Override
        public double calcular(double moneda, double cantidad) {
            double total = moneda * cantidad ;//20 * 6 = 120
            //obtener total de precio de moneda
            return total;//120
        }
    },
    DIVIDIR {
        @Override
        public double calcular(double moneda, double dinero) {
            //operacion para obtener la cantidad que me alcanza
            double cantidad = moneda / dinero; //
//          //obtiene la cantidad de moneda que me alcanza
            return cantidad;
        }
    }
    ;

    public abstract double calcular(double a, double b);//metodo abstracto
}
