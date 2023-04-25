package com.airport;

public interface ITicketCounter {

    public String getTicketId();

    public void setTicketId(String ticketId);

    public String getSource();

    public void setSource(String source);

    public String getDestination();

    public void setDestination(String destination);

    public String getPassengerId();

    public void setPassengerId(String passengerId);

    public String getFlightId();

    public void setFlightId(String flightId);

    public void bookTicket(String ticketId, String source,
                           String destination, float price,
                           String passengerId, String flightId);

    public String getDetails();

    public float getPrice();

    public void setPrice(float price);
}