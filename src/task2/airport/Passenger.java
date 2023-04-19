package task2.airport;

import task2.person.Person;
import task2.utils.Printer;

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

    public void getDetails() {
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
