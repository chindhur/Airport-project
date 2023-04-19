package task2.impl.airport;

import task2.airport.Flight;
import task2.utils.Printer;

import java.util.ArrayList;
import java.util.List;


public class SingaporeAirlines extends Flight {
    public SingaporeAirlines() {
        super.setFlightName("Singapore Airlines");
        super.setFlightId("SP-AL");
        price = 2000.00;
        source = "Japan";
        destination = "United_States";
    }

    /*Abstract method implementation */
    public List<String> getMenu() {
        List<String> menuList = new ArrayList<String>();
        menuList.add("Veg pasta - 40$");
        menuList.add("Non-veg pasta - 55$");
        Printer.print("My Menu " + menuList.toString());
        return menuList;
    }

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
