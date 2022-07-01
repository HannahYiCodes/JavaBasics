package com.yi.basicio;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        whatIsYourDog();
    }

    public static void whatIsYourDog() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your dog's name?\nName: ");
        String name = scanner.nextLine().trim();

        System.out.print("What breed is your dog (mainly)?\nBreed: ");
        String breed = scanner.nextLine().trim();

        System.out.print("How old is your dog?\nAge: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Is your dog a mixed breed?\nTrue or False: ");
        boolean mixedBreed = scanner.nextBoolean();

        System.out.println("Hello " + name + ". You are a " + breed + " who is " + age + " years old.\nMixed Breed: " + mixedBreed);
    }
}