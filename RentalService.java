package com.company;

import java.util.ArrayList;

public class RentalService {

    private static ArrayList<Car> carStorage;

    public static void main(String[] args){

//        initializeCarStorage();


        System.out.println("Welcome to the Car Rental CLI");


    private static void rentalMenu() {
            System.out.println("\nRENTAL MENU\n");
            int listNumber = 1;
            for (int i = 0; i < carStorage.size() ; i++) {
                if( !carStorage.get(i).isRented() ) {
                    System.out.println(listNumber + ")" + carStorage.getName());
                    listNumber++;
                }
            }
            int userSelection = UI.readInt("Enter a number to select the car you'd like to rent", 1, listNumber - 1);
            System.out.println(carStorage.get(userSelection - 1).getName());
        }

    }

    private static void intializeCarStorage(){


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
