package com.yi.objectfactory;

import java.util.Scanner;

public class UI {
    // one method for each type of data
    // all static methods
    // take in a questions, and return a piece of data of the specific type requested

    private static Scanner scanner = new Scanner(System.in);

    public static String readString(String question) {
        System.out.print(question + "\nInput: ");
        String input = scanner.nextLine();
        if(input.trim().equals("")) {
            return readString(question);
        } else {
            return input;
        }
    }

    public static boolean readBoolean(String question) {
        while (true) {
            try {
                System.out.println(question + "\n(true/false): ");
                boolean input = scanner.nextBoolean();
                scanner.nextLine();
                return input;
            } catch (Exception exception) {
                System.out.println("Input must be true OR false.");
                scanner.nextLine();
            }
        }
    }

    public static int readInt (String question, int min, int max) {
        while (true) {
            try {
                System.out.println(question + "\n("+min+" - " + max + "): ");
                int input = scanner.nextInt();
                scanner.nextLine();
                if (input <= max && input >= min) {
                    return input;
                } else {
                    System.out.println("Input must be between " + min + " and " + max);
                }
            } catch (Exception exception) {
                System.out.println("Input must be between " + min + " and " + max);
                scanner.nextLine();
            }
        }
    }

    public static short readShort (String question, short min, short max) {
        while (true) {
            try {
                System.out.println(question + "\n("+min+" - " + max + "): ");
                short input = scanner.nextShort();
                scanner.nextLine();
                if (input <= max && input >= min) {
                    return input;
                } else {
                    System.out.println("Input must be between " + min + " and " + max);
                }
            } catch (Exception exception) {
                System.out.println("Input must be between " + min + " and " + max);
                scanner.nextLine();
            }
        }
    }

    public static double readDouble (String question, double min, double max) {
        while (true) {
            try {
                System.out.println(question + "\n("+min+" - " + max + "): ");
                double input = scanner.nextDouble();
                scanner.nextLine();
                if (input <= max && input >= min) {
                    return input;
                } else {
                    System.out.println("Input must be between " + min + " and " + max);
                }
            } catch (Exception exception) {
                System.out.println("Input must be between " + min + " and " + max);
                scanner.nextLine();
            }
        }
    }
}

// OTHER METHODS TO REPEAT THE QUESTION UNTIL IT IS ANSWERED WITH THE CORRECT VALUE
//public static String readString (String question) {
//    while (true) {
//        System.out.println(question);
//        String input scanner.nextLine();
//        if ( !input.trim().equals("") ) {
//            return input
//        }
//    }
//
//}
// DO LOOP
//public static String readString(String question) {
//    String input;
//    do{
//        System.out.println(question);
//        input = scanner.nextLine();
//    }while (input.trim().equals(""));
//    return input;
//}