package com.impl.airport;

import com.airport.Flight;
import com.utils.FoodMenu;
import com.utils.Printer;
import java.sql.Timestamp;


public class SouthWestAirlines extends Flight {

    static{

        Printer.print("Have a Nice and Happy Journey with SouthWest Airlines");
    }

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
        // Add food menu
        menuList.add(new FoodMenu(true, "Veg Fried Rice", 15));
        menuList.add(new FoodMenu(true, "Kids Meals", 25));
        menuList.add(new FoodMenu(false, "Chicken Fried Rice", 20));

    }

    /*Abstract method implementation */
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
    public void printDetails() {
        Printer.print("The details of Southwest Airlines:");
        Printer.print("flight id :" + super.getFlightId());
        Printer.print("flight name:" + super.getFlightName());
        Printer.print("flight source : " + super.source);
        Printer.print("flight destination : " + super.destination);
    }

    /*overrides getPrice abstract method from Flight class*/
    public Double getPrice() {
        return price;
    }

}
