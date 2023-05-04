package com.people;

import com.exception.LimitExceededException;
import com.interfaces.IItem;
import com.airport.Luggage;
import com.utils.Printer;
import java.util.ArrayList;
import java.util.List;

public class Passenger extends Person implements IItem  {

    private static final int MAX_ALLOWED_LUGGAGE = 2;
    private Luggage luggage;
    private List<String> cabinItems;

    public Passenger(Luggage luggage,String name, Integer age, Address address, Gender gender) {
        super(name,age,address,gender);
        this.luggage = luggage;
        this.cabinItems = new ArrayList<String>();
    }

    public void addLuggage() throws LimitExceededException {
        if (luggage.getNoOfLuggage() >= MAX_ALLOWED_LUGGAGE)
            throw new LimitExceededException("No of Luggage limit got exceeded");
        luggage.setNoOfLuggage(luggage.getNoOfLuggage() + 1);
    }

    public void addItem(String item) {
        cabinItems.add(item);
    }

    public void removeItem(String item) {
        cabinItems.remove(item);
    }

    public Boolean hasMetalObject() {
        return (cabinItems.contains("metal"));
    }

    public Boolean hasExplosiveObject() {
        return (cabinItems.contains("explosive"));
    }

    public Luggage getLuggage() {
        return luggage;
    }

    public void setLuggage(Luggage luggage) {
        this.luggage = luggage;
    }

    public void printDetails() {
        Printer.print("Passenger Name : " + getName());
        Printer.print("Associated Luggage " + luggage.getLuggageDetails());
    }

    public String toString() {
        // return string name of flight
        return getName();
    }

    public int hashCode() {
        // return flightId as hashCode as it is unique
        // per object
        return Integer.valueOf(getName());
    }
}
