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
        Assert.assertEquals(33.8, TemperatureConverterEnum.CELSIUS_TO_FAHRENHEIT.convert(1), 0.0);
    }

    @Test
    public void given1Fahrenheit_ShouldReturnInCelsius() {
        Assert.assertEquals(Math.round(-17.2222), Math.round(TemperatureConverterEnum.FAHRENHEIT_TO_CELSIUS.convert(1)), 0.0);
    }
}
