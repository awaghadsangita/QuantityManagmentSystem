package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class TemperatureConverterEnumTest {

    @Test
    public void given1Fahrenheit_ShouldReturn1Fahrenheit() {
        Assert.assertEquals(1, TemperatureConverterEnum.FAHRENHEIT.convert(1), 0.0);
    }

    @Test
    public void given1Celsius_ShouldReturn1Celsius() {
        Assert.assertEquals(1, TemperatureConverterEnum.CELSIUS.convert(1), 0.0);
    }

    @Test
    public void given1Celsius_ShouldReturn33Point8Fahrenheit() {
        Assert.assertEquals(34.0, TemperatureConverterEnum.CELSIUS.convert(1), 0.0);
    }

}
