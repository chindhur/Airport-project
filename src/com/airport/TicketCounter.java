package com.airport;

import com.utils.Printer;

public class TicketCounter {
    private String ticketId;
    private String source;

    private String destination;

    private float price;

    private String passengerId;
    private String flightId;

    /* default constructor */
    public TicketCounter() {
    }

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
     * @param destination in the ticket
     * @param price       in the ticket
     * @param passengerId in the ticket
     * @param flightId    in the ticket
     */
    public void bookTicket(String ticketId, String source,
                           String destination, float price,
                           String passengerId, String flightId) {
        if (ticketId == null || source == null || destination == null
                || price == 0 || flightId == null || passengerId == null) {
            System.out.println("Invalid value supplied");
            return;
        }
        this.ticketId = ticketId;
        this.destination = destination;
        this.price = price;
        this.source = source;
        this.passengerId = passengerId;
        this.flightId = flightId;
        return;
    }

    /**
     * Gets Ticket details
     */
    public String getTicketDetails() {
        String details = "{ticketId :" + ticketId +
                "The travel source location is :" + source +
                "The travel destination is :" + destination +
                "The passengerId is: " + passengerId +
                "flight Id is :" + flightId + "}";
        Printer.print("details are : " + details);
        return details;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}