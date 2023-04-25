package com.airport;

import com.utils.Printer;
import java.util.ArrayList;
import java.util.List;

public class Airport {

    private String airportName;
    private String cityName;
    private String area;
    private Boolean IsRunwayOPen = true;
    private RunwayStatus runway = RunwayStatus.IDLE;
    private List<AirportEmployee> airportEmployeeList = new ArrayList<AirportEmployee>();
    private List<AirplaneEmployee> airplaneEmployeeList = new ArrayList<AirplaneEmployee>();

    /*constructor*/
    public Airport(String airportName, String cityName, String area, Boolean IsRunwayOPen) {
        this.airportName = airportName;
        this.cityName = cityName;
        this.area = area;
        this.IsRunwayOPen = IsRunwayOPen;
    }

    public RunwayStatus getRunway() {
        return runway;
    }

    public List<AirplaneEmployee> getAirplaneEmployeeList() {
        return airplaneEmployeeList;
    }

    public void setAirplaneEmployeeList(List<AirplaneEmployee> airplaneEmployeeList) {
        this.airplaneEmployeeList = airplaneEmployeeList;
    }

    public void setRunway(RunwayStatus runwayIn) {
        runway = runwayIn;
    }

    public Boolean getOpenStatus() {
        return IsRunwayOPen;
    }

    public void setOpenStatus(Boolean isOpen) {
        if (IsRunwayOPen) {
            Printer.print("The airport is open");
        }

        IsRunwayOPen = isOpen;
    }

    public String getDetails() {
        String flight =
                "{ " +
                        "airportName : " + airportName +
                        " cityName :" + cityName +
                        " area :" + area +
                        " The open status of Airport :" + IsRunwayOPen
                        + "}";
        Printer.print(flight);
        return flight;

    }

    public List<AirportEmployee> getAirportEmployeeList() {
        return airportEmployeeList;
    }

    public void setAirportEmployeeList(List<AirportEmployee> airportEmployeeList) {
        this.airportEmployeeList = airportEmployeeList;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    @Override
    public String toString() {
        // return string name of flight
        return airportName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final Airport other = (Airport) obj;
        if ((this.airportName == null) ?
                (other.airportName != null) : !this.airportName.equals(other.airportName)) {
            return false;
        }

        if (!this.area.equals(other.area)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + (this.airportName != null ? this.airportName.hashCode() : 0);
        hash = 53 * hash + this.area.hashCode();
        return hash;
    }
}