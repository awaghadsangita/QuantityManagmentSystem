package com.bridgelabz.quantitymeasurement;

public enum LengthConverterEnum implements IUnitConversion {
    FEET_TO_INCH {
        @Override
        public double convert(double value) {
            return value * FEET_INCH_MULTIPLIER;
        }
    },
    INCH_TO_INCH {
        @Override
        public double convert(double value) {
            return value;
        }
    },
    YARDS_TO_INCHES {
        @Override
        public double convert(double value) {
            return value * FEET_INCH_MULTIPLIER * YARD_FEET_MULTIPLIER;
        }
    },
    CENTIMETER_TO_INCH {
        @Override
        public double convert(double value) {
            return value * CENTIMETER_INCH_MULTIPLIER;
        }
    };
    private static final double YARD_FEET_MULTIPLIER = 3;
    private static final double FEET_INCH_MULTIPLIER = 12;
    private static final double CENTIMETER_INCH_MULTIPLIER = 0.393701;
}
