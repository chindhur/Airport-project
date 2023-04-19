package task2.impl.airport;

import task2.airport.Flight;
import task2.utils.Printer;

import java.util.ArrayList;
import java.util.List;

public class Emirates extends Flight {
    public Emirates() {
        super.setFlightName("Emirates Airlines");
        super.setFlightId("ES-AL");
        price = 1250.00;
        source = "United_States";
        destination = "United_Arab_Emirates";
    }

    /*Abstract method implementation */
    public List<String> getMenu() {
        List<String> menuList = new ArrayList<String>();
        menuList.add("Veg Sandwich - 30$");
        menuList.add("Non-veg Sandwich - 45$");
        Printer.print("My Menu " + menuList.toString());
        return menuList;
    }

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
    public void printFlightDetails() {
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
