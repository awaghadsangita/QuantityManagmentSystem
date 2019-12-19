package com.bridgelabz.quantitymeasurement;

public class UnitManipulatorException extends Exception {
    enum ExceptionType{UNIT_TYPE_ISSUE}
    ExceptionType type;

    public UnitManipulatorException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
