package com.airport;

import com.impl.airport.Passenger;

import javax.print.PrintException;
import java.io.FileWriter;
import java.io.IOException;

public class Ticket {

    private Flight flight;
    private Passenger passenger;
    private double price;
    private String ticketId;

    public Ticket(Flight flight, Passenger passenger, double price) {
        this.flight=flight;
        this.passenger=passenger;
        this.price=price;
    }

    // Not exposing setter and getter for passenger and flight
    // It is determined at the time of object instantiation and it cannot be changed later.

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getTicketId(){
        return ticketId;
    }

    @Override
    public String toString() {
        String one = "The details are :";
        String two = flight.getFlightName();
        String three = ", " + flight.getSource() + " to " + flight.getDestination();
        String four = ", ticket price: " + price + "$";
        return (one + two + three + four);
    }

    public void writeTicketToFile(String filePath)
        throws PrintException {
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(toString());
        } catch (IOException e) {
            throw new PrintException(e.getMessage());
        }
    }

    public Flight getFlight() {
        return flight;
    }
    public void setFlight(Flight flight) {
        this.flight=flight;
    }
    public Passenger getPassenger() {
        return passenger;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price=price;
    }
}
