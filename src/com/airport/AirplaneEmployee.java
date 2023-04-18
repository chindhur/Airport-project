package com.airport;

import com.person.Employee;
import com.utils.Printer;

class AirplaneEmployee extends Employee {
    String assignedAirplane = "Not Assigned";

    public AirplaneEmployee(String assignedAirplane) {
        this.assignedAirplane = assignedAirplane;
    }

    public AirplaneEmployee(){
    }

    public void setAssignedAirplane(String assignedAirplane) {
        this.assignedAirplane = assignedAirplane;
    }

    public String getAssignedAirplane(){
        Printer.print("Assigned Airplane " + assignedAirplane);
        return assignedAirplane;

    }
}