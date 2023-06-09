package com.itmo.javaadvanced.expression;

import java.math.BigDecimal;

public interface BigDecimalExpression extends ToMiniString {
    BigDecimal evaluate(BigDecimal x, boolean checkedMode);
}