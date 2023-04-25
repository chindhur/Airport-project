package com.airport;

public interface ISecurityCheck {

    Boolean isThreatDetected = false;

    //method overloading
    void scanForSecurity(Passenger passenger);

    void scanForSecurity(Luggage luggage);

    Boolean isThreatDetected();
}
