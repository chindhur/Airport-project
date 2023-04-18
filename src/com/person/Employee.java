package com.person;

import com.utils.Printer;

public class Employee extends Person {

    private String employeeId;

    private Double employeeSalary;

    private Designation designation;

    /*constructor*/
    public Employee() {

    }

    /*method to get employeedetails*/
    public void getEmployeeDetails(){
        super.printBasicDetails();
        Printer.print("employee id is :" +employeeId );
        Printer.print("Employee salary is :" +employeeSalary );
        Printer.print("Designation of the employee is:"+designation);
        Printer.print("Address :" + super.getAddress());
        Printer.print("Gender : " + super.getGender());
        Printer.print("Designation : " + designation.toString());
        return ;
    }

    public String getEmployeeId(){
        return employeeId;
    }

    public Double getEmployeeSalary(){
        return employeeSalary;
    }
    public Designation getDesignation(){
        return designation;
    }

    public void setEmployeeId(String employeeId){
         this.employeeId = employeeId;
    }

}