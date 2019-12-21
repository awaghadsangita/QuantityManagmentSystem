package com.bridgelabz.quantitymeasurement;

import java.util.*;

public class UnitManipulator {
    private IUnitConversion unitName;
    private double value;

    public UnitManipulator(IUnitConversion UnitName, double value) {
        this.unitName = UnitName;
        this.value = value;
    }

    public boolean compare(UnitManipulator that) throws UnitManipulatorException {
        if (!this.unitName.getClass().equals(that.unitName.getClass()))
            throw new UnitManipulatorException("Different Unit Comparision issue", UnitManipulatorException.ExceptionType.UNIT_TYPE_ISSUE);
        return Double.compare(Math.round(this.unitName.convert(this.value)), Math.round(that.unitName.convert(that.value))) == 0;
    }

    public double addTwoUnit(UnitManipulator that) throws UnitManipulatorException {
        if (!this.unitName.getClass().equals(that.unitName.getClass()))
            throw new UnitManipulatorException("units addition issue", UnitManipulatorException.ExceptionType.UNIT_TYPE_ISSUE);
        if (this.unitName.equals(TemperatureConverterEnum.class))
            throw new UnitManipulatorException("temperature should not be added", UnitManipulatorException.ExceptionType.TEMPERATURE_ADDITION_ISSUE);
        return this.unitName.convert(this.value) + that.unitName.convert(that.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitManipulator that = (UnitManipulator) o;
        return Double.compare(that.value, value) == 0 &&
                Objects.equals(unitName, that.unitName);
    }
}
