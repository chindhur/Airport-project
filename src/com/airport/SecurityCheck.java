package com.airport;

public interface SecurityCheck {
    Boolean isThreatDetected = false;

    //method overloading
    public abstract void scanForSecurity(Passenger passenger);

    public abstract void scanForSecurity(Luggage luggage);

    public abstract Boolean isThreatDetected();
}
