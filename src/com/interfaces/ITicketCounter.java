package com.interfaces;

import com.airport.Flight;
import com.airport.Ticket;
import com.exception.NoSeatLeftException;
import com.people.Passenger;

public interface ITicketCounter {

     Ticket bookTicket(Flight flight, Passenger passenger, double price) throws NoSeatLeftException;

     void printDetails();
}