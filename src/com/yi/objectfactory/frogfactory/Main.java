package com.yi.objectfactory.frogfactory;
import com.yi.objectfactory.UI;
import com.yi.objectfactory.frogfactory.Frog;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Frog> showFrogs = new ArrayList<>();

        System.out.println("\n\nFrogs\n\n");

        System.out.println("\nMENU\n" + "-".repeat(20));
        System.out.println("1) Register a Frog");
        System.out.println("2) Show all Frogs");
        System.out.println("3) Exit the program");

        byte menuChoice = UI.readByte("Choose an option", (byte) 1, (byte) 3);

        while (true) {
            if (menuChoice == 3) break;
            else if (menuChoice == 2) {
                if (showFrogs.size() == 0) {
                    System.out.println("No frogs registered.");
                    continue;
                }
                System.out.println("-".repeat(20));
                System.out.println("All Registered Frogs");
                for (int i = 0; i < showFrogs.size(); i++) {
                    System.out.println(i + 1 + ")\n" + showFrogs.get(i));
                }
                System.out.println("-".repeat(20));
                continue;
            }
            Frog generatedFrog = createFrog();
            showFrogs.add(generatedFrog);
            System.out.println("\nRegistered Frog:\n" + generatedFrog);
        }
        System.out.println("Thank you...");
    }

    public static Frog createFrog() {
        String frogName = UI.readString("What is your frog's name?");
        String frogBreed = UI.readString("What is/are " + frogName + "'s breed(s)?"); // .split(" ")?
        int frogAge = UI.readInt("How old is " + frogName + "?", 0, 100);
        short frogWeight = UI.readShort("How much does " + frogName + " weigh in pounds?", (short) 0, (short) 200);

        return new Frog(frogName, frogBreed, frogAge, frogWeight);
    }
}
