package com.impl.airport;

import com.airport.IItem;
import com.person.Person;
import com.utils.Printer;
import java.util.ArrayList;
import java.util.List;

public class Passenger implements IItem {

    private Person passenger;
    private Luggage luggage;
    private List<String> cabinItems;

    public Passenger(Person passenger, Luggage luggage) {
        this.passenger = passenger;
        this.luggage = luggage;
        this.cabinItems = new ArrayList<String>();
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
        Printer.print("Assocaited Luggage " + luggage.getLuggageDetails());
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
