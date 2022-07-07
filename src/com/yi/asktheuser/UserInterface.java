package com.yi.asktheuser;

import java.util.Scanner;

public class UserInterface {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name = askUserName();
        int age = askUserAge();
        boolean allergies = askUserAllergy();
        byte theByte = askUserByte();
        short theShort = askUserShort();
        float theFloat = askUserFloat();
        long theLong = askUserLong();
        double theDouble = askUserDouble();

        System.out.println("Final Report:\nName: " + name + ".\nAge: " + age + ".\nNut Allergy: " + allergies + ".\nThe Byte: " + theByte + ".\nThe Short: " + theShort + ".\nThe Float: " + theFloat + ".\nThe Long: " + theLong + ".\nThe Double: " + theDouble + "."); // after all the questions, it will display this
    }

    private static int askUserAge() {
        System.out.print("What is your age?\nAge: ");
        int userAge = scanner.nextInt();
        if (userAge > 25) {
            System.out.println("You are " + userAge);
        }
        System.out.println("Your age: " + userAge);
        return userAge;
    }

    private static String askUserName() {
        System.out.print("What is your name?\nName: ");
        String userName = scanner.nextLine().trim();
        System.out.println("Your name: " + userName);
        return userName;
    }

    private static boolean askUserAllergy() {
        System.out.print("Are you allergic to nuts?\nTrue or False: ");
        boolean userAllergy = scanner.nextBoolean();
        return userAllergy;
    }

    private static byte askUserByte() {
        System.out.print("Give me a byte?\nResponse: ");
        Byte userByte = scanner.nextByte();
        return userByte;
    }
    // Byte Max: 127, Min: -128.

    private static short askUserShort() {
        System.out.print("Give me a short?\nResponse: ");
        Short userShort = scanner.nextShort();
        return userShort;
    }
    // Short Max: 32767, Min: -32768

    private static float askUserFloat() {
        System.out.print("Give me a Float?\nResponse: ");
        Float userFloat = scanner.nextFloat();
        return userFloat;
    }

    private static long askUserLong() {
        System.out.print("Give me a long?\nResponse: ");
        Long userLong = scanner.nextLong();
        return userLong;
    }
    // Long Max: -9,223,372,036,854,775,808L, Min: 9,223,372,036,854,775,807L:

    private static double askUserDouble() {
        System.out.print("Give me a double?\nResponse: ");
        Double userDouble = scanner.nextDouble();
        return userDouble;
    }
    // Double Max: 1.79769313486231570e+308d, Min: 4.94065645841246544e-324d
}

// mutants
// mutable vs immutable = ability of something to be changed
//
//    NUMBER TYPES:
//        byte --> scanner.nextByte();
//        short --> scanner.nextShort();
//        int --> scanner.nextInt();
//        float --> scanner.nextFloat();
//        long --> scanner.nextLong();
//        double --> scanner.nextDouble();
//
//        BOOLEAN:
//        boolean --> scanner.nextBoolean();
//        STRING:
//        String --> scanner.nextLine();