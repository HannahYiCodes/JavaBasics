package com.yi.objectfactory.fruitfactory;

import com.yi.objectfactory.UI;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fruit Factory\n\n");
        String fruitName = UI.readString("What is the fruit's name?");
        String fruitColor = UI.readString("What is the fruit's color?");
        boolean hasSeeds = UI.readBoolean("Does this fruit have seeds?");

        Fruit generatedFruit = new Fruit(fruitName, fruitColor, hasSeeds);
        System.out.println(generatedFruit);
    }
}
