package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class LengthConverterEnumTest {
    @Test
    public void given1Feet_ShouldReturnInInch() {
        Assert.assertEquals(12.0, LengthConverterEnum.FEET.convert(1.0), 0.0);
    }

    @Test
    public void given1Yard_ShouldReturnInInch() {
        Assert.assertEquals(36.0, LengthConverterEnum.YARD.convert(1.0), 0.0);
    }

    @Test
    public void given1Inch_ShouldReturnInInch() {
        Assert.assertEquals(1.0, LengthConverterEnum.INCH.convert(1.0), 0.0);
    }

    @Test
    public void given1Centimeter_ShouldReturnInInch() {
        Assert.assertEquals(0.393701, LengthConverterEnum.CENTIMETER.convert(1.0), 0.0);
    }
}
