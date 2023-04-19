package task2.impl.airport;

import task2.airport.Flight;
import task2.utils.Printer;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


public class SouthWestAirlines extends Flight {
    public SouthWestAirlines(String flightId, String flightName,
                             String source, String destination, Timestamp arrivalTime,
                             Timestamp departureTime, Double price) {
        super(flightId, flightName, source, destination, arrivalTime, departureTime, price);
    }

    public SouthWestAirlines() {
        /*accessing the protected variables of parent class*/
        source = "Africa";
        destination = "Australia";
        price = 1500.00;
        flightName = "SouthWest Airlines";
        flightId = "SW-AL";
    }

    /*Abstract method implementation */
    public List<String> getMenu() {
        List<String> menuList = new ArrayList<String>();
        menuList.add("Veg Pizza - 130$");
        menuList.add("Non-veg Pizza - 145$");
        Printer.print("My Menu " + menuList.toString());
        return menuList;
    }

    public Integer getDiscount() {
        Printer.print("OFFERS: Seasonal Offer : 40% off on meal");
        return 0;
    }

    public String getWelcomeMessage() {
        String welcome = "Welcome to South West Airlines!!";
        Printer.print(welcome);
        return welcome;
    }

    public Integer getSeatCapacity() {
        Integer num = 85;
        Printer.print("Number of seats :  " + num);
        return num;
    }

    /**
     * Override print flight status to print
     * with flight name
     **/

    @Override
    public void printFlightDetails() {
        System.out.println("The details of the flight :");
        System.out.println("flight id :" + super.getFlightId());
        System.out.println("flight name:" + super.getFlightName());
        System.out.println("flight source : " + super.source);
        System.out.println("flight destination : " + super.destination);
    }

    /*overrides getPrice abstract method from Flight class*/
    public Double getPrice() {
        return price;
    }

}
