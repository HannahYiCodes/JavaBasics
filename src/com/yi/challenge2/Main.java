package com.yi.challenge2;

public class Main {
    public static void main(String[] args) {
        Car nameCarGen = new Car();
        String generatedCarName1 = Car.generateCarName("Camaro 2SS", "Chevy", 10000, .10f);
        String generatedCarName2 = Car.generateCarName("Mustang GT", "Ford", 30000, .50f);
        String generatedCarName3 = Car.generateCarName("Hellcat", "Dodge", 100, .90f);
        System.out.println(generatedCarName1);
        System.out.println(generatedCarName2);
        System.out.println(generatedCarName3);
    }
}
