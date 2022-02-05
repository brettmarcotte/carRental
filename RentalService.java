package com.company;

public class RentalService {

    public static void main(String[] args){
        System.out.println("Welcome to the Car Rental CLI");

        Car[] carStorage = new Car[3];

        Car car1 = new Car("Honda", "Accord");
        Car car2 = new Car("Chevy", "Malibu");
        Car car3 = new Car("Ford", "Mustang");


        carStorage[0] = car1;
        carStorage[1] = car2;
        carStorage[2] = car3;

        for (int i = 0; i < carStorage.length; i++) {
            if(!carStorage[i].isRented())
            System.out.println( "{" + (i + 1) + ")" + carStorage[i].getMake() );

        }



    }




}
