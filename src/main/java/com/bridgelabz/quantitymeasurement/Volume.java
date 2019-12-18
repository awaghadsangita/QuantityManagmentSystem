package com.bridgelabz.quantitymeasurement;

public class Volume {
    private final VolumeConverterEnum unitOne;
    private final double valueOne;
    private final VolumeConverterEnum unitTwo;
    private final double valueTwo;

    public Volume(VolumeConverterEnum unitOne, double valueOne, VolumeConverterEnum unitTwo, double valueTwo) {
        this.unitOne=unitOne;
        this.valueOne=valueOne;
        this.unitTwo=unitTwo;
        this.valueTwo=valueTwo;
    }

    public boolean compare() {
        return Double.compare(unitOne.convert(valueOne), unitTwo.convert(valueTwo)) == 0;
    }
}
