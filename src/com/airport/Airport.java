package com.airport;

import com.utils.Printer;
import javax.management.openmbean.KeyAlreadyExistsException;
import javax.print.attribute.HashAttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.airport.Flight;

public class Airport {

    private String airportName;
    private String cityName;
    private String area;
    private Boolean isRunwayOpen = true;
    private RunwayStatus runway = RunwayStatus.IDLE;
    // Key -> flightId to ensure  flightId is unique per flight
    // for given airport and retreive flight details based on ID
    private Map<String,Flight> airlinesMap;
    private List<AirportEmployee> airportEmployeeList = new ArrayList<AirportEmployee>();
    private List<AirplaneEmployee> airplaneEmployeeList = new ArrayList<AirplaneEmployee>();

    public Boolean getRunwayOpen() {
        return isRunwayOpen;
    }

    public void setRunwayOpen(Boolean isRunwayOpen) {
        isRunwayOpen = isRunwayOpen;
    }

    public Airport(List<AirportEmployee> airportEmployeeList, List<AirplaneEmployee> airplaneEmployeeList){
        this.airportEmployeeList = airportEmployeeList;
        this.airplaneEmployeeList = airplaneEmployeeList;
        airlinesMap = new HashMap<String, Flight>();
    }

    /*constructor*/
    public Airport(String airportName, String cityName, String area, Boolean isRunwayOpen) {
        this.airportName = airportName;
        this.cityName = cityName;
        this.area = area;
        this.isRunwayOpen = isRunwayOpen;
        airlinesMap = new HashMap<String, Flight>();
    }

    public Map<String, Flight> getAirlinesMap() {
        return airlinesMap;
    }

    public Flight getAirlines(String flightId) {
        return airlinesMap.get(flightId);
    }

    public void setAirlinesMap(Flight flight) throws KeyAlreadyExistsException{
        if (airlinesMap.containsKey(flight.getFlightId())) {
            Printer.debug("Map already contains key " + flight.getFlightId());
            throw new KeyAlreadyExistsException("Flight " + flight.getFlightId() + " already taken.");
        }
        this.airlinesMap.put(flight.getFlightId(),flight);
    }

    public RunwayStatus getRunway() {
        return runway;
    }

    public List<AirplaneEmployee> getAirplaneEmployeeList() {
        return airplaneEmployeeList;
    }

    public void addAirplaneEmployee(AirplaneEmployee airplaneEmployee) {
        airplaneEmployeeList.add(airplaneEmployee);
    }

    public void setRunway(RunwayStatus runwayIn) {
        runway = runwayIn;
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

    public String printDetails() {
        Printer.debug("printing Airport details");
        String flight =  System.lineSeparator()+
                        "airportName : " + airportName + System.lineSeparator()+
                        " cityName :" + cityName + System.lineSeparator()+
                        " area :" + area +System.lineSeparator()+
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

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    @Override
    public String toString() {
        // return string name of flight
        return airportName;
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