package com.impl.airport;

import com.Exception.NoSeatLeftException;
import com.airport.ITicketCounter;
import com.airport.Ticket;
import com.utils.Printer;
import java.util.ArrayList;
import java.util.List;

public class AirportTicketCounter implements ITicketCounter {

    List<Ticket> tickets;
    private Ticket ticket;

    public AirportTicketCounter(){
        tickets = new ArrayList<Ticket>();
    }

    public Ticket bookTicket(Ticket ticket)
            throws NoSeatLeftException,IllegalArgumentException {
        if(ticket == null){
            throw new IllegalArgumentException("Invalid Ticket");
        }
        //Invoking bookASeat method from flight object with in the ticket
        Printer.debug("Booking flight seat");
        int ticketNumber = ticket.getFlight().bookASeat();
        String flightId = ticket.getFlight().getFlightId();
        //updating ticket id to Ticket class
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


