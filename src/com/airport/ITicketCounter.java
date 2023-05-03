package com.airport;

import com.exception.NoSeatLeftException;
import com.impl.airport.Passenger;

public interface ITicketCounter {

     Ticket bookTicket(Flight flight, Passenger passenger,double price) throws NoSeatLeftException;

     void printDetails();
}