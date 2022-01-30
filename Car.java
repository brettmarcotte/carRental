package com.company;

public class Car {
   public String make;
   public String model;
   public boolean isRented;

   public void Car(String make, String model, boolean isRented){
       this.make = make;
       this.model =  model;
       this.isRented = isRented;
   }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", isRented=" + isRented +
                '}';
    }
}
