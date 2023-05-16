package com.interfaces;

@FunctionalInterface
public interface IFilterDetails<T> {
    boolean filter(T t);
}
