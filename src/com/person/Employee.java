package com.person;

import com.utils.Printer;
import java.util.Objects;

public class Employee extends Person {

    private String employeeId;
    private Double employeeSalary;
    private Designation designation;

    public Employee(String name) {
        super(name);
    }

    public Employee(String name, String employeeId, Double employeeSalary, Designation designation) {
        super(name);
        this.employeeId = employeeId;
        this.employeeSalary = employeeSalary;
        this.designation = designation;
    }

    public Employee(String name, Integer age, Address address, Gender gender, String employeeId, Double employeeSalary, Designation designation) {
        super(name, age, address, gender);
        this.employeeId = employeeId;
        this.employeeSalary = employeeSalary;
        this.designation = designation;
    }

    /*method to get employeedetails*/
    public void printDetails() {
        super.printBasicDetails();
        Printer.print("employee id is :" + employeeId);
        Printer.print("Employee salary is :" + employeeSalary);
        Printer.print("Designation of the employee is:" + designation);
        Printer.print("Address :" + super.getAddress());
        Printer.print("Gender : " + super.getGender());
        Printer.print("Designation : " + designation.toString());
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
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