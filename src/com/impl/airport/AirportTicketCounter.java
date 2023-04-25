package com.impl.airport;

import com.airport.ITicketCounter;
import com.utils.Printer;

public class AirportTicketCounter implements ITicketCounter {
    private String ticketId;
    private String source;
    private String destination;
    private float price;
    private String passengerId;
    private String flightId;
    public String getTicketId() {
        return ticketId;
    }
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getPassengerId() {
        return passengerId;
    }
    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }
    public String getFlightId() {
        return flightId;
    }
    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    /**
     * Book ticket in TicketCounter
     *
     * @param ticketId    Ticket Identifier
     * @param source      Source in the ticket
     * @param destination destination in the ticket
     * @param price       price in the ticket
     * @param passengerId passengerId in the ticket
     * @param flightId    flightId in the ticket
     */
    public void bookTicket(String ticketId, String source,
                           String destination, float price,
                           String passengerId, String flightId) {
        if (ticketId == null || source == null || destination == null
                || price == 0 || flightId == null || passengerId == null) {
            Printer.print("Invalid value supplied");
        }
        this.source = source;
        this.ticketId= ticketId;
        this.destination = destination;
        this.passengerId = passengerId;
        this.price=price;
        this.flightId=flightId;

    }
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDetails() {
        String details = "ticketId :" + ticketId + System.lineSeparator() +
                " The travel source location is :" + source + System.lineSeparator() +
                " The travel destination is :" + destination + System.lineSeparator() +
                " The passengerId is: " + passengerId + System.lineSeparator() +
                " flight Id is :" + flightId ;
        return details;
    }



}

