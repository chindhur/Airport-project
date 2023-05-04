package com.airport;

import com.interfaces.ISecurityCheck;
import com.people.Passenger;
import com.utils.Printer;

public class ExplosiveDetectorCheck implements ISecurityCheck {

    private Boolean isThreatDetected;

    public void scanForSecurity(Passenger passenger) {
        if (passenger.hasExplosiveObject()) {
            Printer.print("This passenger has explosives");
            isThreatDetected = true;
        }
    }

    public void scanForSecurity(Luggage luggage) {
        if (luggage.hasExplosiveObject()) {
            Printer.print("This Luggage has explosives" + luggage.getLuggageId());
            isThreatDetected = true;
        }
    }

    public Boolean isThreatDetected() {
        return isThreatDetected;
    }
}
