package com.airport;

public enum RunwayStatus {
    IDLE("Not in use!"),
    TAKEOFF("Flight Taking off!"),
    LANDING("Flight landing in progress!");

    String displayStatus;
    
    private RunwayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
    }

    public String getDisplayStatus() {
        return displayStatus;
    }
}

