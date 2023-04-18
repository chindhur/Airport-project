
package com.airport;

import com.utils.Printer;

class Runway{

    private String runwayNumber;
    private String flightName;
    private Boolean m_occupiedStatus = false;
    public void setRunwayNumber(String runwayNumber) {
        this.runwayNumber = runwayNumber;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }


    public String getRunwayNumber(){
        return runwayNumber;
    }
    public String getFlightName(){
        return flightName;
    }

    public Boolean getOccupiedStatus(){
        return m_occupiedStatus;
    }
    public void setOccupiedStatus(Boolean occupiedStatus){
        m_occupiedStatus = occupiedStatus;
        return;
    }
    public String getrunwayDetails() {
        String runway =
                "{ " +
                "The runway Number is : " + runwayNumber +
                "The flightname is :" + flightName +
                "The occupied status is :" + m_occupiedStatus + "}";
        Printer.print(runway);
        return runway;
    }
    public void printOccupiedStatus(){
        if(m_occupiedStatus == true){
            Printer.print("The runway is occupied");
        } else {
            Printer.print("The runway is free");
        }
    }

}