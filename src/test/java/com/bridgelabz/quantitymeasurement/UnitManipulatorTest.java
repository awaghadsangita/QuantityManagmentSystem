package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class UnitManipulatorTest {
    @Test
    public void givenOneGallonAndThreePointSevenEightLiter_WhenCompare_ShouldReturnTrue() {
        try {
            UnitManipulator unitManipulator = new UnitManipulator(VolumeConverterEnum.GALLON_TO_LITER, 1, VolumeConverterEnum.LITER_TO_LITER, 3.78, VolumeConverterEnum.class);
            Assert.assertTrue(unitManipulator.compare());
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1000MilliLiterAnd1Liter_WhenCompare_ShouldReturnTrue() {
        try {
            UnitManipulator unitManipulator = new UnitManipulator(VolumeConverterEnum.MILLILITER_TO_LITER, 1000, VolumeConverterEnum.LITER_TO_LITER, 1, VolumeConverterEnum.class);
            Assert.assertTrue(unitManipulator.compare());
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1GallonAndThreePointSevenEightLiter_ShouldReturnAdditionResult() {
        try {
            UnitManipulator unitManipulator = new UnitManipulator(VolumeConverterEnum.GALLON_TO_LITER, 1, VolumeConverterEnum.LITER_TO_LITER, 3.78, VolumeConverterEnum.class);
            Assert.assertEquals(7.56, unitManipulator.addTwoUnit(), 0.0);
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1LiterAndThousandMilliLiter_ShouldReturnAdditionResult() {
        try {
            UnitManipulator unitManipulator = new UnitManipulator(VolumeConverterEnum.LITER_TO_LITER, 1, VolumeConverterEnum.MILLILITER_TO_LITER, 1000, VolumeConverterEnum.class);
            Assert.assertEquals(2, unitManipulator.addTwoUnit(), 0.0);
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1TonneAnd1000Gram_WhenPerformAddition_ShouldReturn1001KiloGram() {
        try {
            UnitManipulator weightObject = new UnitManipulator(WeightConverterEnum.TONNE_TO_KILOGRAM, 1.0, WeightConverterEnum.GRAM_TO_KILOGRAM, 1000, WeightConverterEnum.class);
            Assert.assertEquals(1001, weightObject.addTwoUnit(), 0.0);
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1TonneAnd1000Gram_WhenCompare_ShouldThrowException() {
        try {
            UnitManipulator unitManipulator = new UnitManipulator(WeightConverterEnum.TONNE_TO_KILOGRAM, 1.0, VolumeConverterEnum.MILLILITER_TO_LITER, 1000, VolumeConverterEnum.class);
            unitManipulator.compare();
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.UNIT_TYPE_ISSUE, e.type);
        }
    }

    @Test
    public void given1TonneAnd1000Gram_WhenAdded_ShouldThrowException() {
        try {
            UnitManipulator volumeObject = new UnitManipulator(WeightConverterEnum.TONNE_TO_KILOGRAM, 1.0, VolumeConverterEnum.MILLILITER_TO_LITER, 1000, VolumeConverterEnum.class);
            volumeObject.addTwoUnit();
        } catch (UnitManipulatorException e) {
            Assert.assertEquals(UnitManipulatorException.ExceptionType.UNIT_TYPE_ISSUE, e.type);
        }
    }

    @Test
    public void given1CelsiusAnd33Point8Fahrenheit_WhenCompare_ShouldReturnTrue() {
        try {
            UnitManipulator unitManipulator = new UnitManipulator(TemperatureConverterEnum.FAHRENHEIT_TO_CELSIUS, 33.8, TemperatureConverterEnum.CELSIUS, 1.0, TemperatureConverterEnum.class);
            Assert.assertTrue(unitManipulator.compare());
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1CelsiusAnd1Celsius_WhenCompare_ShouldReturnTrue() {
        try {
            UnitManipulator unitManipulator = new UnitManipulator(TemperatureConverterEnum.CELSIUS, 1.0, TemperatureConverterEnum.CELSIUS, 1, TemperatureConverterEnum.class);
            Assert.assertTrue(unitManipulator.compare());
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given212FahrenheitAnd100Celsius_WhenCompare_ShouldReturnTrue() {
        try {
            UnitManipulator unitManipulator = new UnitManipulator(TemperatureConverterEnum.FAHRENHEIT, 212, TemperatureConverterEnum.CELSIUS_TO_FAHRENHEIT, 100, TemperatureConverterEnum.class);
            Assert.assertTrue(unitManipulator.compare());
        } catch (UnitManipulatorException e) {
        }
    }
    @Test
    public void given1FeetAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        try {
            UnitManipulator unitManipulator = new UnitManipulator(LengthConverterEnum.FEET_TO_INCH, 1.0, LengthConverterEnum.FEET_TO_INCH, 1.0,LengthConverterEnum.class);
            Assert.assertTrue(unitManipulator.compare());
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1InchAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        try {
            UnitManipulator unitManipulator = new UnitManipulator(LengthConverterEnum.INCH_TO_INCH, 1, LengthConverterEnum.FEET_TO_INCH, 1.0,LengthConverterEnum.class);
            Assert.assertFalse(unitManipulator.compare());
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1InchAnd1Inch_WhenCompared_ShouldReturnEqualLength() {
        try {
            UnitManipulator unitManipulator = new UnitManipulator(LengthConverterEnum.INCH_TO_INCH, 1.0, LengthConverterEnum.INCH_TO_INCH, 1.0,LengthConverterEnum.class);
            Assert.assertTrue(unitManipulator.compare());
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1YardAnd1Yard_WhenCompared_ShouldReturnEqualLength() {
        try {
            UnitManipulator unitManipulator = new UnitManipulator(LengthConverterEnum.YARDS_TO_INCHES, 1.0, LengthConverterEnum.YARDS_TO_INCHES, 1.0,LengthConverterEnum.class);
            Assert.assertTrue(unitManipulator.compare());
        } catch (UnitManipulatorException e) {
        }

    }

    @Test
    public void given1YardAnd3Feet_WhenCompared_ShouldReturnEqualLength() {
        try {
            UnitManipulator unitManipulator = new UnitManipulator(LengthConverterEnum.YARDS_TO_INCHES, 1.0, LengthConverterEnum.FEET_TO_INCH, 3.0,LengthConverterEnum.class);
            Assert.assertTrue(unitManipulator.compare());
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqualLength() {
        try {
            UnitManipulator unitManipulator = new UnitManipulator(LengthConverterEnum.FEET_TO_INCH, 3.0, LengthConverterEnum.YARDS_TO_INCHES, 1.0,LengthConverterEnum.class);
            Assert.assertTrue(unitManipulator.compare());
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1FeetAnd1Yard_WhenCompared_ShouldReturnFalse() {
        try {
            UnitManipulator unitManipulator = new UnitManipulator(LengthConverterEnum.FEET_TO_INCH, 1.0, LengthConverterEnum.YARDS_TO_INCHES, 1.0,LengthConverterEnum.class);
            Assert.assertFalse(unitManipulator.compare());
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1InchAnd1Yard_WhenCompared_ShouldReturnFalse() {
        try {
            UnitManipulator unitManipulator = new UnitManipulator(LengthConverterEnum.INCH_TO_INCH, 1.0, LengthConverterEnum.YARDS_TO_INCHES, 1.0,LengthConverterEnum.class);
            Assert.assertFalse(unitManipulator.compare());
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given36InchAnd1Yard_WhenCompared_ShouldReturnTrue() {
        try {
            UnitManipulator unitManipulator = new UnitManipulator(LengthConverterEnum.INCH_TO_INCH, 36.0, LengthConverterEnum.YARDS_TO_INCHES, 1.0,LengthConverterEnum.class);
            Assert.assertTrue(unitManipulator.compare());
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1YardAnd36Inch_WhenCompared_ShouldReturnTrue() {
        try {
            UnitManipulator unitManipulator = new UnitManipulator(LengthConverterEnum.YARDS_TO_INCHES, 1.0, LengthConverterEnum.INCH_TO_INCH, 36.0,LengthConverterEnum.class);
            Assert.assertTrue(unitManipulator.compare());
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given2InchAnd5Centimeter_WhenCompared_ShouldReturnTrue() {
        try {
            UnitManipulator unitManipulator = new UnitManipulator(LengthConverterEnum.INCH_TO_INCH, 2.0, LengthConverterEnum.CENTIMETER_TO_INCH, 5.0,LengthConverterEnum.class);
            Assert.assertTrue(unitManipulator.compare());
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given2InchAnd2Inch_ShouldReturnAddition() {
        try {
            UnitManipulator unitManipulator = new UnitManipulator(LengthConverterEnum.INCH_TO_INCH, 2.0, LengthConverterEnum.INCH_TO_INCH, 2.0,LengthConverterEnum.class);
            Assert.assertEquals(4, unitManipulator.addTwoUnit(), 0.0);
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1FeetAnd2Inch_ShouldReturnAddition() {
        try {
            UnitManipulator unitManipulator = new UnitManipulator(LengthConverterEnum.FEET_TO_INCH, 1.0, LengthConverterEnum.INCH_TO_INCH, 2.0,LengthConverterEnum.class);
            Assert.assertEquals(14, unitManipulator.addTwoUnit(), 0.0);
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturnAddition() {
        try {
            UnitManipulator unitManipulator = new UnitManipulator(LengthConverterEnum.FEET_TO_INCH, 1.0, LengthConverterEnum.FEET_TO_INCH, 1.0,LengthConverterEnum.class);
            Assert.assertEquals(24, unitManipulator.addTwoUnit(), 0.0);
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given2InchAndTwoPointFiveCentimeter_ShouldReturnAddition() {
        try {
            UnitManipulator unitManipulator = new UnitManipulator(LengthConverterEnum.INCH_TO_INCH, 2.0, LengthConverterEnum.CENTIMETER_TO_INCH, 2.5,LengthConverterEnum.class);
            Assert.assertEquals(3, Math.round(unitManipulator.addTwoUnit()), 0.0);
        } catch (UnitManipulatorException e) {
        }
    }
}
