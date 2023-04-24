package com.airport;

import com.person.Person;
import com.utils.Printer;
import com.person.Item;
import java.util.ArrayList;
import java.util.List;

public class Passenger implements Item {
    Person passenger;
    Luggage luggage;
    private List<String> items;

    public Passenger(Person passenger, Luggage luggage) {
        this.passenger = passenger;
        this.luggage = luggage;
        this.items = new ArrayList<String>();

    }

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item){
        items.remove(item);
    }

    public Boolean hasMetalObject() {
        if (items.contains("metal")) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean hasExplosiveObject() {
        if (items.contains("explosive")) {
            return true;
        } else {
            return false;
        }
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
