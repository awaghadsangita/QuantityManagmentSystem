package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class VolumeTest {
    @Test
    public void givenOneGallonAndThreePointSevenEightLiter_WhenCompare_ShouldReturnTrue() {
        Volume volumeObject = new Volume(VolumeConverterEnum.GALLON_TO_LITER, 1, VolumeConverterEnum.LITER_TO_LITER, 3.78);
        Assert.assertTrue(volumeObject.compare());
    }

    @Test
    public void given1000MilliLiterAnd1Liter_WhenCompare_ShouldReturnTrue() {
        Volume volumeObject = new Volume(VolumeConverterEnum.MILLILITER_TO_LITER, 1000, VolumeConverterEnum.LITER_TO_LITER, 1);
        Assert.assertTrue(volumeObject.compare());
    }

    @Test
    public void given1GallonAndThreePointSevenEightLiter_ShouldReturnAdditionResult() {
        Volume volumeObject = new Volume(VolumeConverterEnum.GALLON_TO_LITER, 1, VolumeConverterEnum.LITER_TO_LITER, 3.78);
        double result = volumeObject.AddTwoVolumeUnitsValue();
        Assert.assertEquals(7.56, result, 0.0);
    }

    @Test
    public void given1LiterAndThousandMilliLiter_ShouldReturnAdditionResult() {
        Volume volumeObject = new Volume(VolumeConverterEnum.LITER_TO_LITER, 1, VolumeConverterEnum.MILLILITER_TO_LITER, 1000);
        double result = volumeObject.AddTwoVolumeUnitsValue();
        Assert.assertEquals(2, result, 0.0);
    }
}
