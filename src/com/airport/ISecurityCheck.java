package com.airport;

import com.impl.airport.Luggage;
import com.impl.airport.Passenger;

public interface ISecurityCheck {

    Boolean isThreatDetected = false;

    //method overloading
    void scanForSecurity(Passenger passenger);

    void scanForSecurity(Luggage luggage);

    Boolean isThreatDetected();
}
