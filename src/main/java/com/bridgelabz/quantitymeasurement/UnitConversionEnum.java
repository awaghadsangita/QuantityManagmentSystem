package com.bridgelabz.quantitymeasurement;

public enum UnitConversionEnum implements IUnitConversion {
    FEET_TO_FEET {
        @Override
        public boolean checkConversion(double firstConversionValue, double secondConversionValue) {
            return Double.compare(firstConversionValue, secondConversionValue) == 0;
        }
    },
    FEET_TO_INCH {
        @Override
        public boolean checkConversion(double firstConversionValue, double secondConversionValue) {
            return Double.compare(Math.round(firstConversionValue * FEET_INCH_MULTIPLIER), secondConversionValue) == 0;
        }
    },
    INCH_TO_INCH {
        @Override
        public boolean checkConversion(double firstConversionValue, double secondConversionValue) {
            return Double.compare(firstConversionValue, secondConversionValue) == 0;
        }
    },
    INCH_TO_FEET {
        @Override
        public boolean checkConversion(double firstConversionValue, double secondConversionValue) {
            return Double.compare(firstConversionValue, Math.round(secondConversionValue * FEET_INCH_MULTIPLIER)) == 0;
        }
    },
    YARDS_TO_YARDS {
        @Override
        public boolean checkConversion(double firstConversionValue, double secondConversionValue) {
            return Double.compare(firstConversionValue, secondConversionValue) == 0;
        }
    },
    YARDS_TO_FEET {
        @Override
        public boolean checkConversion(double firstConversionValue, double secondConversionValue) {
            return Double.compare(Math.round(firstConversionValue * YARD_FEET_MULTIPLIER), secondConversionValue) == 0;
        }
    },
    FEET_TO_YARDS {
        @Override
        public boolean checkConversion(double firstConversionValue, double secondConversionValue) {
            return Double.compare(firstConversionValue, Math.round(secondConversionValue * YARD_FEET_MULTIPLIER)) == 0;
        }
    },
    YARDS_TO_INCHES {
        @Override
        public boolean checkConversion(double firstConversionValue, double secondConversionValue) {
            return Double.compare(Math.round(firstConversionValue * YARD_FEET_MULTIPLIER * FEET_INCH_MULTIPLIER), secondConversionValue) == 0;
        }
    },
    INCHES_TO_YARD {
        @Override
        public boolean checkConversion(double firstConversionValue, double secondConversionValue) {
            return Double.compare(firstConversionValue, Math.round(secondConversionValue * YARD_FEET_MULTIPLIER * FEET_INCH_MULTIPLIER)) == 0;
        }
    };

    public final double FEET_INCH_MULTIPLIER = 12;
    public static final double YARD_FEET_MULTIPLIER = 3;

}
