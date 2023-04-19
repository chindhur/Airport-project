package task2.airport;

import task2.utils.Printer;

public class Routes {
    private String source;
    private String destination;
    private int noOfFlights;

    public Routes() {
    }

    public Routes(String source, String destination, int noOfFlights) {
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

    public int getNoOfFlights() {
        return noOfFlights;
    }

    public void setNoOfFlights(int noOfFlights) {
        this.noOfFlights = noOfFlights;
    }

    public String getDetails() {
        String details = "source : " + source + "/" +
                "destination : " + destination + "/" +
                "noOfFlights : " + noOfFlights;
        Printer.print(details);
        return details;
    }
}
