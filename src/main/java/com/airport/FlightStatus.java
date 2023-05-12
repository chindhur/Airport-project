package com.airport;

public enum FlightStatus {
    SCHEDULED("Scheduled"),
    ON_TIME("On Time"),
    DELAYED("Delayed"),
    CANCELLED("Cancelled"),
    BOARDING("Boarding"),
    DEPARTED("Departed"),
    LANDED("Landed");

    private String displayName;

    FlightStatus(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

