package com.airport;

import com.people.Address;
import com.people.Designation;
import com.people.Employee;
import com.people.Gender;
import com.utils.Printer;

public class AirportEmployee extends Employee {

    public AirportEmployee(String name) {
        super(name);
    }

    public AirportEmployee(String name, Integer age, Address address, Gender gender,
                           int employeeId, Double employeeSalary, Designation designation) {
        super(name, age, address, gender, employeeId, employeeSalary, designation);
        Printer.debug("Airport employee initialized");
    }

}