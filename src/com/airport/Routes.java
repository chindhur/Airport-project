package com.airport;

import com.utils.Printer;

public class Routes {
    private String source;
    private String destination;
    private String noOfFlights;

    public Routes() {
    }

    public Routes(String source, String destination, String noOfFlights) {
        this.source = source;
        this.destination = destination;
        this.noOfFlights = noOfFlights;
    }

    public String getSource() {
        return source;
    }


    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getNoOfFlights() {
        return noOfFlights;
    }

    public void setNoOfFlights(String noOfFlights) {
        this.noOfFlights = noOfFlights;
    }

    public String getDetails(){
        String details = "source : " + source + "/" +
                "destination : " + destination + "/" +
                "noOfFlights : " + noOfFlights;
        Printer.print(details);
        return details;
    }
}
