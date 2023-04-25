package com.impl.airport;

import com.airport.Flight;
import com.utils.FoodMenu;
import com.utils.Printer;
import java.util.ArrayList;
import java.util.List;

public class UnitedAirlines extends Flight {
    List<FoodMenu> menuList = new ArrayList<FoodMenu>();

    static{

        Printer.print("Have a Nice and Happy Journey with United Airlines");
    }

    public UnitedAirlines() {
        setFlightName("United Airlines");
        setFlightId("UN-AL");
        price = 1800.00;
        source = "India";
        destination = "United_Arab_Emirates";

        menuList.add(new FoodMenu(true, "Veg Noodles", 15));
        menuList.add(new FoodMenu(true, "Pasta", 20));
        menuList.add(new FoodMenu(true, "Mango MilkShake", 25));
        menuList.add(new FoodMenu(false, "Chicken Noodles", 20));


    }

    /*Abstract method implementation */

    public Integer getDiscount() {
        Printer.print("OFFERS: Sorry! no offers at the moment");
        return 0;
    }

    public String getWelcomeMessage() {
        String welcome = "Welcome to United Airlines!!";
        Printer.print(welcome);
        return welcome;
    }

    public Integer getSeatCapacity() {
        Integer num = 55;
        Printer.print("Number of seats :  " + num);
        return num;
    }

    /*overrides getPrice abstract method from Flight class*/
    public Double getPrice() {
        return price;

    }
}
