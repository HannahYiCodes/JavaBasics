package com.yi.objectfactory.dogfactory;

import com.yi.objectfactory.UI;

public class Dog {
    private String dogName;
    private String dogBreed;
    private int adoptionYear;
    private short dogAge;
    private short dogWeight;
    private String dogSex;
    private boolean dogStatus;
    private char dogOwner;

    public Dog(String dogName, String dogBreed, int adoptionYear, short dogAge, short dogWeight, String dogSex, boolean dogStatus, char dogOwner) {
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.adoptionYear = adoptionYear;
        this.dogAge = dogAge;
        this.dogWeight = dogWeight;
        this.dogSex = dogSex;
        this.dogStatus = dogStatus;
        this.dogOwner = dogOwner;
    }

    public String getDogName() {
        return dogName;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public int getAdoptionDate() {
        return adoptionYear;
    }

    public short getDogAge() {
        return dogAge;
    }

    public short getDogWeight() {
        return dogWeight;
    }

    public String getDogSex() {
        return dogSex;
    }

    public boolean getDogStatus() { return dogStatus; }

    public char getDogOwner() { return dogOwner;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Registered Dog");
        sb.append("\nDog Name: '").append(dogName).append('\'');
        sb.append("\nBreed: ").append(dogBreed).append('\'');
        sb.append("\nAdoption Year: ").append(adoptionYear);
        sb.append("\nAge: ").append(dogAge);
        sb.append("\nWeight: ").append(dogWeight);
        sb.append("\nSex: ").append(dogSex);
        sb.append("\nFirst-timer: ").append(dogStatus ? "Yes! Welcome!" : "No, but Welcome Back!");
        sb.append("\nFirst initial of owner: ").append(dogOwner);
        return sb.toString();
    }
}

//TODO: public static ArrayList<String> readListOfStrings (question, min, max); // OBJECT NAME SELECTION?
//TODO: public static String selectFromListOfString (question, ArrayList<String>)
