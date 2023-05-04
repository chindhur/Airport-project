package com.airport;

import com.interfaces.IRoute;

public class Route implements IRoute {

    private String source;
    private String destination;
    private int noOfFlights;

    public Route(String source, String destination, int noOfFlights) {
        this.source = source;
        this.destination = destination;
        this.noOfFlights = noOfFlights;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getNoOfFlights() {
        return noOfFlights;
    }

}
