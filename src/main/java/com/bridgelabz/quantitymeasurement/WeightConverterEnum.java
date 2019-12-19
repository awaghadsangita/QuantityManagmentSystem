package com.bridgelabz.quantitymeasurement;

public enum WeightConverterEnum implements IUnitConversion {
    GRAM_TO_KILOGRAM {
        @Override
        public double convert(double value) {
            return value * GRAM_KILOGRAM_MULTIPLIER;
        }
    }, KILOGRAM_TO_KILOGRAM {
        @Override
        public double convert(double value) {
            return value;
        }
    }, TONNE_TO_KILOGRAM {
        @Override
        public double convert(double value) {
            return value * TONNE_TO_KILOGRAM_MULTIPLIER;
        }
    };
    private static final double GRAM_KILOGRAM_MULTIPLIER = 0.001;
    private static final double TONNE_TO_KILOGRAM_MULTIPLIER = 1000;
}
