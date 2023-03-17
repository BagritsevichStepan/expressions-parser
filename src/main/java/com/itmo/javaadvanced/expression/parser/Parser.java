package com.itmo.javaadvanced.expression.parser;

import com.itmo.javaadvanced.expression.ExpressionPriority;
import com.itmo.javaadvanced.expression.exceptions.ParsingException;

public interface Parser {
    ExpressionPriority parse(String expression) throws ParsingException;
}
