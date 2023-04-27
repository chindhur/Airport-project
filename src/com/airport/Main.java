package com.airport;

import com.Exception.AirportNotFoundException;
import com.impl.airport.*;
import com.person.Address;
import com.person.Designation;
import com.person.Gender;
import com.person.Person;
import com.utils.FoodMenu;
import com.utils.Printer;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<FoodMenu> menuList = null;

        Printer.print("---------------------------");
        Printer.print("Project AIRPORT");
        Printer.print("---------------------------");
        Printer.print("Airport Details");
        Airport airport = new Airport("SFO",
                "San Francisco", "UnitedStates", true);
        airport.printDetails();
        Printer.print("---------------------------");

        RunwayStatus status = RunwayStatus.TAKEOFF;
        airport.setRunway(status);
        Printer.print("---------------------------");
        Printer.print("Runway status " + airport.getRunway().toString());
        Printer.print("---------------------------");

        SingaporeAirlines salFlight = new SingaporeAirlines();
        salFlight.getWelcomeMessage();
        menuList = salFlight.getMenu();
        Printer.print("Listing Menu and price: ");
        for (FoodMenu menu : menuList) {
            Printer.print("Item Name : " + menu.getItemName() + "------------" + menu.getItemPrice());
        }
        salFlight.printDiscount();
        Printer.print("---------------------------");

        UnitedAirlines unitedFlight = new UnitedAirlines();
        unitedFlight.getWelcomeMessage();
        menuList = unitedFlight.getMenu();
        Printer.print("Listing Menu and price: ");
        for (FoodMenu menu : menuList) {
            Printer.print("Item Name : " + menu.getItemName() + "------------" + menu.getItemPrice());
        }
        unitedFlight.printDiscount();
        Printer.print("---------------------------");

        SouthWestAirlines southwestFlight = new SouthWestAirlines();
        southwestFlight.getWelcomeMessage();
        southwestFlight.printDiscount();
        menuList = southwestFlight.getMenu();
        Printer.print("Listing Menu and price: ");
        for (FoodMenu menu : menuList) {
            Printer.print("Item Name : " + menu.getItemName() + "------------" + menu.getItemPrice());
        }
        Printer.print("---------------------------");

        EmiratesAirlines emiratesAirlines = new EmiratesAirlines();
        emiratesAirlines.getWelcomeMessage();
        emiratesAirlines.printDiscount();
        menuList = emiratesAirlines.getMenu();
        Printer.print("Listing Menu and price");
        for (FoodMenu menu : menuList) {
            Printer.print("Item name : " + menu.getItemName() + "--------------" + menu.getItemPrice());
        }
        Printer.print("-----------------------------");

        Printer.print("Validating Address");
        Printer.print("---------------------------");
        Address address = new Address("valley green", "cuper", "CA", "94065", "US");
        Luggage luggage = new Luggage("1234", "AUX12345", "UN-AL", 2);
        Person person = new Person("Ranco", 65, address, Gender.MALE);
        Passenger passenger = new Passenger(person, luggage);
        passenger.printDetails();
        Printer.print("---------------------------");

        Printer.print("Validating Ticket Counter");
        Printer.print("---------------------------");
        AirportTicketCounter ticketCounter = new AirportTicketCounter();
        ticketCounter.bookTicket("1234", "Malaysia", "Singapore", 1200, "456", "ES-AL");
        ticketCounter.getTicketId();
        ticketCounter.getPassengerId();
        ticketCounter.setFlightId("ES-AL");
        ticketCounter.setPrice(1200);
        ticketCounter.setPassengerId("456");
        ticketCounter.setTicketId("1234");
        Printer.print("The Details are :" + ticketCounter.getDetails());
        Printer.print("---------------------------");

        Printer.print("Validating Routes For SFO Route");
        Printer.print("---------------------------");
        Route sfoRoute = new Route("India", "SFO", 4);
        sfoRoute.getSource();
        Printer.print("The source is: " + sfoRoute.getSource());
        sfoRoute.getDestination();
        Printer.print("The destination is:" + sfoRoute.getDestination());
        sfoRoute.getNoOfFlights();
        Printer.print("No of Flights for this route are:" + sfoRoute.getNoOfFlights());

        Printer.print("---------------------------");
        Printer.print("Validating for Airport Employee");
        Printer.print("---------------------------");
        AirportEmployee airportEmployee = new AirportEmployee("Nancy");
        AirportEmployee airportEmployee2 = new AirportEmployee("Stacy");
        AirportEmployee airportEmployee3 = new AirportEmployee("fariah",
                45, address, Gender.FEMALE, "5678", 67000.0, Designation.MANAGER, "SFO");
        airportEmployee.setAge(23);
        airportEmployee.setAddress(address);
        airportEmployee.setGender(Gender.FEMALE);
        airportEmployee.setDesignation(Designation.CARGO_MANAGER);
        airportEmployee.setEmployeeSalary(65000.0);
        airportEmployee.printDetails();

        Printer.print("---------------------------");
        Printer.print("Validating for Airplane Employee");
        Printer.print("---------------------------");
        AirplaneEmployee airplaneEmployee = new AirplaneEmployee("Tom", 45, address, Gender.MALE,
                "abcd", 75000.0, Designation.MANAGER, "SingaporeAirlines"
        );
        airportEmployee.printDetails();
        airplaneEmployee.getAssignedAirplane();

        Printer.print("The Assigned airplane :" + airplaneEmployee.getAssignedAirplane());

        Printer.print("---------------------------");
        Printer.print("Runway status");
        Printer.print("---------------------------");

        testRunwayStatus(RunwayStatus.TAKEOFF);
        testRunwayStatus(RunwayStatus.IDLE);
        testRunwayStatus(RunwayStatus.LANDING);
        Printer.print("---------------------------");

        //Implementing AirportNotFoundException
        try{
            checkAirport(airport);
        }
        catch (AirportNotFoundException airportNotFoundException){
            Printer.print("Found Exception " + airportNotFoundException.getMessage());
        }
    }

    public static void checkAirport(Airport airport)
        throws AirportNotFoundException
    {
        //Implementing AirportNotFoundException
        Scanner sc = new Scanner(System.in);
        Printer.print("Please enter the airport name: ");
        String name = sc.nextLine();
        Printer.print("searching airport:"+name);

        if (airport.getAirportName().equalsIgnoreCase(name)) {
            Printer.print("The details of the airport are:" + airport.printDetails());
        }
        else {
            throw new AirportNotFoundException(name + "Airport not found");
        }
    }

    public static void testRunwayStatus(RunwayStatus status) {
        // tells the runway status by using different cases
        switch (status) {
            case IDLE: // message if runway is idle
                Printer.print("Nothing is going on the runway!");
                break;

            case LANDING: // message if a plane is landing
                Printer.print("A plane is landing!");
                break;

            case TAKEOFF: // message if a plane is taking off
                Printer.print("a plane is taking off!");
        }
    }
}