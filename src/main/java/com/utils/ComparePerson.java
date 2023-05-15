package com.utils;

import com.interfaces.IComparePerson;
import com.people.Person;

public class ComparePerson implements IComparePerson {
    @Override
    public Boolean compare(Person t1,  Person t2) {
        return t1.getName().equalsIgnoreCase(t2.getName());
    }


}
