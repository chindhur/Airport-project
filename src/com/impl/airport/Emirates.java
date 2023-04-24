package com.impl.airport;

import com.airport.Flight;
import com.utils.Printer;
import com.utils.FoodMenu;

public class Emirates extends Flight  {

    static{
        Printer.print("Have a Nice and Happy Journey with Emirates");
    }
    public Emirates() {
        super.setFlightName("Emirates Airlines");
        super.setFlightId("ES-AL");
        price = 1250.00;
        source = "United_States";
        destination = "United_Arab_Emirates";
        menuList.add(new FoodMenu(true, "Veg Burger", 15));
        menuList.add(new FoodMenu(true, "Pizza", 25));
        menuList.add(new FoodMenu(false, "Chicken Burger", 20));
    }

    /*Abstract method implementation */

    public Integer getDiscount() {
        Printer.print("OFFERS: Seasonal Offer : 20% of on Menu");
        return 0;
    }

    public String getWelcomeMessage() {
        String welcome = "Welcome to Emirates Airlines!!";
        Printer.print(welcome);
        return welcome;
    }

    public Integer getSeatCapacity() {
        Integer num = 70;
        Printer.print("Number of seats :  " + num);
        return num;
    }

    /**
     * Override print flight status to print
     * with flight name
     **/
    @Override
    public void printDetails() {
        Printer.print("The details of the flight :");
        Printer.print("flight id :" + super.getFlightId());
        Printer.print("flight name:" + super.getFlightName());
        Printer.print("flight source : " + super.getSource());
        Printer.print("flight destination : " + super.getDestination());

    }

    /* implements getPrice abstract method from Flight class*/
    public Double getPrice() {
        return price;
    }
}
