package com.bridgelabz.quantitymeasurement;

public enum TemperatureConverterEnum implements IUnitConversion{
    CELSIUS {
        @Override
        public double convert(double value) {
            return value;
        }
    }, CELSIUS_TO_FAHRENHEIT {
        @Override
        public double convert(double value) {
            return Math.round((value * 9/5) + 32);
        }
    }, FAHRENHEIT_TO_CELSIUS {
        @Override
        public double convert(double value) {
            return Math.round((value - 32) * 5/9);
        }
    }, FAHRENHEIT{
        @Override
        public double convert(double value) {
            return value;
        }
    }
}
