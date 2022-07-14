package com.yi.objectfactory.airplanefactory;

import com.yi.objectfactory.UI;

import java.util.ArrayList;

public class Main {
    // LIST OF STRINGS
    public static void main(String[] args) {

        ArrayList<Airplane> hanger = new ArrayList<>();

        System.out.println("\n\nAirplane Factory\n\n");

        while (true) {
            System.out.println("\nMENU\n" + "_".repeat(20));
            System.out.println("1) Create A Plane");
            System.out.println("2) Show Hanger"); // Displays all data created by user in that instance
            System.out.println("3) Exit The Program");

            byte menuChoice = UI.readByte("Choose an option", (byte) 1, (byte) 3);

            if (menuChoice == 3) break;
            else if (menuChoice == 2) {
                if (hanger.size() == 0) {
                    System.out.println("No airplanes in hanger.");
                    continue;
                }
                // SHOWS HANGER
                System.out.println("-".repeat(20));
                System.out.println("AIRPLANE HANGER\n");
                for (int i = 0; i < hanger.size(); i++) {
                    System.out.println(i + 1 + ")\n" + hanger.get(i));
                }
                System.out.println("-".repeat(20));
                continue;
            }
            Airplane generatedAirplane = createAirplane();
            hanger.add(generatedAirplane);
            System.out.println("\nCREATED AIRPLANE:\n" + generatedAirplane);
        }
        System.out.println("Thank you for using the program...");
    }

    private static Airplane createAirplane() {
        System.out.println("Airplane Factory\n\n");
        String modelName = UI.readString("What is the model name?");
        String tailNumber = UI.readString("What is the tail number?");
        short passengerCap = UI.readShort("What is the plane passenger capacity?", (short) 0, (short) 300);
        int marketValue = UI.readInt("What is the plane's market value?", 0, 1000000000);
        double gasTank = UI.readDouble("What is the current gas tank percent (as a decimal)?", 0, 1);
        boolean isFlying = UI.readBoolean("Is the plane flying?");

        return new Airplane(modelName, tailNumber, passengerCap, marketValue, gasTank, isFlying);
    }
}

//        boolean firstBool = UI.readBoolean("Are you a dev?");
//        System.out.println(firstBool);
//        String name = UI.readString("What is your name?");
//        System.out.println(name);