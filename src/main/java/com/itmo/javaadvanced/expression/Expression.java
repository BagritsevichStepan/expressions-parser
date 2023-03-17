package com.itmo.javaadvanced.expression;

public interface Expression extends ToMiniString {
    int evaluate(int x, boolean checkedMode);
}