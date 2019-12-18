package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class UnitConversionEnumTest {
    @Test
    public void given1Feet_ShouldReturnInInch() {
        Assert.assertEquals(12.0, UnitConverterEnum.FEET_TO_INCH.convert(1.0),0.0);
    }

    @Test
    public void given1Yard_ShouldReturnInInch() {
        Assert.assertEquals(36.0, UnitConverterEnum.YARDS_TO_INCHES.convert(1.0),0.0);
    }

    @Test
    public void given1Inch_ShouldReturnInInch() {
        Assert.assertEquals(1.0, UnitConverterEnum.INCH_TO_INCH.convert(1.0),0.0);
    }
}
