package com.interfaces;

public interface IRunway {

    String getRunwayNumber();

    void setRunwayNumber(String runwayNumber);

    String getFlightName();

    void setFlightName(String flightName);

    Boolean getOccupiedStatus();

    void setOccupiedStatus(Boolean occupiedStatus);

    void printDetails();

    void printOccupiedStatus();
}
