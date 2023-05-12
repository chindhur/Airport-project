package com.airport;

import com.people.Passenger;
import com.utils.Printer;
import java.sql.Timestamp;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import com.exception.NoSeatLeftException;
import com.exception.InvalidArgumentException;

public class Flight {

    private static int noOfWings;

    static {
        Printer.print("Have a Nice and Happy Journey with our Airlines");
    }

    private final int NO_OF_WHEELS = 18;
    protected String flightId;
    protected String flightName;
    protected String source;
    protected String destination;
    protected Double price;
    List<FoodMenu> menuList;
    List<Passenger> checkedInPassengers;
    //Implements Consumer Lambda- notifies boarding of a passenger
    Consumer<Passenger> notifyBoarding =
            passenger -> Printer.print(passenger.getName() + " boarded flight");
    private Route route;
    private Timestamp arrivalTime;
    private Timestamp departureTime;
    private int noOfSeats = 50;
    private int noOfSeatsLeft;

    /*constructors*/
    public Flight(String flightId, String source, String destination,
                  int noOfSeats, String flightName)
            throws InvalidArgumentException {
        if (destination.equals(source)) {
            throw new InvalidArgumentException("destination and origin are the same");
        }
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.noOfSeats = noOfSeats;
        this.noOfSeatsLeft = noOfSeatsLeft;
        this.flightName = flightName;
        checkedInPassengers = new ArrayList<Passenger>();
    }

    public final int getNoOfWheels() {
        return NO_OF_WHEELS;
    }

    public List<FoodMenu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<FoodMenu> menuList) {
        this.menuList = menuList;
    }

    public void printDiscount() {
        Printer.print("OFFERS: Seasonal Offer : 20% of on Menu");
    }

    public int getSeatCapacity() {
        return noOfSeats;
    }

    public Double getPrice() {
        return price;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public int bookASeat() throws NoSeatLeftException {
        if (noOfSeatsLeft > 0) {
            noOfSeatsLeft = noOfSeatsLeft - 1;
            Printer.debug("Ticket booked " + noOfSeatsLeft);
            return noOfSeatsLeft;
        }
        throw new NoSeatLeftException(getFlightId() + " : There are no seats left to book");
    }

    public List<FoodMenu> getMenu() {
        return menuList;
    }

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

    public void printDetails() {
        Printer.print("The details of the flight :");
        Printer.print("flight id :" + flightId);
        Printer.print("flight name:" + flightName);
        Printer.print("flight source : " + source);
        Printer.print("flight destination : " + destination);
        checkedInPassengers.forEach(notifyBoarding);//
    }

    public void printFlightStatus() {
        Printer.print("arrival time :" + arrivalTime);
        Printer.print("Departure time is :" + departureTime);
    }

    public void checkInPassenger(Passenger passenger) {
        // Todo: add case for already checked in case
        checkedInPassengers.add(passenger);
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

    public enum FoodType {
        VEG,
        NONVEG,
        KIDSFOOD
    }
}

