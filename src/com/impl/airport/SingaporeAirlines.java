package com.impl.airport;

import com.airport.Flight;
import com.utils.FoodMenu;
import com.utils.Printer;

public class SingaporeAirlines extends Flight {

    static {

        Printer.print("Have a Nice and Happy Journey with SingaporeAirlines");
    }

    public SingaporeAirlines() {

        super.setFlightName("Singapore Airlines");
        super.setFlightId("SP-AL");
        price = 2000.00;
        source = "Japan";
        destination = "United_States";
        menuList.add(new FoodMenu(true, "Veg Fried Rice", 15));
        menuList.add(new FoodMenu(true, "Kids Meals", 25));
        menuList.add(new FoodMenu(false, "Chicken Fried Rice", 20));

    }

    /*Abstract method implementation */
    public Integer getDiscount() {
        Printer.print("OFFERS : Sorry! no offers at the moment");
        return 0;
    }

    public String getWelcomeMessage() {
        String welcome = "Welcome to Singapore Airlines!!";
        Printer.print(welcome);
        return welcome;
    }

    public Integer getSeatCapacity() {
        Integer num = 90;
        Printer.print("Number of seats :  " + num);
        return num;
    }

    /**
     * Override print flight status to print
     * with flight name
     **/
    @Override
    public void printFlightStatus() {
        Printer.print(super.getFlightName() + " Arrival time :" + super.getArrivalTime());
        Printer.print(super.getFlightName() + " Departure time is :" + super.getDepartureTime());
    }

    /*overrides getPrice abstract method from Flight class*/
    public Double getPrice() {
        return price;
    }

}
