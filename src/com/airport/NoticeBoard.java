package com.airport;

import com.utils.Printer;

public final class NoticeBoard {
    Flight flightDetails;

    public void setFlightDetails(Flight flightDetails) {
        this.flightDetails = flightDetails;
    }
    public void printDetails() {
        Printer.print("flightID : " + flightDetails.getFlightId());
        Printer.print("flightName : " + flightDetails.getFlightName());
        Printer.print("flightSource : " + flightDetails.getSource());
        Printer.print("flightDestination : " + flightDetails.getDestination());
        Printer.print("flightArrivalTime : " + flightDetails.getArrivalTime());
        Printer.print("flightDepartureTime : " + flightDetails.getDepartureTime());
    }
}