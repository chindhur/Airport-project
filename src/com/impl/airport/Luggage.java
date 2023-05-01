package com.impl.airport;

import com.airport.IItem;
import com.utils.Printer;
import java.util.ArrayList;
import java.util.List;
import com.Exception.LimitExceededException;

public final class Luggage implements IItem {

    private List<String> checkinItems;
    private static final int MAX_ALLOWED_ITEMS = 2;
    private String flightId;
    private String luggageId;
    private String passengerId;
    private Integer noOfLuggages;

    /*constructor*/
    public Luggage(String luggageId, String passengerId, String flightId, Integer noOfLuggages) {
        this.luggageId = luggageId;
        this.passengerId = passengerId;
        this.flightId = flightId;
        this.noOfLuggages = noOfLuggages;
        this.checkinItems = new ArrayList<String>();
    }

    public void addLuggage()
            throws LimitExceededException {
        if (noOfLuggages >= 2)
            throw new LimitExceededException("No of Luggage limit got exceeded");
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
                "The flightId is :" + flightId +
                "Total number of luggages are :" + noOfLuggages
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

    public Integer getNoOfLuggages() {
        return noOfLuggages;
    }

    public void setNoOfLuggages(Integer noOfLuggages) {
        this.noOfLuggages = noOfLuggages;
    }
}