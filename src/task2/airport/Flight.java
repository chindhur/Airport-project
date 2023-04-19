package task2.airport;

import task2.utils.Printer;

import java.sql.Timestamp;
import java.util.List;

public abstract class Flight {
    protected String flightId;
    protected String flightName;
    protected String source;
    protected String destination;
    protected Double price;
    private Timestamp arrivalTime;
    private Timestamp departureTime;

    /*constructor*/
    public Flight() {
    }

    public Flight(String flightId, String flightName,
                  String source, String destination, Timestamp arrivalTime,
                  Timestamp departureTime, Double price) {
        this.flightId = flightId;
        this.flightName = flightName;
        this.source = source;
        this.destination = destination;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.price = price;
    }

    /*Abstract methods*/
    public abstract List<String> getMenu();

    public abstract Integer getDiscount();

    public abstract String getWelcomeMessage();

    public abstract Integer getSeatCapacity();

    public abstract Double getPrice();

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
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

    public Timestamp getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Timestamp arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Timestamp getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Timestamp departureTime) {
        this.departureTime = departureTime;
    }

    public void printFlightDetails() {
        System.out.println("The details of the flight :");
        System.out.println("flight id :" + flightId);
        System.out.println("flight name:" + flightName);
        System.out.println("flight source : " + source);
        System.out.println("flight destination : " + destination);
    }

    public void printFlightStatus() {
        Printer.print("arrival time :" + arrivalTime);
        Printer.print("Departure time is :" + departureTime);
    }

    @Override
    public String toString() {
        // return string name of flight
        return flightName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final Flight other = (Flight) obj;
        if ((this.flightName == null) ?
                (other.flightName != null) : !this.flightName.equals(other.flightName)) {
            return false;
        }

        if (!this.flightId.equals(other.flightId)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + (this.flightName != null ? this.flightName.hashCode() : 0);
        hash = 53 * hash + this.flightId.hashCode();
        return hash;
    }

}
