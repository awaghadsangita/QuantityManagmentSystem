package com.bridgelabz.quantitymeasurement;

import java.util.*;

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

    public <T extends Enum<T> & IUnitConversion> boolean compare() throws UnitManipulatorException {
        try {
            this.setEnumNameMap();
            return Double.compare(Math.round(this.enumMapList.get(firstUnitName).convert(valueOne)), Math.round(this.enumMapList.get(secondUnitName).convert(valueTwo))) == 0;
        }catch(NullPointerException e){
            throw new UnitManipulatorException("Different unit Comparision issue",UnitManipulatorException.ExceptionType.UNIT_TYPE_ISSUE);
        }
    }

    public <T extends Enum<T> & IUnitConversion> void setEnumNameMap() {
        List<IUnitConversion> enumList = (List<IUnitConversion>) Arrays.asList(this.unitEnumClassName.getEnumConstants());
        for (IUnitConversion enumName : enumList) {
            this.enumMapList.put(enumName.toString(), enumName);
        }
    }

    public double addTwoUnit() throws UnitManipulatorException {
        try {
            this.setEnumNameMap();
            return enumMapList.get(firstUnitName).convert(valueOne) + enumMapList.get(secondUnitName).convert(valueTwo);
        }catch(NullPointerException e){
            throw new UnitManipulatorException("Different unit Comparision issue",UnitManipulatorException.ExceptionType.UNIT_TYPE_ISSUE);
        }
    }

}
