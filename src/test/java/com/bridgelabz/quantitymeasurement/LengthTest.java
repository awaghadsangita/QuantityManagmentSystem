package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class LengthTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnTrue() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        boolean result = feet1.equals(feet2);
        Assert.assertFalse(result);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnTrue() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        boolean result = inch1.equals(inch2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqual() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length inch = new Length(Length.Unit.INCH, 1.0);
        Assert.assertNotEquals(feet, inch);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength() {
        Length feet = new Length(Length.Unit.FEET, 0.0);
        Length inch = new Length(Length.Unit.INCH, 0.0);
        boolean result = feet.compare(inch);
        Assert.assertTrue(result);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqualLength() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length inch = new Length(Length.Unit.INCH, 1.0);
        boolean result = feet.compare(inch);
        Assert.assertFalse(result);
    }

    @Test
    public void given1FeetAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        boolean result = feet.compare(feet1);
        Assert.assertTrue(result);
    }

    @Test
    public void given1InchAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        Length inch = new Length(Length.Unit.INCH, 12);
        Length feet = new Length(Length.Unit.FEET, 1);
        boolean result = inch.compare(feet);
        Assert.assertTrue(result);
    }

    @Test
    public void given1InchAnd1Inch_WhenCompared_ShouldReturnEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        boolean result = inch1.compare(inch2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1FeetAndNull_WhenEqual_ShouldReturnFalse() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        boolean result = feet1.equals(null);
        Assert.assertFalse(result);
    }

    @Test
    public void given1FeetAndSame1FeetObject_WhenEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        boolean result = feet1.equals(feet1);
        Assert.assertTrue(result);
    }

    @Test
    public void given1FeetAndSame1FeetObject_WhenCompared_ShouldReturnEqualLength() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        boolean result = feet.compare(feet);
        Assert.assertTrue(result);
    }

    @Test
    public void given1YardAnd1Yard_WhenCompared_ShouldReturnEqualLength() {
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        Length yard2 = new Length(Length.Unit.YARD, 1.0);
        boolean result = yard1.compare(yard2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1YardAnd3Feet_WhenCompared_ShouldReturnEqualLength() {
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        Length feet = new Length(Length.Unit.FEET, 3.0);
        boolean result = yard1.compare(feet);
        Assert.assertTrue(result);
    }

    @Test
    public void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqualLength() {
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length feet = new Length(Length.Unit.FEET, 3.0);
        boolean result = feet.compare(yard);
        Assert.assertTrue(result);
    }

    @Test
    public void given3FeetAndNull_WhenCompared_ShouldReturnFalse() {
        Length null1 = new Length(Length.Unit.NULL, 1.0);
        Length feet = new Length(Length.Unit.FEET, 3.0);
        boolean result = feet.compare(null1);
        Assert.assertFalse(result);
    }

    @Test
    public void given1FeetAnd1Yard_WhenCompared_ShouldReturnFalse() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        boolean result = feet.compare(yard);
        Assert.assertFalse(result);
    }

    @Test
    public void given1InchAnd1Yard_WhenCompared_ShouldReturnFalse() {
        Length inch = new Length(Length.Unit.INCH, 1.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        boolean result = inch.compare(yard);
        Assert.assertFalse(result);
    }

    @Test
    public void given36InchAnd1Yard_WhenCompared_ShouldReturnTrue() {
        Length inch = new Length(Length.Unit.INCH, 36.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        boolean result = inch.compare(yard);
        Assert.assertTrue(result);
    }
}
