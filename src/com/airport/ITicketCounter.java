package com.airport;

import com.exception.NoSeatLeftException;

public interface ITicketCounter {

     Ticket bookTicket(Ticket ticket) throws NoSeatLeftException;

     void printDetails();
}