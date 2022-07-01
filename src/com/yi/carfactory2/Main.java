package com.yi.carfactory2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the car's mileage\nMileage: ");
        int useInputMileage = scanner.nextInt();

        System.out.println("Enter the car's gas tank percent\nGas Tank: ");
        int useInputGasTank = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the car make\nMake: ");
        String useInputMake = scanner.nextLine();

        System.out.println("Enter the car model\nModel: ");
        String useInputModel = scanner.nextLine();

        createACarObject newestCar = new createACarObject(useInputMake, useInputModel, useInputMileage, useInputGasTank);
        System.out.println("Your new car\n\n" + newestCar);
    }

    public static class createACarObject {
        private final String make;
        private final String model;
        private final int mileage;
        private final int gasTankPercentage;

        public createACarObject(String make, String model, int mileage, int gasTankPercentage) {
            this.make = make;
            this.model = model;
            this.mileage = mileage;
            this.gasTankPercentage = gasTankPercentage;
        }

        public String toString() {
            return "This car is a " + make + " " + model + ".\nIts mileage: " + mileage + "\nIts gas is " + gasTankPercentage + "% full.";
        }
    }
}
