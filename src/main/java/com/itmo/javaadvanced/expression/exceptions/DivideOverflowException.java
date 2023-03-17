package com.itmo.javaadvanced.expression.exceptions;

public class DivideOverflowException extends OverflowException {
    public DivideOverflowException(String message) {
        super(message);
    }
}
