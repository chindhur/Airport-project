package com.people;

public enum Designation {
    PILOT("FLIGHT PILOT"),
    AIRHOSTESS("FLIGHT AIRHOSTESS"),
    CARGO_MANAGER("CARGO MANAGER"),
    CUSTOMERCARE("CUSTOMER CARE"),
    MANAGER("MANAGER");

    private String displayName;

    private Designation(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}