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

    public UnitManipulator(Object firstUnitName, double valueOne,Object secondUnitName, double valueTwo) {
        this.firstUnitName = firstUnitName.toString();
        this.secondUnitName = secondUnitName.toString();
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    public <T extends Enum<T> & IUnitConversion> boolean compare(Class<T> className) {
        Map<String,IUnitConversion> enumMapList=new HashMap<>();
        List<IUnitConversion> enumList= Arrays.asList(className.getEnumConstants());
        for(IUnitConversion enumName:enumList){
            enumMapList.put(enumName.toString(),enumName);
        }
        return Double.compare(enumMapList.get(firstUnitName).convert(valueOne), enumMapList.get(secondUnitName).convert(valueTwo)) == 0;
    }

    public  <T extends Enum<T> & IUnitConversion> double addTwoUnit(Class<T> className) {
        Map<String,IUnitConversion> enumMapList=new HashMap<>();
        List<IUnitConversion> enumList= Arrays.asList(className.getEnumConstants());
        for(IUnitConversion enumName:enumList){
            enumMapList.put(enumName.toString(),enumName);
        }
        return enumMapList.get(firstUnitName).convert(valueOne) + enumMapList.get(secondUnitName).convert(valueTwo);
    }
}
