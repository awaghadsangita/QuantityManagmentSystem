package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class WeightConverterEnumTest {
    @Test
    public void given1Kilogram_ShouldReturn1Kilogram() {
        Assert.assertEquals(1, WeightConverterEnum.KILOGRAM_TO_KILOGRAM.convert(1), 0.0);
    }

    @Test
    public void given1000Gram_ShouldReturn1Kilogram() {
        Assert.assertEquals(1, WeightConverterEnum.GRAM_TO_KILOGRAM.convert(1000), 0.0);
    }

    @Test
    public void given1Tonne_ShouldReturn1000Kilogram() {
        Assert.assertEquals(1000, WeightConverterEnum.TONNE_TO_KILOGRAM.convert(1), 0.0);
    }
}
