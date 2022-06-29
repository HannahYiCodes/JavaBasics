package com.yi.sayhello;

import com.yi.challenge1.NameGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        whatIsYourName();
        whatIsYourFullName();
    }

// We do not assign parameters here because all of our data is coming from the user.
    public static void whatIsYourName() {
        //1) create a Scanner instance
    Scanner scanner = new Scanner(System.in); // System.in = input stream.
        //2) asking the question
    System.out.print("What is your name?\nName: "); // System.out = print stream
        //3) receive use input
    String name = scanner.nextLine().trim(); // removes "whitespace" = (any kind of space) Doesn't delete spaces in-between characters.
        //4) use the use input
    System.out.println("Hello, nice to meet you " + name + ". I hope you have a great day!");
}
        public static void whatIsYourFullName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is you first name?\n");
        String firstName = scanner.next().trim();
        System.out.print("What is you last name?\n");
        String lastName = scanner.next().trim();

        String fullName = new NameGenerator().generateFullName(firstName, lastName);

        System.out.println("It is so nice to formally meet you " + firstName + " " + lastName);
    }
}