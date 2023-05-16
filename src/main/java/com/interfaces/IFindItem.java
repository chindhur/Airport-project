package com.interfaces;

import java.util.List;

@FunctionalInterface
public interface IFindItem<T> {
    // a method that calculates the number of occurrences
    // of a given element in an array of numbers
    int search(T item, List<T> items);
}

