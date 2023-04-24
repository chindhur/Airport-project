package com.airport;

public interface Route {
    public String getSource();

    public String getDestination();

    public void setDestination(String destination);

    public int getNoOfFlights();

    public void setNoOfFlights(int noOfFlights);

}
