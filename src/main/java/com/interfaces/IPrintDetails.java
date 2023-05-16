package com.interfaces;

@FunctionalInterface
public interface IPrintDetails<T> {
    void print(T t);
}
