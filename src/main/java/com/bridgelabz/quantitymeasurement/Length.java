package com.bridgelabz.quantitymeasurement;

public class Length {
    private final double valueOne;
    private final double valueTwo;
    private final LengthConverterEnum unitTwo;
    private final LengthConverterEnum unitOne;

    public Length(LengthConverterEnum unitOne, double valueOne, LengthConverterEnum unitTwo, double valueTwo) {
        this.unitOne = unitOne;
        this.unitTwo = unitTwo;
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    public boolean compare() {
        return Double.compare(unitOne.convert(valueOne), unitTwo.convert(valueTwo)) == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.valueOne, valueOne) == 0 &&
                Double.compare(length.valueTwo, valueTwo) == 0 &&
                unitTwo == length.unitTwo &&
                unitOne == length.unitOne;
    }

    public double addTwoLength() {
        return unitOne.convert(valueOne) + unitTwo.convert(valueTwo);
    }
}
