package com.airport;

public interface Runway {
    public String getRunwayNumber();
    public void setRunwayNumber(String runwayNumber);
    public String getFlightName();
    public void setFlightName(String flightName);
    public Boolean getOccupiedStatus();
    public void setOccupiedStatus(Boolean occupiedStatus);
    public void printDetails();
    public void printOccupiedStatus();
}
