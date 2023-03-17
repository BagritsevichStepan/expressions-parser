package com.itmo.javaadvanced.expression;

public interface ToMiniString {
    default String toMiniString() {
        return toString();
    }
}