package com.airport;

import com.utils.Printer;

class Luggage {
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

    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public void setLuggageId(String luggageId) {
        this.luggageId = luggageId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public void setNoOfLuggages(Integer noOfLuggages) {
        this.noOfLuggages = noOfLuggages;
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

    public String getPassengerId() {
        return passengerId;
    }

    public Integer getNoOfLuggages() {
        return noOfLuggages;
    }
}