package com.yi.objectfactory.dogfactory;

import com.yi.objectfactory.UI;

public class Main {
    public static void main(String[] args) {
        String dogName = UI.readString("What is your dog's name?");
        String dogBreed = UI.readString("What is your dog's breed(s)?");
        int adoptionDate = UI.readInt("What year did you acquire your best friend?", 1900, 9000);
        short dogAge = UI.readShort("How old is your dog?", (short) 0, (short) 30);
        boolean dogSex = UI.readBoolean("Is your dog a male?");
    }
}