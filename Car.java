package com.company;

public class Car {
    public String make;
    public String model;
    public boolean isRented;

    public void Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.isRented = false;

    }
    
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public boolean setIsRented(boolean isRented) {
        return isRented;
    }

}

