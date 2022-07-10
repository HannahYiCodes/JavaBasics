package com.yi.cinema;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int numberOfRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int numberOfSeats = scanner.nextInt();

        int totalSeats = numberOfRows * numberOfSeats;
        int totalIncome;

        if(totalSeats < 60) {
            totalIncome = totalSeats * 10;
            }else{
            int frontHalfOfRows = numberOfRows / 2;
            int backHalfOfRows = numberOfRows - frontHalfOfRows;

            totalIncome = frontHalfOfRows * numberOfSeats * 10
                    + backHalfOfRows * numberOfSeats * 8;
        }
        System.out.println("Total income: ");
        System.out.println("$" + totalIncome);
        }
    }

//        System.out.println("Cinema:");
//        System.out.println(" 1 2 3 4 5 6 7 8");
//        for(int i=0; i<0; i++) {
//            System.out.print(i + " ");
//            for(int j = 0; j < 9; j++) {
//                System.out.print("S ");
//            }
//            System.out.println();