package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class UnitManipulatorTest {
    @Test
    public void givenOneGallonAndThreePointSevenEightLiter_WhenCompare_ShouldReturnTrue() {
        try {
            UnitManipulator volumeObject = new UnitManipulator(VolumeConverterEnum.GALLON_TO_LITER, 1, VolumeConverterEnum.LITER_TO_LITER, 3.78, VolumeConverterEnum.class);
            Assert.assertTrue(volumeObject.compare());
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1000MilliLiterAnd1Liter_WhenCompare_ShouldReturnTrue() {
        try {
            UnitManipulator volumeObject = new UnitManipulator(VolumeConverterEnum.MILLILITER_TO_LITER, 1000, VolumeConverterEnum.LITER_TO_LITER, 1, VolumeConverterEnum.class);
            Assert.assertTrue(volumeObject.compare());
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1GallonAndThreePointSevenEightLiter_ShouldReturnAdditionResult() {
        try {
            UnitManipulator volumeObject = new UnitManipulator(VolumeConverterEnum.GALLON_TO_LITER, 1, VolumeConverterEnum.LITER_TO_LITER, 3.78, VolumeConverterEnum.class);
            double result = volumeObject.addTwoUnit();
            Assert.assertEquals(7.56, result, 0.0);
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1LiterAndThousandMilliLiter_ShouldReturnAdditionResult() {
        try {
            UnitManipulator volumeObject = new UnitManipulator(VolumeConverterEnum.LITER_TO_LITER, 1, VolumeConverterEnum.MILLILITER_TO_LITER, 1000, VolumeConverterEnum.class);
            double result = volumeObject.addTwoUnit();
            Assert.assertEquals(2, result, 0.0);
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
            UnitManipulator volumeObject = new UnitManipulator(WeightConverterEnum.TONNE_TO_KILOGRAM, 1.0, VolumeConverterEnum.MILLILITER_TO_LITER, 1000, VolumeConverterEnum.class);
            volumeObject.compare();
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
            UnitManipulator temperatureObject = new UnitManipulator(TemperatureConverterEnum.FAHRENHEIT_TO_CELSIUS, 33.8, TemperatureConverterEnum.CELSIUS, 1.0, TemperatureConverterEnum.class);
            Assert.assertTrue(temperatureObject.compare());
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given1CelsiusAnd1Celsius_WhenCompare_ShouldReturnTrue() {
        try {
            UnitManipulator temperatureObject = new UnitManipulator(TemperatureConverterEnum.CELSIUS, 1.0, TemperatureConverterEnum.CELSIUS, 1, TemperatureConverterEnum.class);
            Assert.assertTrue(temperatureObject.compare());
        } catch (UnitManipulatorException e) {
        }
    }

    @Test
    public void given212FahrenheitAnd100Celsius_WhenCompare_ShouldReturnTrue() {
        try {
            UnitManipulator temperatureObject = new UnitManipulator(TemperatureConverterEnum.FAHRENHEIT, 212, TemperatureConverterEnum.CELSIUS_TO_FAHRENHEIT, 100, TemperatureConverterEnum.class);
            Assert.assertTrue(temperatureObject.compare());
        } catch (UnitManipulatorException e) {
        }
    }
}
