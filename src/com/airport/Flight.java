package com.airport;

import com.utils.Printer;

import java.sql.Timestamp;

public class Flight {
    private String flightId;
    private String flightName;
    private String source;
    private String destination;
    private Timestamp arrivalTime;
    private Timestamp departureTime;

    /*constructor*/
    public Flight(){
    }
    public Flight(String flightId, String flightName,
                  String source, String destination, Timestamp arrivalTime,
                  Timestamp departureTime){
        this.flightId = flightId;
        this. flightName = flightName;
        this.source = source;
        this.destination = destination;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    public String getFlightName(){
        return flightName;
    }
    public String getFlightId(){
        return flightId;
    }
    public String getSource(){
        return source;
    }
    public String getDestination(){
        return destination;
    }

    public Timestamp getArrivalTime(){
        return arrivalTime;
    }

    public Timestamp getDepartureTime(){
        return departureTime;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setArrivalTime(Timestamp arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setDepartureTime(Timestamp departureTime) {
        this.departureTime = departureTime;
    }

    public void printFlightDetails(){
        System.out.println("The details of the flight :");
        System.out.println("flight id :" + flightId );
        System.out.println("flight name:" + flightName );
        System.out.println("flight source : " + source);
        System.out.println("flight destination : " + destination);
    }

    public void printFlightStatus(){
         Printer.print("arrival time :" +arrivalTime);
         Printer.print("Departure time is :"+departureTime);
    }
}
