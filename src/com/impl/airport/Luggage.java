package com.impl.airport;

import com.airport.IItem;
import com.utils.Printer;
import java.util.ArrayList;
import java.util.List;

public final class Luggage implements IItem {

    private List<String> checkinItems;
    private String flightId;
    private String luggageId;
    private String passengerId;
    private int noOfLuggage = 0;

    /*constructor*/
    public Luggage(String luggageId, String passengerId, String flightId, int noOfLuggage) {
        this.luggageId = luggageId;
        this.passengerId = passengerId;
        this.flightId = flightId;
        this.checkinItems = new ArrayList<String>();
        this.noOfLuggage = noOfLuggage;
    }

    public void setCheckinItems(List<String> checkinItems) {
        this.checkinItems = checkinItems;
    }

    public void addItem(String item) {
        checkinItems.add(item);
    }

    public void removeItem(String item) {
        checkinItems.remove(item);
    }

    public Boolean hasMetalObject() {
        return (checkinItems.contains("metal"));
    }

    public Boolean hasExplosiveObject() {
        return (checkinItems.contains("Explosives"));
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    /*method to get luggagedetails*/
    public String getLuggageDetails() {
        String details = "{ " +
                "The luggageId is : " + luggageId +
                "The PassengerId is :" + passengerId +
                "The flightId is :" + flightId
                + "}";
        Printer.print("Luggage Details " + details);
        return details;
    }

    public String getLuggageId() {
        return luggageId;
    }

    public void setLuggageId(String luggageId) {
        this.luggageId = luggageId;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public int getNoOfLuggage() {
        return noOfLuggage;
    }

    public void setNoOfLuggage(int noOfLuggage) {
        this.noOfLuggage = noOfLuggage;
    }
}
