package com.airport;

import com.person.Person;
import com.utils.Printer;

public class Passenger {
    Person passenger;
    Luggage luggage;

    /* Default Constructor */
    public Passenger() {
    }

    public Passenger(Person passenger, Luggage luggage) {
        this.passenger = passenger;
        this.luggage = luggage;
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

    public void getDetails(){
        Printer.print(passenger.getName());
        Printer.print(luggage.getLuggageDetails());
    }
}
