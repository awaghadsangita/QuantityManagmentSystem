package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class VolumeTest {
    @Test
    public void givenOneGallon_ShouldReturnThreePointSevenEightLiter() {
        Volume volumeObject = new Volume(VolumeConverterEnum.GALLON_TO_LITER, 1, VolumeConverterEnum.LITER_TO_LITER, 3.78);
        Assert.assertTrue(volumeObject.compare());
    }
    @Test
    public void given1000MiliLiter_ShouldReturn1Liter(){
        Volume volumeObject = new Volume(VolumeConverterEnum.MILILITER_TO_LITER, 1000, VolumeConverterEnum.LITER_TO_LITER, 1);
        Assert.assertTrue(volumeObject.compare());
    }
}
