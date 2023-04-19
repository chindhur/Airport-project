package task2;

import task2.airport.*;
import task2.impl.airport.SouthWestAirlines;
import task2.impl.airport.UnitedAirlines;
import task2.impl.airport.SingaporeAirlines;
import task2.person.Address;
import task2.person.Designation;
import task2.person.Gender;
import task2.person.Person;
import task2.utils.Printer;


public class Main {

    public static void main(String[] args) {
        Printer.print("---------------------------");
        Printer.print("Project AIRPORT");
        Printer.print("---------------------------");
        Printer.print("Airport Details");
        Airport airport = new Airport("SFO",
                "San Francisco", "UnitedStates", true);
        airport.getDetails();
        Printer.print("---------------------------");

        RunwayStatus status = RunwayStatus.TAKEOFF;
        airport.setRunway(status);
        Printer.print("---------------------------");
        Printer.print("Runway status " + airport.getRunway().toString());
        Printer.print("---------------------------");
        SingaporeAirlines salFlight = new SingaporeAirlines();
        salFlight.getWelcomeMessage();
        salFlight.getMenu();
        salFlight.getDiscount();
        Printer.print("---------------------------");
        UnitedAirlines unitedFlight = new UnitedAirlines();
        unitedFlight.getWelcomeMessage();
        unitedFlight.getMenu();
        unitedFlight.getDiscount();
        Printer.print("---------------------------");

        SouthWestAirlines southwestFlight = new SouthWestAirlines();
        southwestFlight.getWelcomeMessage();
        southwestFlight.getDiscount();
        southwestFlight.getMenu();

        Printer.print("---------------------------");
        Printer.print("Validating Address");
        Printer.print("---------------------------");

        Address address = new Address("valley green", "cuper", "CA", "94065", "US");
        Luggage luggage = new Luggage("1234", "AUX12345", "UN-AL", 2);
        Person person = new Person("Ranco", 65, address, Gender.MALE);
        Passenger passenger = new Passenger(person, luggage);
        passenger.getDetails();

        Printer.print("---------------------------");
        Printer.print("Validating Ticket Counter");
        Printer.print("---------------------------");

        TicketCounter tktCounter = new TicketCounter();
        tktCounter.setTicketId("ARE1234");
        tktCounter.setDestination("Australia");
        tktCounter.setSource("SFO");
        tktCounter.setFlightId("UN-AL");
        tktCounter.setPassengerId(passenger.getPassenger().getName());
        Printer.print(tktCounter.getDetails());

        Printer.print("---------------------------");
        Printer.print("Validating Routes");
        Printer.print("---------------------------");
        Routes routes = new Routes("SFO", "AUSTRALIA", 10);
        routes.getDetails();

        AirportEmployee airportEmployee = new AirportEmployee();
        airportEmployee.setName("Nancy");
        airportEmployee.setAge(23);
        airportEmployee.setAddress(address);
        airportEmployee.setGender(Gender.FEMALE);
        airportEmployee.setAirport(airport);
        airportEmployee.setDesignation(Designation.CARGO_MANAGER);
        airportEmployee.setEmployeeSalary(65000.00);
        airportEmployee.getDetails();

        Printer.print("---------------------------");
        Printer.print("Runway status");
        Printer.print("---------------------------");

        testRunwayStatus(RunwayStatus.TAKEOFF);
        testRunwayStatus(RunwayStatus.IDLE);
        testRunwayStatus(RunwayStatus.LANDING);
        Printer.print("---------------------------");


    }


    public static void testRunwayStatus(RunwayStatus status) {
        // tells the runway status by using different cases
        switch (status) {
            case IDLE: // message if runway is idle
                System.out.println("Nothing is going on the runway!");
                break;

            case LANDING: // message if a plane is landing
                System.out.println("A plane is landing!");
                break;

            case TAKEOFF: // message if a plane is taking off
                System.out.println("a plane is taking off!");
        }
    }
}
