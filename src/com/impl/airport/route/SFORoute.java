package com.impl.airport.route;

import com.airport.Route;
import com.utils.Printer;

public class SFORoute implements Route {
    private final String SOURCE = "SFO";
    private String destination;
    private int noOfFlights;
    public SFORoute( String destination, int noOfFlights) {
        this.destination = destination;
        this.noOfFlights = noOfFlights;
    }

    public String getSource() {
        return SOURCE;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNoOfFlights() {
        return noOfFlights;
    }

    public void setNoOfFlights(int noOfFlights) {
        this.noOfFlights = noOfFlights;
    }

}
