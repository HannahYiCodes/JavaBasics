package com.yi.asktheuser;

import java.util.Scanner;

public class UserInterface {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is your name?\nName: ");
        String userName = scanner.nextLine();

        System.out.println("Your name; " + userName);

    }
}

// mutants
// mutable vs immutable = ability of something to be changed