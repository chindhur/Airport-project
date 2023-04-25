package com.airport;

import com.person.Address;
import com.person.Designation;
import com.person.Employee;
import com.person.Gender;
import com.utils.Printer;

public class AirportEmployee extends Employee {

    String airportName = null;

    public AirportEmployee(String name) {
        super(name);
    }

    public AirportEmployee(String name, Integer age, Address address, Gender gender,
                           String employeeId, Double employeeSalary, Designation designation,
                           String assignedAirport) {
        super(name, age, address, gender, employeeId, employeeSalary, designation);
        airportName = assignedAirport;
    }

    public void setAirport(String airport) {
        airportName = airport;
    }

    public String getAssignedAirport() {
        return airportName;
    }
}