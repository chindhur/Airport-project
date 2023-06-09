package com.interfaces;

import com.airport.Luggage;
import com.people.Passenger;

public interface ISecurityCheck {

    Boolean isThreatDetected = false;

    //method overloading
    void scanForSecurity(Passenger passenger);

    void scanForSecurity(Luggage luggage);

    Boolean isThreatDetected();
}
