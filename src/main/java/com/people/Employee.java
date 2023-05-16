package com.people;

import com.exception.InvalidEmployeeIdException;
import com.utils.Printer;

import java.util.Objects;

public class Employee extends Person {

    private int employeeId;
    private Double employeeSalary;
    private Designation designation;

    public Employee(String name) {
        super(name);
    }

    public Employee(String name, Integer age, Address address, Gender gender,
                    int employeeId, Double employeeSalary, Designation designation) {
        super(name, age, address, gender);
        this.employeeId = employeeId;
        this.employeeSalary = employeeSalary;
        this.designation = designation;
    }

    /*method to get employeedetails*/
    public void printDetails() {
        super.printBasicDetails();
        Printer.print("Name of the employee is :" + name);
        Printer.print("employee id is :" + employeeId);
        Printer.print("Employee salary is :" + employeeSalary);
        Printer.print("Designation of the employee is:" + designation.getDisplayName());
        Printer.print("Age of the employee is ;" + age);
        Printer.print("Address :" + super.getAddress());
        Printer.print("Gender : " + super.getGender().getDisplayName());
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void checkForEmployeeid()
            throws InvalidEmployeeIdException {
        if (employeeId < 1)
            throw new InvalidEmployeeIdException("EmployeeId is invalid");
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeId, employee.employeeId)
                && Objects.equals(employeeSalary, employee.employeeSalary)
                && designation == employee.designation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), employeeId, employeeSalary, designation);
    }
}