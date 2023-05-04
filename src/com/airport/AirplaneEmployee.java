package com.airport;

import com.people.Address;
import com.people.Designation;
import com.people.Employee;
import com.people.Gender;

public class AirplaneEmployee extends Employee {

    public AirplaneEmployee(String name, Integer age, Address address, Gender gender,
                            int employeeId, Double employeeSalary, Designation designation) {
        super(name, age, address, gender, employeeId, employeeSalary, designation);
    }
}
