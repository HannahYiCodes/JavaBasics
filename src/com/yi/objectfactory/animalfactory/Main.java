package com.yi.objectfactory.animalfactory;

import com.yi.objectfactory.UI;

public class Main {
    public static void main(String[] args) {
        System.out.println("Animal Factory\n\n");
        String animalSpecies = UI.readString("What is the species?");
        short animalLegs = UI.readShort("How many legs?", (short) 0, (short) 300);
        boolean isTerrestrial = UI.readBoolean("Is this animal terrestrial?");

        Animal generatedAnimal = new Animal(animalSpecies, animalLegs, isTerrestrial);
        System.out.println(generatedAnimal);

    }
}
