package com.airport;

import com.utils.Printer;

class Airport {
    private String airportName;
    private String cityName;
    private String area;

    private Boolean m_isOpen = true;

    /*default constructor*/
    public Airport() {
    }

    /*constructor*/
    public Airport(String airportName, String cityName, String area, Boolean m_isOpen) {
        this.airportName = airportName;
        this.cityName = cityName;
        this.area = area;
        this.m_isOpen = m_isOpen;
    }

    public Boolean getOpenStatus() {
         return m_isOpen;
    }

    public void setOpenStatus(Boolean isOpen) {
        if (m_isOpen) {
            Printer.print("The airport is open");
        }

        m_isOpen = isOpen;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setArea(String area) {
        this.area = area;
    }



    public String getFlightDetails() {
        String flight =
                "{ " +
                "airportName : " + airportName +
                "cityName :" + cityName +
                "area :" + area +
                "The open status of Airport :" + m_isOpen
                + "}";
        Printer.print(flight);
        return flight;

    }

    public String getCityName() {
        return cityName;
    }

    public String getArea() {
        return area;
    }

    public String getAirportName() {
        return airportName;
    }
}