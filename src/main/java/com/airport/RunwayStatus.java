package com.airport;

public enum RunwayStatus {
    IDLE("Not in use!"),
    TAKEOFF("Flight Taking off!"),
    LANDING("Flight landing in progress!");

    String displayStatus;
    
    public RunwayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
    }

    public String getDisplayStatus() {
        return displayStatus;
    }

    public boolean isIdle() {
        return this == IDLE;
    }

    public boolean isTakeOff() {
        return this == TAKEOFF;
    }

    public boolean isLanding() {
        return this == LANDING;
    }
}

