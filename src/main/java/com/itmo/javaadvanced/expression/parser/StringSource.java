package com.itmo.javaadvanced.expression.parser;

public class StringSource implements CharSource {
    protected final String source;
    protected int pos = 0;

    public StringSource(String source) {
        this.source = source;
    }

    public int getSourceLength() {
        return source.length();
    }

    @Override
    public boolean hasNext() {
        return pos < source.length();
    }

    @Override
    public char getNext() {
        return source.charAt(pos++);
    }

    @Override
    public int getPos() {
        return pos;
    }
}
