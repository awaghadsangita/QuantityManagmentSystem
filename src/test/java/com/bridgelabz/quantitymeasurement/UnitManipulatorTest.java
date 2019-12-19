package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class UnitManipulatorTest {
    @Test
    public void givenOneGallonAndThreePointSevenEightLiter_WhenCompare_ShouldReturnTrue() {
        UnitManipulator volumeObject = new UnitManipulator(VolumeConverterEnum.GALLON_TO_LITER, 1, VolumeConverterEnum.LITER_TO_LITER, 3.78);
        Assert.assertTrue(volumeObject.compare(VolumeConverterEnum.class));
    }

    @Test
    public void given1000MilliLiterAnd1Liter_WhenCompare_ShouldReturnTrue() {
        UnitManipulator volumeObject = new UnitManipulator(VolumeConverterEnum.MILLILITER_TO_LITER, 1000, VolumeConverterEnum.LITER_TO_LITER, 1);
        Assert.assertTrue(volumeObject.compare(VolumeConverterEnum.class));
    }

    @Test
    public void given1GallonAndThreePointSevenEightLiter_ShouldReturnAdditionResult() {
        UnitManipulator volumeObject = new UnitManipulator(VolumeConverterEnum.GALLON_TO_LITER, 1, VolumeConverterEnum.LITER_TO_LITER, 3.78);
        double result = volumeObject.addTwoUnit(VolumeConverterEnum.class);
        Assert.assertEquals(7.56, result, 0.0);
    }

    @Test
    public void given1LiterAndThousandMilliLiter_ShouldReturnAdditionResult() {
        UnitManipulator volumeObject = new UnitManipulator(VolumeConverterEnum.LITER_TO_LITER, 1, VolumeConverterEnum.MILLILITER_TO_LITER, 1000);
        double result = volumeObject.addTwoUnit(VolumeConverterEnum.class);
        Assert.assertEquals(2, result, 0.0);
    }

}
