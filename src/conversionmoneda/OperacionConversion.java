package conversionmoneda;

public enum OperacionConversion {
    CANTIDAD {
        @Override
        public double calcular(double a, double b) {
            return 0;
        }

    };
    public abstract double calcular(double a, double b);

    }
