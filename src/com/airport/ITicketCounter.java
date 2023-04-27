package com.airport;

public interface ITicketCounter {

     String getTicketId();

     void setTicketId(String ticketId);

     String getSource();

     void setSource(String source);

     String getDestination();

     void setDestination(String destination);

     String getPassengerId();

     void setPassengerId(String passengerId);

     String getFlightId();

     void setFlightId(String flightId);

     void bookTicket(String ticketId, String source,
                           String destination, float price,
                           String passengerId, String flightId);

     String getDetails();

     float getPrice();

     void setPrice(float price);
}