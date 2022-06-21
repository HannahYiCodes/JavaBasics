package com.yi.challenge1;

public class Main {
    public static void main(String[] args) {
        String firstName = "Hannah";
        String lastName = "Yi";
        String fullName = createFullName(firstName, lastName);

        NameGenerator nameGen = new NameGenerator();
        String generatedFullName = NameGenerator.generateFullName("Lucifer", "Hellfire");

        System.out.println(fullName);
        System.out.println(createFullName("First", "Last"));
        System.out.println(generatedFullName);
    }

    private static String createFullName (String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
