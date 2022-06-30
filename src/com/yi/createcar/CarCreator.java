package com.yi.createcar;

import com.yi.challenge2.Car;

import java.util.Scanner;

public class CarCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello welcome to the car creator!\n\n");
        System.out.println("You will be allowed to create only one car, then the program will end");

        System.out.print("Enter a car make\nMake: ");
        String userInputMake = scanner.nextLine();

        System.out.print("Enter a car model\nModel: ");
        String userInputModel = scanner.nextLine();

        Car userCar = new Car(userInputMake, userInputModel, 0, 0);
        System.out.println("Your new car\n\n" + userCar);

    }
}
// infinite tries(loop), storing data the user inputs