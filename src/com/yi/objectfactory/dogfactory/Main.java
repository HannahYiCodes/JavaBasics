package com.yi.objectfactory.dogfactory;

import com.yi.objectfactory.UI;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Dog> showDogs = new ArrayList<>();

        System.out.println("\n\nDog Show!!!\n\n");

        while (true) {
            System.out.println("\nMENU\n" + "-".repeat(20));
            System.out.println("1) Register a Dog");
            System.out.println("2) Show all show-dogs");
            System.out.println("3) Exit the program");

            byte menuChoice = UI.readByte("Choose an option", (byte) 1, (byte) 3);

            if (menuChoice == 3) break;
            else if (menuChoice == 2) {
                if (showDogs.size() == 0) {
                    System.out.println("No dogs registered.");
                    continue;
                }
                System.out.println("-".repeat(20));
                System.out.println("All Registered Show Dogs");
                for (int i = 0; i < showDogs.size(); i++) {
                    System.out.println(i + 1 + ")\n" + showDogs.get(i));
                }
                System.out.println("-".repeat(20));
                continue;
            }
            Dog generatedDog = createDog();
            showDogs.add(generatedDog);
            System.out.println("\nRegistered Dog:\n" + generatedDog);
        }
        System.out.println("Thank you...");
    }
    public static Dog createDog () {
        String dogName = UI.readString("What is your dog's name?");

        String dogBreed = UI.readString("What is/are " + dogName + "'s breed(s)?"); // .split(" ")?
        int adoptionDate = UI.readInt("What year did " + dogName + " join your family?", 1900, 2022);
        short dogAge = UI.readShort("How old is " + dogName + "?", (short) 0, (short) 30);// float?
        short dogWeight = UI.readShort("How much does " + dogName + " weigh in pounds?", (short) 0, (short) 200);
        String dogSex = UI.readString("What sex is " + dogName + " (male/female)?");
        boolean dogStatus = UI.readBoolean("Is this " + dogName + "'s first time in a competition?");
        char dogOwner = UI.readChar("What is the first letter YOUR initial?");

        return new Dog(dogName, dogBreed, adoptionDate, dogAge, dogWeight, dogSex, dogStatus, dogOwner); // Create a form like appearance

        String dogBreed = UI.readString("What is your dog's breed(s)?");
        int adoptionDate = UI.readInt("What year did you acquire your best friend?", 1900, 9000);
        short dogAge = UI.readShort("How old is your dog?", (short) 0, (short) 30);
        short dogWeight = UI.readShort("How many pounds is your dog?", (short) 0, (short) 200);
        boolean dogSex = UI.readBoolean("Is your dog a male?");

        Dog generatedDog = new Dog(dogName, dogBreed, adoptionDate, dogAge, dogWeight, dogSex);
        System.out.println(generatedDog);


    }
}


// read string list
// string builder