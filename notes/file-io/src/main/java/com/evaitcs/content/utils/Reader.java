package com.evaitcs.content.utils;

public interface Reader<T> {

    T read(String fileName);

    void write(T t);

    T map();
}
