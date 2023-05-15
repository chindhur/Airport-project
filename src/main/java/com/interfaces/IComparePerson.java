package com.interfaces;

import com.people.Person;

public interface IComparePerson<T extends Person> {
    Boolean compare(T t1, T t2);
}
