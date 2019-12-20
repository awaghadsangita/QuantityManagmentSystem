package com.bridgelabz.quantitymeasurement;

import java.util.*;

public class UnitManipulator<T> {
    private String unitName;
    private double value;
    private Class<T> unitEnumClassName;
    Map<String, IUnitConversion> enumMapList;

    public UnitManipulator(Object UnitName, double value, Class<T> unitEnumClassName) {
        this.enumMapList = new HashMap<>();
        this.unitName = UnitName.toString();
        this.value = value;
        this.unitEnumClassName = unitEnumClassName;
    }

    public boolean compare(UnitManipulator<T> that) throws UnitManipulatorException {
        if (!this.unitEnumClassName.equals(that.unitEnumClassName))
            throw new UnitManipulatorException("Different Unit Comparision issue", UnitManipulatorException.ExceptionType.UNIT_TYPE_ISSUE);
        this.setEnumNameMap();
        return Double.compare(Math.round(this.enumMapList.get(this.unitName).convert(this.value)), Math.round(this.enumMapList.get(that.unitName).convert(that.value))) == 0;
    }

    public <T extends Enum<T> & IUnitConversion> void setEnumNameMap() {
        List<IUnitConversion> enumList = (List<IUnitConversion>) Arrays.asList(this.unitEnumClassName.getEnumConstants());
        for (IUnitConversion enumName : enumList) {
            this.enumMapList.put(enumName.toString(), enumName);
        }
    }

    public double addTwoUnit(UnitManipulator<T> that) throws UnitManipulatorException {
        if (!this.unitEnumClassName.equals(that.unitEnumClassName))
            throw new UnitManipulatorException("units addition issue", UnitManipulatorException.ExceptionType.UNIT_TYPE_ISSUE);
        if(this.unitEnumClassName.equals(TemperatureConverterEnum.class))
            throw new UnitManipulatorException("temperature should not be added", UnitManipulatorException.ExceptionType.TEMPERATURE_ADDITION_ISSUE);
        this.setEnumNameMap();
        return this.enumMapList.get(this.unitName).convert(this.value) + this.enumMapList.get(that.unitName).convert(that.value);
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
