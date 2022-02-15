package com.company;

import java.util.ArrayList;

public class RentalService {

    private static ArrayList<Car> availableCars = new ArrayList<>();
    private static ArrayList<Car> rentedCars = new ArrayList<>();

    public static void main(String[] args) {

        initializeCarStorage();
        rentalMenu();

        System.out.println("Welcome to the Car Rental CLI");
    }

    private static void rentalMenu() {
            System.out.println("\nRENTAL MENU\n");
            int listNumber = 1;
            for (int i = 0; i < availableCars.size() ; i++) {
                if( !availableCars.get(i).isRented() ) {
                    System.out.println(listNumber + ")" + availableCars.get(i).getMake() + " " + availableCars.get(i).getModel());
                    listNumber++;
                }
            }
            int userSelection = UI.readInt("Enter a number to select the car you'd like to rent", 1, listNumber - 1);
            System.out.println("Thank you! You are now renting the "+ availableCars.get(userSelection - 1).toString());
            rentedCars.add(availableCars.remove(userSelection - 1));
            rentalMenu();
        }


    private static void initializeCarStorage(){


//        Car[] carStorage = new Car[3];

        Car car1 = new Car("Honda", "Accord");
        Car car2 = new Car("Chevy", "Malibu");
        Car car3 = new Car("Ford", "Mustang");

        availableCars.add(car1);
        availableCars.add(car2);
        availableCars.add(car3);

//        carStorage[0] = car1;
//        carStorage[1] = car2;
//        carStorage[2] = car3;

        for (int i = 0; i < availableCars.size(); i++) {
            if(!availableCars.get(i).isRented())
                System.out.println( "(" + (i + 1) + ")" + availableCars.get(i).getMake() );

        }
    }



}
