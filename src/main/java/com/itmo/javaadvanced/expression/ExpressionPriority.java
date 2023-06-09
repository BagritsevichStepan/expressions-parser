package com.itmo.javaadvanced.expression;

public interface ExpressionPriority extends Expression, TripleExpression, BigDecimalExpression, DecimalResult {
    int getPriority();
    boolean orderIsImportant();
}
