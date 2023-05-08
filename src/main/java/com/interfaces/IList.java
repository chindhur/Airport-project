package com.interfaces;

import com.exception.NotFoundException;

public interface IList<T> {
    boolean add(T data);
    boolean remove(T data) throws NotFoundException;
    T get(int index) throws NotFoundException,IndexOutOfBoundsException;
    int size();
    void printNodes();

}
