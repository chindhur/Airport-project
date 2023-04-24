package com.airport;

import com.person.Address;
import com.person.Designation;
import com.person.Employee;
import com.person.Gender;
import com.utils.Printer;
public class AirplaneEmployee extends Employee {
    private String assignedAirplane = "Not Assigned";
    public AirplaneEmployee(String name, Integer age, Address address, Gender gender,
                            String employeeId, Double employeeSalary, Designation designation,
                            String assignedAirplane) {
        super(name, age, address, gender, employeeId, employeeSalary, designation);
        this.assignedAirplane = assignedAirplane;
    }

    public String getAssignedAirplane() {
        Printer.print("Assigned Airplane " + assignedAirplane);
        return assignedAirplane;

    }
    public void setAssignedAirplane(String assignedAirplane) {
        this.assignedAirplane = assignedAirplane;
    }
}