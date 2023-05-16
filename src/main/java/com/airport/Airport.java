package com.airport;

import com.exception.NotFoundException;
import com.interfaces.IFilterDetails;
import com.linkedList.CustomLinkedList;
import com.people.Employee;
import com.people.Passenger;
import com.utils.Printer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Airport {

    List<Flight> airlinesList;
    CustomLinkedList<Passenger> passengerList;
    private String airportName;
    private String cityName;
    private String area;
    private Boolean isRunwayOpen = true;
    private RunwayStatus runway = RunwayStatus.IDLE;
    private List<AirportEmployee> airportEmployeeList = new ArrayList<AirportEmployee>();
    private List<AirplaneEmployee> airplaneEmployeeList = new ArrayList<AirplaneEmployee>();
    private Predicate<RunwayStatus> canLandOnRunway = rs -> rs.equals(RunwayStatus.IDLE);

    public Airport(List<AirportEmployee> airportEmployeeList, List<AirplaneEmployee> airplaneEmployeeList) {
        this.airportEmployeeList = airportEmployeeList;
        this.airplaneEmployeeList = airplaneEmployeeList;
        airlinesList = new ArrayList<Flight>();
        passengerList = new CustomLinkedList<Passenger>();
    }

    /*constructor*/
    public Airport(String airportName, String cityName, String area, Boolean isRunwayOpen) {
        this.airportName = airportName;
        this.cityName = cityName;
        this.area = area;
        this.isRunwayOpen = isRunwayOpen;
        airlinesList = new ArrayList<Flight>();
        passengerList = new CustomLinkedList<Passenger>();
    }

    public BiConsumer<Flight, Passenger> checkInPassenger = (flight, passenger) -> {
        flight.checkInPassenger(passenger);
        passenger.setCheckedIn(true);
        System.out.println("Passenger " + passenger.getName() + " checked in for flight " + flight.getFlightId());
    };

    public List<Flight> getAirlinesList() {
        return airlinesList;
    }

    public void setAirlinesList(Flight flight) {
        airlinesList.add(flight);
    }

    public Flight getAirlines(String flightId) throws NotFoundException {
        for (int i = 0; i < airlinesList.size(); i++) {
            Flight flight = airlinesList.get(i);
            if (flight.getFlightId().equals(flightId)) {
                Printer.debug("Found Airline ID matching :" + flight.getFlightId());
                return flight;
            }
        }
        throw new NotFoundException("Error : Flight Identifier " + flightId + " Not Found!");
    }

    public Passenger getPassenger(String firstName) throws NotFoundException {
        // loop passengerlist n find passenger;
        for (int i = 0; i < passengerList.size(); i++) {
            Passenger passenger = passengerList.get(i);
            if (passenger.getName().equals(firstName)) {
                Printer.debug("Found passenger name matching:" + passenger.getName());
                return passenger;
            }
        }
        throw new NotFoundException("Error : Name Identifier " + firstName + "Not found");
    }

    public void addPassenger(Passenger passenger) {
        passengerList.add(passenger);
    }

    public RunwayStatus getRunway() {
        return runway;
    }

    public void setRunway(RunwayStatus runwayIn) {
        runway = runwayIn;
    }

    public List<AirplaneEmployee> getAirplaneEmployeeList() {
        return airplaneEmployeeList;
    }

    public void addAirplaneEmployee(AirplaneEmployee airplaneEmployee) {
        airplaneEmployeeList.add(airplaneEmployee);
    }

    public Boolean getOpenStatus() {
        return isRunwayOpen;
    }

    public void setOpenStatus(Boolean isOpen) {
        if (isRunwayOpen) {
            Printer.print("The airport is open");
        }
        isRunwayOpen = isOpen;
    }

    public List<AirportEmployee> findEmployeeByCity(List<AirportEmployee> eList, String city) {
        return eList.stream()
                .filter(t -> t.getAddress().getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

    public String printDetails() {
        String flight = System.lineSeparator() +
                "airportName : " + airportName + System.lineSeparator() +
                " cityName :" + cityName + System.lineSeparator() +
                " area :" + area + System.lineSeparator() +
                " The open status of Airport :" + isRunwayOpen;
        Printer.print(flight);
        return flight;
    }

    public List<AirportEmployee> getAirportEmployeeList() {
        return airportEmployeeList;
    }

    public void addAirportEmployee(AirportEmployee airportEmployee) {
        airportEmployeeList.add(airportEmployee);
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isRunwayAvailable(){
        return canLandOnRunway.test(this.getRunway()));
    }

    @Override
    public String toString() {
        return "Airport{" +
                "airportName='" + airportName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", area='" + area + '\'' +
                ", isRunwayOpen=" + isRunwayOpen +
                ", runway=" + runway +
                ", airlinesList=" + airlinesList +
                ", airportEmployeeList=" + airportEmployeeList +
                ", airplaneEmployeeList=" + airplaneEmployeeList +
                '}';
    }

    public List<Employee> getEmployees(IFilterDetails<Employee> fSearch) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : this.airportEmployeeList) {
            if (fSearch.filter(employee)) {
                result.add(employee);
            }
        }
        return result;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public Boolean getRunwayOpen() {
        return isRunwayOpen;
    }

    public void setRunwayOpen(Boolean isRunwayOpen) {
        isRunwayOpen = isRunwayOpen;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final Airport other = (Airport) obj;
        if ((this.airportName == null) ?
                (other.airportName != null) : !this.airportName.equals(other.airportName)) {
            return false;
        }

        if (!this.area.equals(other.area)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + (this.airportName != null ? this.airportName.hashCode() : 0);
        hash = 53 * hash + this.area.hashCode();
        return hash;
    }
}