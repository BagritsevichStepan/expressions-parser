package com.itmo.javaadvanced.expression.exceptions;

public class PowOverflowException extends OverflowException {
    public PowOverflowException(String message) {
        super(message);
    }
}
