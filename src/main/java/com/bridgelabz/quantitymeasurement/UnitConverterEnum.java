package com.bridgelabz.quantitymeasurement;

public enum UnitConverterEnum implements IUnitConversion {

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
    };

    public final double FEET_INCH_MULTIPLIER = 12.0;
    public static final double YARD_FEET_MULTIPLIER = 3.0;
}
