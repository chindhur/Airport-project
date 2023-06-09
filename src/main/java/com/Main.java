package com;

import com.exception.*;
import com.airport.*;
import com.interfaces.IPrintDetails;
import com.interfaces.IFilterDetails;
import com.linkedList.CustomLinkedList;
import com.people.*;
import com.utils.Printer;
import javax.print.PrintException;

import com.utils.Reflection;
import com.utils.UniqueWords;
import java.awt.*;
import java.io.IOException;
import java.sql.Ref;
import java.util.*;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Printer.print("---------------------------");
        Printer.print("Project AIRPORT");
        Printer.print("---------------------------");
        Printer.print("Airport Details");
        Airport airport = new Airport("SFO",
                "San Francisco", "UnitedStates", true);
        airport.toString();
        airport.printDetails();

        Printer.print("---------------------------");

        Printer.print("Employee Details");
        Employee employee = new Employee("Henry", 32, new Address(
                "DeAnza drive", "San Jose", "California", "95812", "United states"),
                Gender.MALE, 123, 23000.0, Designation.CUSTOMERCARE);
        employee.printDetails();
        Printer.print("---------------------------");

        Printer.print("---------------------------");
        Printer.print("Validating AirportEmployee");
        Printer.print("----------------------------");
        AirportEmployee airportEmployee1 = new AirportEmployee("Eliza", 45,
                new Address("valley drive", "fremont", "california",
                        "95612", "United States"),
                Gender.FEMALE, 345, 56000.0, Designation.MANAGER);
        airportEmployee1.printDetails();
        airport.addAirportEmployee(airportEmployee1);
        airport.addAirportEmployee(new AirportEmployee("Venba", 25,
                new Address("alps drive", "Cupertino", "california",
                        "95014", "United States"),
                Gender.FEMALE, 145, 46000.0, Designation.CUSTOMERCARE));
        Printer.print("---------------------------");
        Printer.print("Validating Airplane Employee");
        Printer.print("-----------------------------");
        AirplaneEmployee airplaneEmployee1 = new AirplaneEmployee("Ria", 56,
                new Address("valley drive", "Belmont", "California", "95065", "US"),
                Gender.FEMALE, 673, 56000.0, Designation.AIRHOSTESS);
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
        try {
            salFlight = new Flight("SA-AL", "Bangalore",
                    "SFO", 70, "SingaporeAirlines", 1200.0);
            unitedFlight = new Flight("UN-AL", "Tokyo",
                    "UAE", 0, "UnitedAirlines", 900.0);
            emiratesFlight = new Flight("EM-AL", "NewYork",
                    "Singapore", 67, "EmiratesAirlines", 1300.0);
            southwestFlight = new Flight("SW-AL", "KL",
                    "Indonesia", 45, "SouthwestAirlines", 1500.0);
        } catch (InvalidArgumentException i) {
            Printer.error("Flight Error : " + i.getMessage());
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

        // airline fields updated
        airport.setAirlinesList(salFlight);
        airport.setAirlinesList(unitedFlight);
        airport.setAirlinesList(emiratesFlight);
        airport.setAirlinesList(southwestFlight);

        Printer.print("-----------------------------");
        Printer.print("Validating Address");
        Printer.print("---------------------------");
        Address address = new Address("valley green", "cuper", "CA", "94065", "US");
        Luggage luggage = new Luggage("1234", 1);
        Person person = new Person("Ranco", 65, address, Gender.MALE);
        Passenger passenger = new Passenger(luggage, "Antony", 56, address, Gender.MALE);
        passenger.printDetails();
        Printer.print("---------------------------");

        Printer.print("----------------------------");
        //Linkedlist implementation
        //adding passengers
        CustomLinkedList<Passenger> passengerList = new CustomLinkedList<Passenger>();
        Passenger passenger1 = new Passenger(new Luggage("4567", 1),
                "Bob", 45, new Address("thomas street", "san roman", "california", "98756", "united states"), Gender.MALE);
        Passenger passenger2 = new Passenger(luggage, "Adam", 32, address, Gender.MALE);
        Passenger passenger3 = new Passenger(luggage, "Roger", 29, address, Gender.MALE);
        Passenger passenger4 = new Passenger(luggage, "Alia", 45, address, Gender.FEMALE);
        passengerList.add(passenger1);
        passengerList.add(passenger2);
        passengerList.add(passenger3);
        passengerList.add(passenger4);

        airport.addPassenger(passenger1);
        airport.addPassenger(passenger2);
        airport.addPassenger(passenger3);
        airport.addPassenger(passenger4);

        //remove passenger
        try {
            passengerList.remove(passenger2);
        } catch (NotFoundException notFoundException) {
            Printer.print("not found" + notFoundException.getMessage());
        }
        Printer.print("Removed passenger:" + passenger2.getName());

        //get Index
        try {
            passengerList.get(1);
        } catch (IndexOutOfBoundsException e) {
            Printer.print("Not found" + e.getMessage());
        } catch (NotFoundException e) {
            Printer.print("Not found: " + e.getMessage());
        }

        //size
        Printer.print("The size of the list is :" + passengerList.size());

        //print details
        Printer.print("The list of passengers added :");
        passengerList.printNodes();

        Printer.print("---------------------------");
        Printer.print("Validating Ticket Counter");
        Printer.print("---------------------------");
        Printer.print("Booking ticket in " + salFlight.getFlightId());
        Ticket ticket1 = new Ticket(salFlight, passenger, 1400.0);
        Printer.print(ticket1.toString());
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
            Ticket ticketbooked = ticketCounter.bookTicket(salFlight, passenger, 1400.0);
            Ticket ticketbooked1 = ticketCounter.bookTicket(unitedFlight, passenger, 1500);
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
        Printer.print("Runway status");
        Printer.print("---------------------------");
        testRunwayStatus(RunwayStatus.TAKEOFF);
        testRunwayStatus(RunwayStatus.IDLE);
        testRunwayStatus(RunwayStatus.LANDING);
        Printer.print("---------------------------");

        Printer.print("---------------------------");
        Printer.print("Validating Airport Runway");
        Printer.print("----------------------------");
        AirportRunway airportRunway = new AirportRunway("4", "Unitedairlines", true);
        airportRunway.printOccupiedStatus();
        airportRunway.printDetails();

        Printer.print("-----------------------------");
        //Implementing NotFoundException
        try {
            checkAirport(airport);
            checkAirlines(airport);
            checkAirlinesMenu(airport);
        } catch (NotFoundException notFoundException) {
            Printer.print("Exception " + notFoundException.getMessage());
        }

        //Implementing LimitExceededException
        try {
            Printer.print("Adding Second luggage ");
            passenger.addLuggage();
            Printer.print("Added Second luggage ");
            Printer.print("Adding third luggage ");
            passenger.addLuggage();
            Printer.print("Added third luggage ");
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
            Printer.error("Ticket Error :" + p.getMessage());
        }

        //Writing unique words of a file into another file
        String inputFile = "Airport-project/src/main/resources/filereader.txt";
        String outputFile = "Airport-project/src/main/resources/uniqwords.txt";
        UniqueWords uniqueWords = new UniqueWords();
        try {
            Set<String> wordSet = uniqueWords.findUniqueWords(inputFile);
            Printer.print("Found unique words of the file and written the unique words on file uniqwords.txt");
            Printer.printFile(outputFile, wordSet);
        } catch (IOException ioException) {
            Printer.print("The error reported in finding uniq Words:" + ioException.getMessage());
        }

        Printer.print("---------------------------");
        Printer.print("Using generic Lambda");
        Printer.print("---------------------------");
        try {
            int wordcount = uniqueWords.getWordCount("Airport-project/src/main/resources/filereader.txt",
                    "enum");
            Printer.print("count = " + wordcount);
        } catch (IOException ioException) {
            Printer.print("Error reported in finding word count of given word" + ioException.getMessage());
        }

        Printer.print("Using lambda functions from inbuilt package");
        Printer.print("---------------------------");
        //Implements Bi-consumer Lambda-to checkin the passengers
        airport.checkInPassenger.accept(salFlight, passenger1);
        airport.checkInPassenger.accept(salFlight, passenger3);
        airport.checkInPassenger.accept(unitedFlight, passenger2);
        salFlight.printDetails();

        //Implements predicate Lambda-checks runway status
        Printer.print("Is runway available " +
                airport.isRunwayAvailable());
        airport.setRunway(RunwayStatus.TAKEOFF);

        //Implements function Lambda- gets destination of flight
        Function<Flight, String> destinationExtractor = Flight::getDestination;
        Printer.print("Destination of Singapore Airlines flight is :"
                + destinationExtractor.apply(salFlight));

        // Implements BiPredicate lambda - Checks if two employees are same
        BiPredicate<AirportEmployee, AirplaneEmployee> isEmployeeSame =
                (employee1, employee2) ->
                        employee1.getName().equals(employee2.getName());
        Printer.print("Checking if employee same :" +
                isEmployeeSame.test(airportEmployee1, airplaneEmployee1));

        //Generic lambda #2
        IPrintDetails<Ticket> ipt = (t) -> {
            Printer.print(t.toString());
        };
        ipt.print(ticket3);
        ipt.print(ticket1);

        //Generic Lambda #3
        IFilterDetails<Employee> searchBySalary = employee2 -> employee2.getEmployeeSalary() > 0;
        Printer.print("Employee search by salary :" + airport.getEmployees(searchBySalary));

        //Stream #3 Finds employee based of Fremont City - with non-terminal and terminal
        Printer.print("employees in fremont city " +
                airport.findEmployeeByCity(airport.getAirportEmployeeList(), "fremont"));

        //Stream#4 Finds flight that starts at SFO with terminal operation alone
        List<Flight> filghtList = airport.getAirlinesList();
        Boolean isFlightToSFO =
                filghtList.stream()
                        .anyMatch(f -> f.getSource().equalsIgnoreCase("SFO"));
        Printer.print("Flight to SFO found : " + isFlightToSFO);

        //Stream5 : stream with filter and count (terminal)
        long count =
                filghtList.stream()
                        .filter(f-> f.getPrice() > 1000)
                        .count();
        Printer.print("Flight with over 1000$ ticket price : " + count);

        // Stream 6 : Sort flight
        List<Flight> sortedList =
                filghtList.stream()
                        .distinct()
                        .sorted((f1, f2) -> f1.getPrice().compareTo(f2.getPrice()))
                        .collect(Collectors.toList());
        Printer.print("Sorted Flight list : " + sortedList);

        //Stream 7: Filter veg menu alone from food list
        List<String> vegMenu =
                menuList.stream()
                        .filter(m -> m.getVeg())
                        .map(menu -> menu.getItemName())
                        .distinct()
                        .collect(Collectors.toList());
        Printer.print("Food Menu with veg option : " + vegMenu );

        // Using reflection to
        // extract information(modifiers, return types, parameters, etc) about fields, constructors, methods.
        Reflection.printClassDetails("com.people.Employee");
        // Invoking getName() and getAge() on AirplaneEmployee class
        // using reflection
        Reflection.printEmployeeValues(airplaneEmployee1, new String[]{"Name", "Age"});
    }

    public static void checkAirport(Airport airport) throws NotFoundException {
        Scanner sc = new Scanner(System.in);
        Printer.print("Please enter the airport name: ");
        String name = sc.nextLine();
        Printer.print("searching airport:" + name);
        if (airport.getAirportName().equalsIgnoreCase(name)) {
            Printer.print("The details of the airport are:" + airport.printDetails());
        } else {
            throw new NotFoundException(name + "Airport not found!");
        }
    }

    public static void checkAirlines(Airport airport) throws NotFoundException {
        Scanner sc = new Scanner(System.in);
        Printer.print("Please enter the airline fliAght identifier for searching food menu: ");
        String name = sc.nextLine();
        Printer.print("searching airline:" + name);
        if (airport.getAirlines(name) != null) {
            airport.getAirlines(name).printDetails();
        } else {
            throw new NotFoundException(name + " : Airline not found!");
        }
    }

    public static void checkAirlinesMenu(Airport airport) throws NotFoundException {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Please enter airline flight identifier :");
        String name = scanner.nextLine();
        Printer.print("Searching airline:" + name);
        if (airport.getAirlines(name) != null) {
            List<FoodMenu> menuList = airport.getAirlines(name).getMenuList();
            if (menuList == null) {
                throw new NotFoundException("Exception : Food Menu not available!");
            }
            Printer.print(name + " food menu :");
            for (FoodMenu menu : menuList) {
                Printer.print("Item name : " + menu.getItemName() + "--------------" + menu.getItemPrice());
            }
        }
    }

    public static void testRunwayStatus(RunwayStatus status) {
        // tells the runway status by using different cases
        switch (status) {
            case IDLE: // message if runway is idle
                Printer.print("Status :" + status.getDisplayStatus());
                break;
            case LANDING: // message if a plane is landing
                Printer.print("Status :" + status.getDisplayStatus());
                break;
            case TAKEOFF: // message if a plane is taking off
                Printer.print("Status :" + status.getDisplayStatus());
                break;
            default:
                Printer.print("Not known");
        }
    }
}