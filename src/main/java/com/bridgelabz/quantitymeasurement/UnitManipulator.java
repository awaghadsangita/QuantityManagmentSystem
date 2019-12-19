package com.bridgelabz.quantitymeasurement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnitManipulator<T> {
    private String firstUnitName;
    private String secondUnitName;
    private double valueOne;
    private double valueTwo;
    private Class<T> unitEnumClassName;
    Map<String, IUnitConversion> enumMapList = null;

    public UnitManipulator(Object firstUnitName, double valueOne, Object secondUnitName, double valueTwo, Class<T> unitEnumClassName) {
        this.enumMapList = new HashMap<>();
        this.firstUnitName = firstUnitName.toString();
        this.secondUnitName = secondUnitName.toString();
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
        this.unitEnumClassName = unitEnumClassName;
    }

    public <T extends Enum<T> & IUnitConversion> boolean compare() {
        this.setEnumNameMap();
        return Double.compare(this.enumMapList.get(firstUnitName).convert(valueOne), this.enumMapList.get(secondUnitName).convert(valueTwo)) == 0;
    }

    public <T extends Enum<T> & IUnitConversion> void setEnumNameMap() {
        List<IUnitConversion> enumList = (List<IUnitConversion>) Arrays.asList(this.unitEnumClassName.getEnumConstants());
        for (IUnitConversion enumName : enumList) {
            this.enumMapList.put(enumName.toString(), enumName);
        }
    }

    public double addTwoUnit() {
        this.setEnumNameMap();
        return enumMapList.get(firstUnitName).convert(valueOne) + enumMapList.get(secondUnitName).convert(valueTwo);
    }
}
