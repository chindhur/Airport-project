package com.airport;

import com.Exception.*;
import com.impl.airport.*;
import com.person.*;
import com.utils.Printer;
import javax.print.PrintException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Printer.print("---------------------------");
        Printer.print("Project AIRPORT");
        Printer.print("---------------------------");
        Printer.print("Airport Details");
        Airport airport = new Airport("SFO",
                "San Francisco", "UnitedStates", true);
        airport.printDetails();
        Map<String,String> airlinesMap = new HashMap<String, String>();
        airlinesMap.put("UN-AL","UnitedAirlines");
        airlinesMap.put("SP-AL","SingaporeAirlines");
        airlinesMap.put("EM-AL","EmiratesAirlines");
        airlinesMap.put("SW-AL","SouthwestAirlines");
        Printer.print("The map elements are :");
        airlinesMap.forEach((key, value) -> Printer.print(key + ":" + value));
        airport.getAirlinesMap();
        airport.setAirlinesMap("SP-AL","SingaporeAirlines");
        airport.setAirlinesMap("UN-AL","UnitedAirlines");
        airport.setAirlinesMap("EM-AL","EmiratesAirlines");
        airport.setAirlinesMap("SW-AL","SouthwestAirlines");
        Printer.print("---------------------------");

        Printer.print("Employee Details");
        Employee employee = new Employee("Henry", 32, new Address(
                "DeAnza drive", "San Jose", "California", "95812", "United states"),
                Gender.MALE, 123, 23000.0, Designation.CUSTOMERCARE);
        employee.printDetails();
        Printer.print("---------------------------");

        Printer.print("---------------------------");
        Printer.print("Validating AirportEmployee");
        AirportEmployee airportEmployee1 = new AirportEmployee("Eliza", 45,
                new Address("valley drive", "fremont", "california",
                        "95612", "United States"),
                Gender.FEMALE, 345, 56000.0, Designation.AIRHOSTESS, "NewYork");
        airportEmployee1.printDetails();


        Printer.print("---------------------------");
        Printer.print("Validating Airplane Employee");
        AirplaneEmployee airplaneEmployee1 = new AirplaneEmployee("Ria", 56,
                new Address("valley drive", "Belmont", "California", "95065", "US"),
                Gender.FEMALE, 673, 56000.0, Designation.MANAGER, "New jersey");
        airplaneEmployee1.printDetails();
        Printer.print("---------------------------");

        RunwayStatus status = RunwayStatus.TAKEOFF;
        airport.setRunway(status);
        Printer.print("---------------------------");
        Printer.print("Runway status " + airport.getRunway().toString());

        Printer.print("---------------------------");
        Printer.print("Validating Flight");
        Flight salFlight = null;
        Flight unitedFlight = null;
        Flight emiratesFlight = null;
        Flight southwestFlight = null;
        try{
            salFlight = new Flight("SA-AL", "Bangalore", "SFO", 70,"SingaporeAirlines");
            unitedFlight = new Flight("UN-AL", "Tokyo", "UAE", 0,"UnitedAirlines");
            emiratesFlight = new Flight("EM-AL", "NewYork", "Singapore", 67,"SingaporeAirlines");
            southwestFlight = new Flight("SW-AL", "KL", "Indonesia", 45,"SouthwestAirlines");
        }
        catch(InvalidArgumentException  i){
            Printer.error("Flight Error : " +i.getMessage());

        }

        salFlight.printDiscount();
        salFlight.getNoOfWheels();
        Printer.print("Listing Menu and price: ");
        List<FoodMenu> menuList = new ArrayList<FoodMenu>();

        menuList.add(new FoodMenu(true, "Veg Burger", 15));
        menuList.add(new FoodMenu(true, "Pizza", 25));
        menuList.add(new FoodMenu(false, "Chicken Burger", 20));

        salFlight.setMenuList(menuList);
        for (FoodMenu menu : salFlight.getMenuList()) {
            Printer.print("Item Name : " + menu.getItemName() + "------------" + menu.getItemPrice());
        }
        Printer.print("---------------------------");
        unitedFlight.printDiscount();
        Printer.print("Listing Menu and price: ");
        menuList = new ArrayList<FoodMenu>();

        menuList.add(new FoodMenu(true, "Veg Fried Rice", 15));
        menuList.add(new FoodMenu(true, "Kids Meals", 25));
        menuList.add(new FoodMenu(false, "Chicken Fried Rice", 20));
        unitedFlight.setMenuList(menuList);
        for (FoodMenu menu : menuList) {
            Printer.print("Item Name : " + menu.getItemName() + "------------" + menu.getItemPrice());
        }


        Printer.print("---------------------------");
        southwestFlight.printDiscount();
        Printer.print("Listing Menu and price: ");
        menuList = new ArrayList<FoodMenu>();

        menuList.add(new FoodMenu(true, "Veg Fried Rice", 15));
        menuList.add(new FoodMenu(true, "Kids Meals", 25));
        menuList.add(new FoodMenu(false, "Chicken Fried Rice", 20));
        southwestFlight.setMenuList(menuList);
        for (FoodMenu menu : menuList) {
            Printer.print("Item Name : " + menu.getItemName() + "------------" + menu.getItemPrice());
        }

        Printer.print("---------------------------");
        emiratesFlight.printDiscount();
        Printer.print("Listing Menu and price");
        menuList = new ArrayList<FoodMenu>();

        menuList.add(new FoodMenu(true, "Veg Noodles", 15));
        menuList.add(new FoodMenu(true, "Pasta", 20));
        menuList.add(new FoodMenu(true, "Mango MilkShake", 25));
        menuList.add(new FoodMenu(false, "Chicken Noodles", 20));
        salFlight.setMenuList(menuList);
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
        Printer.print("Booking ticket in " + salFlight.getFlightId());
        Ticket ticket1 = new Ticket(salFlight, passenger, 1400.0);
        Printer.print( ticket1.toString());
        Printer.print("Booking ticket in " + unitedFlight.getFlightId());
        Ticket ticket2 = new Ticket(unitedFlight, passenger, 1500.0);
        Printer.print(ticket2.toString());
        Printer.print("Booking ticket in " + unitedFlight.getFlightId());
        Ticket ticket3 = new Ticket(southwestFlight, passenger, 1600.0);
        Printer.print(ticket3.toString());
        Printer.print("Booking ticket in " + emiratesFlight.getFlightId());
        Ticket ticket4 = new Ticket(emiratesFlight, passenger, 1300.0);
        Printer.print(ticket4.toString());

        Printer.print("---------------------------");
        Printer.print("Validating Ticket Counter");
        Printer.print("---------------------------");
        AirportTicketCounter ticketCounter = new AirportTicketCounter();
        try {
            Ticket ticketbooked = ticketCounter.bookTicket(ticket1);
            Ticket ticketbooked1 = ticketCounter.bookTicket(ticket2);
            Printer.print("The tickets are booked");
            Printer.print("Booked ticket 1 :" + ticketbooked1.getTicketId());
            Printer.print("Booked ticket 2 : " + ticketbooked.getTicketId());
        } catch (IllegalArgumentException | NoSeatLeftException exp) {
            Printer.error("Book Ticket error : " + exp.getMessage());
        }
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
                45, address, Gender.FEMALE, 453, 67000.0, Designation.MANAGER, "SFO");
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
                129, 75000.0, Designation.MANAGER, "SingaporeAirlines");
        airportEmployee.printDetails();
        Printer.print("The Assigned airplane :" + airplaneEmployee.getAssignedAirplane());

        Printer.print("---------------------------");
        Printer.print("Runway status");
        Printer.print("---------------------------");

        testRunwayStatus(RunwayStatus.TAKEOFF);
        testRunwayStatus(RunwayStatus.IDLE);
        testRunwayStatus(RunwayStatus.LANDING);
        Printer.print("---------------------------");

        Printer.print("---------------------------");
        Printer.print("Validating Airport Runway");
        AirportRunway airportRunway = new AirportRunway("4","Unitedairlines",true);
        airportRunway.printOccupiedStatus();
        airportRunway.printDetails();

        Printer.print("-----------------------------");
        //Implementing AirportNotFoundException
        try {
            checkAirport(airport);
        } catch (AirportNotFoundException airportNotFoundException) {
            Printer.print("Found Exception " + airportNotFoundException.getMessage());
        }

        //Implementing LimitExceededException
        try {
            luggage.addLuggage();
        } catch (LimitExceededException l) {
            Printer.error("Luggage Error: " + l.getMessage());
        }
        //Implementing EmployeeIdNotFoundException
        try {
            employee.checkForEmployeeid();
        } catch (InvalidEmployeeIdException emp) {
            Printer.error("Employee Error : " + emp.getMessage());
        }

        // printTicket using try with resources
        try {
            ticket1.writeTicketToFile("ticket.txt");
            ticket2.writeTicketToFile("E:/src/ticket2.txt");
        } catch (PrintException p) {
            Printer.error ("Ticket Error :" + p.getMessage());
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