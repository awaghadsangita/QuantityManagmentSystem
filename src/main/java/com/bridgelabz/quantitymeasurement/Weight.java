package com.bridgelabz.quantitymeasurement;

public class Weight {
    private final WeightConverterEnum unitOne;
    private final WeightConverterEnum unitTwo;
    private final double valueOne;
    private final double valueTwo;

    public Weight(WeightConverterEnum unitOne, double valueOne, WeightConverterEnum unitTwo, int valueTwo) {
        this.unitOne = unitOne;
        this.unitTwo = unitTwo;
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    public double addTwoWeight() {
        return unitOne.convert(valueOne) + unitTwo.convert(valueTwo);
    }
}
