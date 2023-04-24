package com.airport;

import com.person.Person;
import com.utils.Printer;


public class ExplosiveDetectorCheck implements SecurityCheck {
    private Boolean isThreatDetected;
    public void scanForSecurity(Passenger passenger){
        if(passenger.hasExplosiveObject()){
            Printer.print("This passenger has explosives");
            isThreatDetected = true;
        }
    }
    public void scanForSecurity(Luggage luggage){
        if(luggage.hasExplosiveObject()){
            Printer.print("This Luggage has explosives"+luggage.getLuggageId());
            isThreatDetected = true;
        }

    }
    public Boolean isThreatDetected(){
        return isThreatDetected;
    }
}
