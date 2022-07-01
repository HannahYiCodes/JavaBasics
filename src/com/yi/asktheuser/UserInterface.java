package com.yi.asktheuser;

import java.util.Scanner;

public class UserInterface {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name = askUserName();
        int age = askUserAge();
        System.out.println("Final Report:\nName: " + name +"\nAge: " + age); // after all the questions, it will display this
    }

    private static int askUserAge() {
        System.out.print("What is your age?\nAge: ");
        int userAge = scanner.nextInt();
        System.out.println("Your age; " + userAge);
        return userAge;
    }

    private static String askUserName () {
        System.out.print("What is your name?\nName: ");
        String userName = scanner.nextLine();
        System.out.println("Your name; " + userName);
        return userName;
    }
}

// mutants
// mutable vs immutable = ability of something to be changed