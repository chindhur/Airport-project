package task2.impl.airport;

import task2.airport.Flight;
import task2.utils.Printer;

import java.util.ArrayList;
import java.util.List;

public class UnitedAirlines extends Flight {
    public UnitedAirlines() {
        super.setFlightName("United Airlines");
        super.setFlightId("UN-AL");
        price = 1800.00;
        source = "India";
        destination = "United_Arab_Emirates";
    }

    /*Abstract method implementation */
    public List<String> getMenu() {
        List<String> menuList = new ArrayList<String>();
        menuList.add("Veg Burger - 30$");
        menuList.add("Non-veg Burger - 55$");
        Printer.print("My Menu " + menuList.toString());
        return menuList;
    }

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
