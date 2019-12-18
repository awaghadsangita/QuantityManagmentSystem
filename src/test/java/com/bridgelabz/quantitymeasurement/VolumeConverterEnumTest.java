package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class VolumeConverterEnumTest {
    @Test
    public void givenOneGallon_ShouldReturnThreePointSevenEightLiter() {
        Assert.assertEquals(3.78, VolumeConverterEnum.GALLON_TO_LITER.convert(1), 0.0);
    }

    @Test
    public void given1Liter_ShouldReturn1Liter() {
        Assert.assertEquals(1, VolumeConverterEnum.LITER_TO_LITER.convert(1), 0.0);
    }

    @Test
    public void given1000MiliLiter_ShouldReturn1Liter(){
        Assert.assertEquals(1, VolumeConverterEnum.MILILITER_TO_LITER.convert(1000), 0.0);
    }
}
