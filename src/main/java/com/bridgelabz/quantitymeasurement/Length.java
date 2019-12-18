package com.bridgelabz.quantitymeasurement;

public class Length {
    private final double value1;
    private final double value2;
    private final UnitConversionEnum unit;

    public Length(UnitConversionEnum unit, double value1, double value2) {
        this.unit = unit;
        this.value1 = value1;
        this.value2 = value2;
    }

    public Length(UnitConversionEnum unit, double value1) {
        this.unit = unit;
        this.value1 = value1;
        this.value2 = 0.0;
    }

    public boolean compare() {
        return unit.checkConversion(value1, value2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value1, value1) == 0 &&
                Double.compare(length.value2, value2) == 0 &&
                unit == length.unit;
    }

}
