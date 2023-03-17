package com.itmo.javaadvanced.expression.exceptions;

public class NegateOverflowException extends OverflowException {
    public NegateOverflowException(String message) {
        super(message);
    }
}
