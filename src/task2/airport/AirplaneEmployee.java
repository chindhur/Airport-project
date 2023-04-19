package task2.airport;

import task2.person.Employee;
import task2.utils.Printer;

public class AirplaneEmployee extends Employee {
    String assignedAirplane = "Not Assigned";

    public AirplaneEmployee(String assignedAirplane) {
        this.assignedAirplane = assignedAirplane;
    }

    public AirplaneEmployee() {
    }

    public String getAssignedAirplane() {
        Printer.print("Assigned Airplane " + assignedAirplane);
        return assignedAirplane;

    }

    public void setAssignedAirplane(String assignedAirplane) {
        this.assignedAirplane = assignedAirplane;
    }
}