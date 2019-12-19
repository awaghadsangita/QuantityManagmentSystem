package com.bridgelabz.quantitymeasurement;

public enum WeightConverterEnum implements IUnitConversion {
    GRAM_TO_KILOGRAM{
        @Override
        public double convert(double value) {
            return value * GRAM_KILOGRAM_MULTIPLIER;
        }
    }, KILOGRAM_TO_KILOGRAM{
        @Override
        public double convert(double value) {
            return value;
        }
    }, TONNE_TO_KILOGRAM{
        @Override
        public double convert(double value) {
            return value*TONNE_TO_KILOGRAM_MULTIPLIER;
        }
    };
    private static final double GRAM_KILOGRAM_MULTIPLIER =0.001 ;
    private static final double TONNE_TO_KILOGRAM_MULTIPLIER = 1000;

    public static class Weight {
        private final WeightConverterEnum unitOne;
        private final double valueOne;
        private final WeightConverterEnum unitTwo;
        private final double valueTwo;

        public Weight(WeightConverterEnum unitOne, double valueOne, WeightConverterEnum unitTwo, double valueTwo) {
            this.unitOne=unitOne;
            this.valueOne=valueOne;
            this.unitTwo=unitTwo;
            this.valueTwo=valueTwo;
        }
        public boolean compare() {
            return Double.compare(unitOne.convert(valueOne), unitTwo.convert(valueTwo)) == 0;
        }
    }
}
