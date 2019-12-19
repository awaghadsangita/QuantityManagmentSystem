package com.bridgelabz.quantitymeasurement;

import java.util.*;

public class UnitManipulator<T> {
    private String unitName;
    private double value;
    private Class<T> unitEnumClassName;
    Map<String, IUnitConversion> enumMapList = null;

    public UnitManipulator(Object UnitName, double value, Class<T> unitEnumClassName) {
        this.enumMapList = new HashMap<>();
        this.unitName = UnitName.toString();
        this.value = value;
        this.unitEnumClassName = unitEnumClassName;
    }

    public <T extends Enum<T> & IUnitConversion> boolean compare(UnitManipulator<T> that) throws UnitManipulatorException {
        if (!this.unitEnumClassName.equals(that.unitEnumClassName))
            throw new UnitManipulatorException("Different unit Comparision issue", UnitManipulatorException.ExceptionType.UNIT_TYPE_ISSUE);
        this.setEnumNameMap();
        that.setEnumNameMap();
        return Double.compare(Math.round(this.enumMapList.get(this.unitName).convert(this.value)), Math.round(that.enumMapList.get(that.unitName).convert(that.value))) == 0;
    }

    public <T extends Enum<T> & IUnitConversion> void setEnumNameMap() {
        List<IUnitConversion> enumList = (List<IUnitConversion>) Arrays.asList(this.unitEnumClassName.getEnumConstants());
        for (IUnitConversion enumName : enumList) {
            this.enumMapList.put(enumName.toString(), enumName);
        }
    }

    public double addTwoUnit(UnitManipulator<T> that) throws UnitManipulatorException {
        if (!this.unitEnumClassName.equals(that.unitEnumClassName))
            throw new UnitManipulatorException("Different unit addition issue", UnitManipulatorException.ExceptionType.UNIT_TYPE_ISSUE);
        this.setEnumNameMap();
        that.setEnumNameMap();
        return this.enumMapList.get(this.unitName).convert(this.value) + that.enumMapList.get(that.unitName).convert(that.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitManipulator<?> that = (UnitManipulator<?>) o;
        return Double.compare(that.value, value) == 0 &&
                Objects.equals(unitName, that.unitName) &&
                Objects.equals(unitEnumClassName, that.unitEnumClassName);
    }
}
