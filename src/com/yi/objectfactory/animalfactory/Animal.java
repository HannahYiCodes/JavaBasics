package com.yi.objectfactory.animalfactory;

public class Animal {
    private String animalSpecies;
    private short animalLegs;
    private boolean isTerrestrial;

    public Animal(String animalSpecies, short AnimalLegs, boolean isTerrestrial) {
        this.animalSpecies = animalSpecies;
        this.animalLegs = animalLegs;
        this.isTerrestrial = isTerrestrial;
    }

    public String getAnimalSpecies() {
        return animalSpecies;
    }

    public short getAnimalLegs() {
        return animalLegs;
    }

    public boolean isTerrestrial() {
        return isTerrestrial;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalSpecies='" + animalSpecies + '\'' +
                ", animalLegs=" + animalLegs +
                ", isTerrestrial=" + isTerrestrial +
                '}';
    }
}
