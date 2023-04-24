package com.impl.airport.route;

import com.airport.Route;
import com.utils.Printer;

public class SingaporeRoute implements Route {
    private final String SOURCE = "Singapore";
    private String destination;
    private int noOfFlights;

    public SingaporeRoute(String destination, int noOfFlights) {
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
