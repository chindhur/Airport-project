package task2.airport;

import task2.person.Employee;

public class AirportEmployee extends Employee {
    Airport m_airport = null;

    public void setAirport(Airport airport) {
        m_airport = airport;
    }

    public String getAssignedAirport() {
        return m_airport.getAirportName();
    }
}