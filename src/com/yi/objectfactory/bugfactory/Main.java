package com.yi.objectfactory.bugfactory;

import com.yi.objectfactory.UI;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bug Factory\n\n");
        String bugSpecies = UI.readString("What is the species?");
        short bugSizeInches = UI.readShort("What is the size in inches?", (short) 0, (short) 32767);
        short bugLegs = UI.readShort("How many legs does it have?", (short) 0, (short) 300);
        boolean isBugNocturnal = UI.readBoolean("Is the bug nocturnal?");

        Bug generatedBug = new Bug(bugSpecies, bugSizeInches, bugLegs, isBugNocturnal);
        System.out.println(generatedBug);

    }
}
