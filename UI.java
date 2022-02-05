package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {
    private static final Scanner scanner = new Scanner(System.in);
    public static int readInt (String question, int min, int max) {

        try {
            System.out.println(question);
            System.out.println("Number (" + min + " - " + max + "); ");
            int userInput = scanner.nextInt();
            if (userInput >= min && userInput <= max) {
                return userInput;
            }
            System.out.println("Number outside of the valid range, try again");
            return readInt(question, min, max);

        } catch (Exception exception) {
            scanner.nextLine();
            System.out.println(exception.getMessage());
            System.out.println(exception);
            System.out.println(exception.getCause());
            return readInt(question, min, max);
        }




    }



}
