package com.yi.carfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the owner's name\nName: ");
        String useInputOwner = scanner.nextLine();

        System.out.println("Enter the car make\nMake: ");
        String useInputMake = scanner.nextLine();

        System.out.println("Enter the car model\nModel: ");
        String useInputModel = scanner.nextLine();

        carCreation newCar = new carCreation(useInputOwner, useInputMake, useInputModel);
        System.out.println("Your new car\n\n" + newCar);
    }

    public static class carCreation {
        private final String owner;
        private final String make;
        private final String model;

        public carCreation(String owner, String make, String model) {
            this.owner = owner;
            this.make = make;
            this.model = model;
        }

        public String toString() {
            return owner + " owns the car " + make + " " + model;
        }
    }
}

//        public String getTheOwner() {return owner;}
//        public void getOwner(String owner) { this.owner = owner; }
//
//        public String getTheMake() {return make;}
//        public void getMake(String make) { this.make = make; }
//
//        public String getTheModel() {return model;}
//        public void getModel(String model) {this.model = model;}
