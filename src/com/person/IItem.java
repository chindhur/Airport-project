package com.person;

public interface IItem {

    void addItem(String item);

    void removeItem(String item);

    Boolean hasMetalObject();

    Boolean hasExplosiveObject();
}