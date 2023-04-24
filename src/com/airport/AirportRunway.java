package com.airport;

import com.utils.Printer;

public class AirportRunway implements Runway {
    private String runwayNumber;
    private String flightName;
    private Boolean mIsoccupied = false;
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
        return mIsoccupied;
    }
    public void setOccupiedStatus(Boolean occupiedStatus) {
        mIsoccupied = occupiedStatus;
    }
    public void printDetails() {
        String runway =
                "{ " +
                        "The runway Number is : " + runwayNumber +
                        "The flightname is :" + flightName +
                        "The occupied status is :" + mIsoccupied + "}";
        Printer.print(runway);
    }
    public void printOccupiedStatus() {
        if (mIsoccupied == true) {
            Printer.print("The runway is occupied");
        } else {
            Printer.print("The runway is free");
        }
    }

}