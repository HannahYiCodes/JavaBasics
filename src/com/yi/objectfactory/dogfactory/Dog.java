package com.yi.objectfactory.dogfactory;

public class Dog {
    private String dogName;
    private String dogBreed;
    private int adoptionDate;
    private short dogAge;
    private short dogWeight;
    private boolean dogSex;

    public Dog(String dogName, String dogBreed, int adoptionDate, short dogAge, short dogWeight, boolean dogSex) {
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.adoptionDate = adoptionDate;
        this.dogAge = dogAge;
        this.dogWeight = dogWeight;
        this.dogSex = dogSex;
    }

    public String getDogName() {
        return dogName;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public int getAdoptionDate() {
        return adoptionDate;
    }

    public short getDogAge() {
        return dogAge;
    }

    public short getDogWeight() {
        return dogWeight;
    }

    public boolean isDogSex() {
        return dogSex;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", dogBreed='" + dogBreed + '\'' +
                ", adoptionDate=" + adoptionDate +
                ", dogAge=" + dogAge +
                ", dogWeight=" + dogWeight +
                ", dogSex=" + dogSex +
                '}';
    }
}
