package com.airport;

import com.utils.Printer;

public class AirportRunway implements IRunway {

    private String runwayNumber;
    private String flightName;
    private Boolean isRunwayOccupied = false;

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
        String runway =
                "{ " +
                        "The runway Number is : " + runwayNumber +
                        "The flightname is :" + flightName +
                        "The occupied status is :" + isRunwayOccupied + "}";
        Printer.print(runway);
    }

    public void printOccupiedStatus() {
        if (isRunwayOccupied == true) {
            Printer.print("The runway is occupied");
        } else {
            Printer.print("The runway is free");
        }
    }
}