package com.people;

public enum Designation {
    PILOT("FLIGHT PILOT"),
    AIRHOSTESS("FLIGHT AIRHOSTESS"),
    CARGO_MANAGER("CARGO MANAGER"),
    CUSTOMERCARE("CUSTOMER CARE"),
    MANAGER("MANAGER");

    private String displayName;

    public Designation(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public boolean isManager() {
        return this == MANAGER;
    }

    public boolean isPilot() {
        return this == PILOT;
    }

    public boolean isAirhostess() {
        return this == AIRHOSTESS;
    }

    public boolean isCargoManager() {
        return this == CARGO_MANAGER;
    }

    public boolean isCustomerCare() {
        return this == CUSTOMERCARE;
    }
}