package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class UnitManipulatorTest {
    @Test
    public void givenOneGallonAndThreePointSevenEightLiter_WhenCompare_ShouldReturnTrue() {
        try {
            UnitManipulator unitManipulatorOne = new UnitManipulator(VolumeConverterEnum.GALLON, 1, VolumeConverterEnum.class);
            UnitManipulator unitManipulatorTwo = new UnitManipulator(VolumeConverterEnum.LITER, 3.78, VolumeConverterEnum.class);
            Assert.assertTrue(unitManipulatorOne.compare(unitManipulatorTwo));
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1000MilliLiterAnd1Liter_WhenCompare_ShouldReturnTrue() {
        try {
            UnitManipulator unitManipulatorOne = new UnitManipulator(VolumeConverterEnum.MILLILITER, 1000, VolumeConverterEnum.class);
            UnitManipulator unitManipulatorTwo = new UnitManipulator(VolumeConverterEnum.LITER, 1, VolumeConverterEnum.class);
            Assert.assertTrue(unitManipulatorOne.compare(unitManipulatorTwo));
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1GallonAndThreePointSevenEightLiter_ShouldReturnAdditionResult() {
        try {
            UnitManipulator unitManipulatorOne = new UnitManipulator(VolumeConverterEnum.GALLON, 1, VolumeConverterEnum.class);
            UnitManipulator unitManipulatorTwo = new UnitManipulator(VolumeConverterEnum.LITER, 3.78, VolumeConverterEnum.class);
            Assert.assertEquals(7.56, unitManipulatorOne.addTwoUnit(unitManipulatorTwo), 0.0);
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1LiterAndThousandMilliLiter_ShouldReturnAdditionResult() {
        try {
            UnitManipulator unitManipulatorOne = new UnitManipulator(VolumeConverterEnum.LITER, 1, VolumeConverterEnum.class);
            UnitManipulator unitManipulatorTwo = new UnitManipulator(VolumeConverterEnum.MILLILITER, 1000, VolumeConverterEnum.class);
            Assert.assertEquals(2, unitManipulatorOne.addTwoUnit(unitManipulatorTwo), 0.0);
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1TonneAnd1000Gram_WhenPerformAddition_ShouldReturn1001KiloGram() {
        try {
            UnitManipulator weightObjectOne = new UnitManipulator(WeightConverterEnum.TONNE, 1.0, WeightConverterEnum.class);
            UnitManipulator weightObjectTwo = new UnitManipulator(WeightConverterEnum.GRAM, 1000, WeightConverterEnum.class);
            Assert.assertEquals(1001, weightObjectOne.addTwoUnit(weightObjectTwo), 0.0);
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1TonneAnd1000Gram_WhenCompare_ShouldThrowException() {
        try {
            UnitManipulator unitManipulatorOne = new UnitManipulator(WeightConverterEnum.TONNE, 1.0, WeightConverterEnum.class);
            UnitManipulator unitManipulatorTwo = new UnitManipulator(VolumeConverterEnum.MILLILITER, 1000, VolumeConverterEnum.class);
            unitManipulatorOne.compare(unitManipulatorTwo);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.UNIT_TYPE_ISSUE, e.type);
        }
    }

    @Test
    public void given1TonneAnd1000Gram_WhenAdded_ShouldThrowException() {
        try {
            UnitManipulator unitManipulatorOne = new UnitManipulator(WeightConverterEnum.TONNE, 1.0, WeightConverterEnum.class);
            UnitManipulator unitManipulatorTwo = new UnitManipulator(VolumeConverterEnum.MILLILITER, 1000, VolumeConverterEnum.class);
            unitManipulatorOne.addTwoUnit(unitManipulatorTwo);
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.UNIT_TYPE_ISSUE, e.type);
        }
    }

    @Test
    public void given1CelsiusAnd33Point8Fahrenheit_WhenCompare_ShouldReturnTrue() {
        try {
            UnitManipulator unitManipulatorOne = new UnitManipulator(TemperatureConverterEnum.FAHRENHEIT_TO_CELSIUS, 33.8, TemperatureConverterEnum.class);
            UnitManipulator unitManipulatorTwo = new UnitManipulator(TemperatureConverterEnum.CELSIUS, 1.0, TemperatureConverterEnum.class);
            Assert.assertTrue(unitManipulatorOne.compare(unitManipulatorTwo));
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1CelsiusAnd1Celsius_WhenCompare_ShouldReturnTrue() {
        try {
            UnitManipulator unitManipulatorOne = new UnitManipulator(TemperatureConverterEnum.CELSIUS, 1.0, TemperatureConverterEnum.class);
            UnitManipulator unitManipulatorTwo = new UnitManipulator(TemperatureConverterEnum.CELSIUS, 1, TemperatureConverterEnum.class);
            Assert.assertTrue(unitManipulatorOne.compare(unitManipulatorTwo));
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given212FahrenheitAnd100Celsius_WhenCompare_ShouldReturnTrue() {
        try {
            UnitManipulator unitManipulatorOne = new UnitManipulator(TemperatureConverterEnum.FAHRENHEIT, 212, TemperatureConverterEnum.class);
            UnitManipulator unitManipulatorTwo = new UnitManipulator(TemperatureConverterEnum.CELSIUS_TO_FAHRENHEIT, 100, TemperatureConverterEnum.class);
            Assert.assertTrue(unitManipulatorOne.compare(unitManipulatorTwo));
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1FeetAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        try {
            UnitManipulator unitManipulatorOne = new UnitManipulator(LengthConverterEnum.FEET, 1.0, LengthConverterEnum.class);
            UnitManipulator unitManipulatorTwo = new UnitManipulator(LengthConverterEnum.FEET, 1.0, LengthConverterEnum.class);
            Assert.assertTrue(unitManipulatorOne.compare(unitManipulatorTwo));
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1InchAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        try {
            UnitManipulator unitManipulatorOne = new UnitManipulator(LengthConverterEnum.INCH, 1, LengthConverterEnum.class);
            UnitManipulator unitManipulatorTwo = new UnitManipulator(LengthConverterEnum.FEET, 1.0, LengthConverterEnum.class);
            Assert.assertFalse(unitManipulatorOne.compare(unitManipulatorTwo));
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1InchAnd1Inch_WhenCompared_ShouldReturnEqualLength() {
        try {
            UnitManipulator unitManipulatorOne = new UnitManipulator(LengthConverterEnum.INCH, 1.0, LengthConverterEnum.class);
            UnitManipulator unitManipulatorTwo = new UnitManipulator(LengthConverterEnum.INCH, 1.0, LengthConverterEnum.class);
            Assert.assertTrue(unitManipulatorOne.compare(unitManipulatorTwo));
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1YardAnd1Yard_WhenCompared_ShouldReturnEqualLength() {
        try {
            UnitManipulator unitManipulatorOne = new UnitManipulator(LengthConverterEnum.YARD, 1.0, LengthConverterEnum.class);
            UnitManipulator unitManipulatorTwo = new UnitManipulator(LengthConverterEnum.YARD, 1.0, LengthConverterEnum.class);
            Assert.assertTrue(unitManipulatorOne.compare(unitManipulatorTwo));
        } catch (UnitManipulatorException e) {
        }

    }

    @Test
    public void given1YardAnd3Feet_WhenCompared_ShouldReturnEqualLength() {
        try {
            UnitManipulator unitManipulatorOne = new UnitManipulator(LengthConverterEnum.YARD, 1.0, LengthConverterEnum.class);
            UnitManipulator unitManipulatorTwo = new UnitManipulator(LengthConverterEnum.FEET, 3.0, LengthConverterEnum.class);
            Assert.assertTrue(unitManipulatorOne.compare(unitManipulatorTwo));
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqualLength() {
        try {
            UnitManipulator unitManipulatorOne = new UnitManipulator(LengthConverterEnum.FEET, 3.0, LengthConverterEnum.class);
            UnitManipulator unitManipulatorTwo = new UnitManipulator(LengthConverterEnum.YARD, 1.0, LengthConverterEnum.class);
            Assert.assertTrue(unitManipulatorOne.compare(unitManipulatorTwo));
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1FeetAnd1Yard_WhenCompared_ShouldReturnFalse() {
        try {
            UnitManipulator unitManipulatorOne = new UnitManipulator(LengthConverterEnum.FEET, 1.0, LengthConverterEnum.class);
            UnitManipulator unitManipulatorTwo = new UnitManipulator(LengthConverterEnum.YARD, 1.0, LengthConverterEnum.class);
            Assert.assertFalse(unitManipulatorOne.compare(unitManipulatorTwo));
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1InchAnd1Yard_WhenCompared_ShouldReturnFalse() {
        try {
            UnitManipulator unitManipulatorOne = new UnitManipulator(LengthConverterEnum.INCH, 1.0, LengthConverterEnum.class);
            UnitManipulator unitManipulatorTwo = new UnitManipulator(LengthConverterEnum.YARD, 1.0, LengthConverterEnum.class);
            Assert.assertFalse(unitManipulatorOne.compare(unitManipulatorTwo));
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given36InchAnd1Yard_WhenCompared_ShouldReturnTrue() {
        try {
            UnitManipulator unitManipulatorOne = new UnitManipulator(LengthConverterEnum.INCH, 36.0, LengthConverterEnum.class);
            UnitManipulator unitManipulatorTwo = new UnitManipulator(LengthConverterEnum.YARD, 1.0, LengthConverterEnum.class);
            Assert.assertTrue(unitManipulatorOne.compare(unitManipulatorTwo));
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1YardAnd36Inch_WhenCompared_ShouldReturnTrue() {
        try {
            UnitManipulator unitManipulatorOne = new UnitManipulator(LengthConverterEnum.YARD, 1.0, LengthConverterEnum.class);
            UnitManipulator unitManipulatorTwo = new UnitManipulator(LengthConverterEnum.INCH, 36.0, LengthConverterEnum.class);
            Assert.assertTrue(unitManipulatorOne.compare(unitManipulatorTwo));
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given2InchAnd5Centimeter_WhenCompared_ShouldReturnTrue() {
        try {
            UnitManipulator unitManipulatorOne = new UnitManipulator(LengthConverterEnum.INCH, 2.0, LengthConverterEnum.class);
            UnitManipulator unitManipulatorTwo = new UnitManipulator(LengthConverterEnum.CENTIMETER, 5.0, LengthConverterEnum.class);
            Assert.assertTrue(unitManipulatorOne.compare(unitManipulatorTwo));
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given2InchAnd2Inch_ShouldReturnAddition() {
        try {
            UnitManipulator unitManipulatorOne = new UnitManipulator(LengthConverterEnum.INCH, 2.0, LengthConverterEnum.class);
            UnitManipulator unitManipulatorTwo = new UnitManipulator(LengthConverterEnum.INCH, 2.0, LengthConverterEnum.class);
            Assert.assertEquals(4, unitManipulatorOne.addTwoUnit(unitManipulatorTwo), 0.0);
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1FeetAnd2Inch_ShouldReturnAddition() {
        try {
            UnitManipulator unitManipulatorOne = new UnitManipulator(LengthConverterEnum.FEET, 1.0, LengthConverterEnum.class);
            UnitManipulator unitManipulatorTwo = new UnitManipulator(LengthConverterEnum.INCH, 2.0, LengthConverterEnum.class);
            Assert.assertEquals(14, unitManipulatorOne.addTwoUnit(unitManipulatorTwo), 0.0);
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturnAddition() {
        try {
            UnitManipulator unitManipulatorOne = new UnitManipulator(LengthConverterEnum.FEET, 1.0, LengthConverterEnum.class);
            UnitManipulator unitManipulatorTwo = new UnitManipulator(LengthConverterEnum.FEET, 1.0, LengthConverterEnum.class);
            Assert.assertEquals(24, unitManipulatorOne.addTwoUnit(unitManipulatorTwo), 0.0);
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given2InchAndTwoPointFiveCentimeter_ShouldReturnAddition() {
        try {
            UnitManipulator unitManipulatorOne = new UnitManipulator(LengthConverterEnum.INCH, 2.0, LengthConverterEnum.class);
            UnitManipulator unitManipulatorTwo = new UnitManipulator(LengthConverterEnum.CENTIMETER, 2.5, LengthConverterEnum.class);
            Assert.assertEquals(3, Math.round(unitManipulatorOne.addTwoUnit(unitManipulatorTwo)), 0.0);
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given0FeetAnd0Feet_ShouldReturnTrue() {
        UnitManipulator unitManipulatorOne = new UnitManipulator(LengthConverterEnum.FEET, 0.0, LengthConverterEnum.class);
        UnitManipulator unitManipulatorTwo = new UnitManipulator(LengthConverterEnum.FEET, 0.0, LengthConverterEnum.class);
        Assert.assertEquals(unitManipulatorOne, unitManipulatorTwo);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        UnitManipulator unitManipulatorOne = new UnitManipulator(LengthConverterEnum.FEET, 0.0, LengthConverterEnum.class);
        UnitManipulator unitManipulatorTwo = new UnitManipulator(LengthConverterEnum.FEET, 1.0, LengthConverterEnum.class);
        boolean result = unitManipulatorOne.equals(unitManipulatorTwo);
        Assert.assertFalse(result);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnTrue() {
        UnitManipulator unitManipulatorOne = new UnitManipulator(LengthConverterEnum.INCH, 0.0, LengthConverterEnum.class);
        UnitManipulator unitManipulatorTwo = new UnitManipulator(LengthConverterEnum.INCH, 0.0, LengthConverterEnum.class);
        Assert.assertEquals(unitManipulatorOne, unitManipulatorTwo);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        UnitManipulator unitManipulatorOne = new UnitManipulator(LengthConverterEnum.INCH, 0.0, LengthConverterEnum.class);
        UnitManipulator unitManipulatorTwo = new UnitManipulator(LengthConverterEnum.INCH, 1.0, LengthConverterEnum.class);
        boolean result = unitManipulatorOne.equals(unitManipulatorTwo);
        Assert.assertFalse(result);
    }

    @Test
    public void given1FeetAndNull_WhenEqual_ShouldReturnFalse() {
        UnitManipulator unitManipulatorOne = new UnitManipulator(LengthConverterEnum.INCH, 0.0, LengthConverterEnum.class);
        boolean result = unitManipulatorOne.equals(null);
        Assert.assertFalse(result);
    }

    @Test
    public void given1FeetAndSame1FeetObject_WhenEqual_ShouldReturnTrue() {
        UnitManipulator unitManipulatorOne = new UnitManipulator(LengthConverterEnum.INCH, 0.0, LengthConverterEnum.class);
        boolean result = unitManipulatorOne.equals(unitManipulatorOne);
        Assert.assertTrue(result);
    }
}
