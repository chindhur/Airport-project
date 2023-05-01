
package com.impl.airport;

import com.airport.IRunway;
import com.utils.Printer;

public class AirportRunway implements IRunway {

    private String runwayNumber;
    private String flightName;
    private Boolean isRunwayOccupied = false;

    public AirportRunway(String runwayNumber, String flightName, Boolean isRunwayOccupied) {
        this.runwayNumber = runwayNumber;
        this.flightName = flightName;
        this.isRunwayOccupied = isRunwayOccupied;
    }

    public String getRunwayNumber() {
        return runwayNumber;
    }

    public void setRunwayNumber(String runwayNumber) {
        this.runwayNumber = runwayNumber;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public Boolean getOccupiedStatus() {
        return isRunwayOccupied;
    }

    public void setOccupiedStatus(Boolean occupiedStatus) {
        isRunwayOccupied = occupiedStatus;
    }

    public void printDetails() {
        String runway =  System.lineSeparator()+
                        "The runway Number is : " + runwayNumber + System.lineSeparator()+
                        "The flightname is :" + flightName +System.lineSeparator()+
                        "The occupied status is :" + isRunwayOccupied;
        Printer.print(runway);
    }

    public void printOccupiedStatus() {
        if (isRunwayOccupied) {
            Printer.print("The runway is occupied");
        } else {
            Printer.print("The runway is free");
        }
    }
}