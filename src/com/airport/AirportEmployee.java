package com.airport;

import com.person.Address;
import com.person.Designation;
import com.person.Employee;
import com.person.Gender;
import com.utils.Printer;

public class AirportEmployee extends Employee {
    Airport mAirport = null;

    public AirportEmployee(Airport airport,String name){
        super(name);
        mAirport = airport;

    }
    public void setAirport(Airport airport) {
        mAirport = airport;
    }
    public String getAssignedAirport() {
        return mAirport.getAirportName();
    }
}