package com.impl.airport;

import com.exception.LimitExceededException;
import com.airport.IItem;
import com.person.Person;
import com.utils.Printer;
import java.util.ArrayList;
import java.util.List;

public class Passenger implements IItem {

    private static final int MAX_ALLOWED_LUGGAGE = 2;
    private Person passenger;
    private Luggage luggage;
    private List<String> cabinItems;

    public Passenger(Person passenger, Luggage luggage) {
        this.passenger = passenger;
        this.luggage = luggage;
        this.cabinItems = new ArrayList<String>();
    }

    public void addLuggage()
            throws LimitExceededException {
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

    public Person getPassenger() {
        return passenger;
    }

    public void setPassenger(Person passenger) {
        this.passenger = passenger;
    }

    public Luggage getLuggage() {
        return luggage;
    }

    public void setLuggage(Luggage luggage) {
        this.luggage = luggage;
    }

    public void printDetails() {
        Printer.print("Passenger Name : " + passenger.getName());
        Printer.print("Associated Luggage " + luggage.getLuggageDetails());
    }

    public String toString() {
        // return string name of flight
        return passenger.getName();
    }

    public int hashCode() {
        // return flightId as hashCode as it is unique
        // per object
        return Integer.valueOf(passenger.getName());
    }
}
