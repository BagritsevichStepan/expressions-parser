package com.itmo.javaadvanced.expression.exceptions;

public class OverflowException extends ExpressionException {
    public OverflowException(String message) {
        super("Overflow in " + message + " operation");
    }
}
