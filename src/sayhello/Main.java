package sayhello;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("Hello, nice to meet you " + name);

        System.out.print("What is you first name?");
        String firstName = scanner.next().trim();
        System.out.print("What is you last name?");
        String lastName = scanner.next().trim();
        System.out.println("It is so nice to formally meet you " + firstName + " " + lastName);
    }
}
