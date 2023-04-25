package com.airport;

import com.person.IItem;
import com.utils.Printer;
import java.util.ArrayList;
import java.util.List;

public final class Luggage implements IItem {

    public List<String> items;
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
        this.items = new ArrayList<String>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public Boolean hasMetalObject() {
        return (items.contains("metal"));
    }

    public Boolean hasExplosiveObject() {
        return (items.contains("Explosives"));
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