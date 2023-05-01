package com.impl.airport;

import com.airport.ISecurityCheck;
import com.utils.Printer;

public class MetalDetectorCheck implements ISecurityCheck {

    private Boolean isThreatDetected;

    @Override
    public void scanForSecurity(Passenger passenger) {
        if (passenger.hasMetalObject()) {
            Printer.print("Metal detected with this passenger");
            isThreatDetected = true;
        }
    }

    public void scanForSecurity(Luggage luggage) {
        if (luggage.hasMetalObject()) {
            Printer.print("Metal detected with Luggage" + luggage.getLuggageId());
            isThreatDetected = true;
        }
    }

    public Boolean isThreatDetected() {
        return isThreatDetected;
    }
}

