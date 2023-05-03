package com.airport;

import com.person.Address;
import com.person.Designation;
import com.person.Employee;
import com.person.Gender;
import com.utils.Printer;

public class AirplaneEmployee extends Employee {

    public AirplaneEmployee(String name, Integer age, Address address, Gender gender,
                            int employeeId, Double employeeSalary, Designation designation) {
        super(name, age, address, gender, employeeId, employeeSalary, designation);
    }
}
