package com.airport;

import com.person.Address;
import com.person.Designation;
import com.person.Employee;
import com.person.Gender;
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