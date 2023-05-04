package com.airport;

import com.exception.NoSeatLeftException;
import com.interfaces.ITicketCounter;
import com.people.Passenger;
import com.utils.Printer;
import java.util.ArrayList;
import java.util.List;

public class AirportTicketCounter implements ITicketCounter {

    List<Ticket> tickets;
    private Ticket ticket;

    public AirportTicketCounter(){
        tickets = new ArrayList<Ticket>();
    }

    public Ticket bookTicket(Flight flight, Passenger passenger, double price)
            throws NoSeatLeftException,IllegalArgumentException {
        if(flight == null || passenger == null){
            throw new IllegalArgumentException("Invalid input supplied");
        }
        //Invoking bookASeat method from flight object with in the ticket
        Printer.debug("Booking flight seat");
        int ticketNumber = flight.bookASeat();
        String flightId = flight.getFlightId();
        //updating ticket id to Ticket class
        Ticket ticket = new Ticket(flight, passenger, price);
        ticket.setTicketId(flightId + ticketNumber);
        tickets.add(ticket);
        Printer.debug("Booked flight seat");
        return ticket;
    }

    @Override
    public void printDetails() {
        Printer.print("The details are:"+ ticket.getTicketId()+
                "Source is :" + ticket.getFlight().getSource()+
                "destination is:" +ticket.getFlight().getDestination());
        ticket.getPassenger().printDetails();
    }
}


