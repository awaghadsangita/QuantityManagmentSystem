package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class LengthTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnTrue() {
        Length feetObject1 = new Length(UnitConversionEnum.FEET_TO_FEET, 0.0);
        Length feetObject2 = new Length(UnitConversionEnum.FEET_TO_FEET, 0.0);
        boolean equalsResult = feetObject1.equals(feetObject2);
        Assert.assertTrue(equalsResult);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(UnitConversionEnum.FEET_TO_FEET, 0.0);
        Length feet2 = new Length(UnitConversionEnum.FEET_TO_FEET, 1.0);
        boolean result = feet1.equals(feet2);
        Assert.assertFalse(result);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnTrue() {
        Length inch1 = new Length(UnitConversionEnum.INCH_TO_INCH, 0.0);
        Length inch2 = new Length(UnitConversionEnum.INCH_TO_INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(UnitConversionEnum.INCH_TO_INCH, 0.0);
        Length inch2 = new Length(UnitConversionEnum.INCH_TO_INCH, 1.0);
        boolean result = inch1.equals(inch2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Length feet = new Length(UnitConversionEnum.FEET_TO_FEET, 1.0);
        Length inch = new Length(UnitConversionEnum.INCH_TO_INCH, 1.0);
        Assert.assertNotEquals(feet, inch);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength() {
        Length lengthObject = new Length(UnitConversionEnum.FEET_TO_FEET, 0.0, 0.0);
        boolean result = lengthObject.compare();
        Assert.assertTrue(result);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqualLength() {
        Length lengthObject = new Length(UnitConversionEnum.FEET_TO_INCH, 1.0, 1.0);
        boolean result = lengthObject.compare();
        Assert.assertFalse(result);
    }

    @Test
    public void given1FeetAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        Length lengthObject = new Length(UnitConversionEnum.FEET_TO_FEET, 1.0, 1.0);
        boolean result = lengthObject.compare();
        Assert.assertTrue(result);
    }

    @Test
    public void given1InchAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        Length lengthObject = new Length(UnitConversionEnum.INCH_TO_FEET, 12, 1);
        boolean result = lengthObject.compare();
        Assert.assertTrue(result);
    }

    @Test
    public void given1InchAnd1Inch_WhenCompared_ShouldReturnEqualLength() {
        Length lengthObject = new Length(UnitConversionEnum.INCH_TO_INCH, 1.0, 1.0);
        boolean result = lengthObject.compare();
        Assert.assertTrue(result);
    }

    @Test
    public void given1FeetAndSame1FeetObject_WhenEqual_ShouldReturnTrue() {
        Length feet1 = new Length(UnitConversionEnum.FEET_TO_FEET, 1.0);
        boolean result = feet1.equals(feet1);
        Assert.assertTrue(result);
    }

    @Test
    public void given1FeetAndSame1FeetObject_WhenCompared_ShouldReturnEqualLength() {
        Length lengthObject = new Length(UnitConversionEnum.FEET_TO_FEET, 1.0, 1.0);
        boolean result = lengthObject.compare();
        Assert.assertTrue(result);
    }

    @Test
    public void given1YardAnd1Yard_WhenCompared_ShouldReturnEqualLength() {
        Length lengthObject = new Length(UnitConversionEnum.YARDS_TO_YARDS, 1.0, 1.0);
        boolean result = lengthObject.compare();
        Assert.assertTrue(result);
    }

    @Test
    public void given1YardAnd3Feet_WhenCompared_ShouldReturnEqualLength() {
        Length lengthObject = new Length(UnitConversionEnum.YARDS_TO_FEET, 1.0, 3.0);
        boolean result = lengthObject.compare();
        Assert.assertTrue(result);
    }

    @Test
    public void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqualLength() {
        Length lengthObject = new Length(UnitConversionEnum.FEET_TO_YARDS, 3.0, 1);
        boolean result = lengthObject.compare();
        Assert.assertTrue(result);
    }

    @Test
    public void given1FeetAnd1Yard_WhenCompared_ShouldReturnFalse() {
        Length lengthObject = new Length(UnitConversionEnum.FEET_TO_YARDS, 1.0, 1.0);
        boolean result = lengthObject.compare();
        Assert.assertFalse(result);
    }

    @Test
    public void given1InchAnd1Yard_WhenCompared_ShouldReturnFalse() {
        Length lengthObject = new Length(UnitConversionEnum.INCHES_TO_YARD, 1.0, 1.0);
        boolean result = lengthObject.compare();
        Assert.assertFalse(result);
    }

    @Test
    public void given36InchAnd1Yard_WhenCompared_ShouldReturnTrue() {
        Length lengthObject = new Length(UnitConversionEnum.INCHES_TO_YARD, 36.0, 1.0);
        boolean result = lengthObject.compare();
        Assert.assertTrue(result);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompared_ShouldReturnTrue() {
        Length lengthObject = new Length(UnitConversionEnum.YARDS_TO_INCHES, 1.0, 36.0);
        boolean result = lengthObject.compare();
        Assert.assertTrue(result);
    }
}
