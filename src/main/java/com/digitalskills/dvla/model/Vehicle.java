package com.digitalskills.dvla.model;

public class Vehicle {

    private final String regNumber;
    private final String make;
    private final String colour;

    public Vehicle(String regNumber, String make, String colour) {
        this.regNumber = regNumber;
        this.make = make;
        this.colour = colour;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getMake() {
        return make;
    }

    public String getColour() {
        return colour;
    }

}
