package com.bridgelabz.quantitymeasurement;

public enum LengthConverterEnum implements IUnitConversion {
    FEET {
        @Override
        public double convert(double value) {
            return value * FEET_INCH_MULTIPLIER;
        }
    },
    INCH {
        @Override
        public double convert(double value) {
            return value;
        }
    },
    YARD {
        @Override
        public double convert(double value) {
            return value * FEET_INCH_MULTIPLIER * YARD_FEET_MULTIPLIER;
        }
    },
    CENTIMETER {
        @Override
        public double convert(double value) {
            return value * CENTIMETER_INCH_MULTIPLIER;
        }
    };
    private static final double YARD_FEET_MULTIPLIER = 3;
    private static final double FEET_INCH_MULTIPLIER = 12;
    private static final double CENTIMETER_INCH_MULTIPLIER = 0.393701;
}
