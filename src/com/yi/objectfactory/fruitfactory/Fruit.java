package com.yi.objectfactory.fruitfactory;

public class Fruit {
    private String fruitName;
    private String fruitColor;
    private boolean hasSeeds;

    public Fruit(String fruitName, String fruitColor, boolean hasSeeds) {
        this.fruitName = fruitName;
        this.fruitColor = fruitColor;
        this.hasSeeds = hasSeeds;
    }

    public String getFruitName() {
        return fruitName;
    }

    public String getFruitColor() {
        return fruitColor;
    }

    public boolean isHasSeeds() {
        return hasSeeds;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruitName='" + fruitName + '\'' +
                ", fruitColor='" + fruitColor + '\'' +
                ", hasSeeds=" + hasSeeds +
                '}';
    }
}
