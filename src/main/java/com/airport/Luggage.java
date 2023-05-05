package com.airport;

import com.interfaces.IItem;
import com.utils.Printer;
import java.util.ArrayList;
import java.util.List;

public final class Luggage implements IItem {

    private List<String> checkinItems;
    private String luggageId;
    private int noOfLuggage = 0;

    /*constructor*/
    public Luggage(String luggageId, int noOfLuggage) {
        this.luggageId = luggageId;
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


    /*method to get luggagedetails*/
    public String getLuggageDetails() {
        String details = ("The luggageId is : " + luggageId + System.lineSeparator()+
                "Number Of Luggages :" + noOfLuggage);
        Printer.print(" Details " + details);
        return details;
    }

    public String getLuggageId() {
        return luggageId;
    }

    public void setLuggageId(String luggageId) {
        this.luggageId = luggageId;
    }

    public int getNoOfLuggage() {
        return noOfLuggage;
    }

    public void setNoOfLuggage(int noOfLuggage) {
        this.noOfLuggage = noOfLuggage;
    }
}
