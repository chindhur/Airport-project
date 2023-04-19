package task2.airport;

import task2.utils.Printer;

public class Airport {
    private String airportName;
    private String cityName;
    private String area;

    private Boolean m_isOpen = true;

    private RunwayStatus runway = RunwayStatus.IDLE;

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

    public RunwayStatus getRunway() {
        return runway;
    }

    public void setRunway(RunwayStatus runway) {
        this.runway = runway;
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

    public String getDetails() {
        String flight =
                "{ " +
                        "airportName : " + airportName +
                        " cityName :" + cityName +
                        " area :" + area +
                        " The open status of Airport :" + m_isOpen
                        + "}";
        Printer.print(flight);
        return flight;

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