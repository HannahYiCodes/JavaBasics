//package com.yi.cinema;
//
//import java.util.Scanner;
//
//public class Menu {
//    private static char[][] cinemaHall;
//    static Scanner scanner = new Scanner(System.in);
//
//
//    //    createCinema();
//    int command;
//    do
//
//    {
//        System.out.println("1. Show the seats");
//        System.out.println("2. Buy a ticket");
//        System.out.println("0. Exit");
//        command = scanner.nextInt();
//        switch (command) {
//            case 1:
////                printCinemaHall();
//                break;
//            case 2:
////                takeTicket();
//                break;
//            case 0:
//                break;
//            default:
//                System.out.println("Error! Wrong command!");
//        }
////    }while(command != 0);
//        public static void createCinema() {
//        System.out.println("Enter the number of rows: ");
//        int numberOfRows = scanner.nextInt();
//        System.out.println("Enter the number of seats in each row:");
//        int numberOfSeats = scanner.nextInt();
//
//        cinemaHall = new char[numberOfRows][numberOfSeats];
//        for (int i = 0; i < numberOfRows; i++) {
//            for (int j = 0; j < numberOfSeats; j++) {
//                cinemaHall[i][j] = 'S';
//            }
//        }
//    }
//        public static void printCinemaHall () {
//        System.out.println("Cinema:");
//        System.out.println(" ");
//        for (int i = 1; i <= cinemaHall[0].length; i++) {
//            System.out.print(" " + i);
//        }
//        System.out.println();
//        for (int i = 0; i < cinemaHall.length; i++) {
//            System.out.println(i + 1);
//            for (int j = 0; j < cinemaHall[0].length; j++) {
//                System.out.print(" " + cinemaHall[i][j]);
//            }
//            System.out.println();
//        }
//        public static void takeTicket () {
//            System.out.println("Enter a row number:");
//            int seatRow = scanner.nextInt();
//            System.out.println("Enter a seat number in that row:");
//            int seatNumber = scanner.nextInt();
//            int totalSeats = cinemaHall.length * cinemaHall[0].length;
//            int priceTicket;
//
//            if (totalSeats <= 60) {
//                priceTicket = 10;
//            } else {
//                int frontHalfOfRows = cinemaHall.length / 2;
//                if (seatRow <= frontHalfOfRows) {
//                    priceTicket = 10;
//                } else {
//                    priceTicket = 8;
//                }
//            }
//            System.out.println("Ticket price: $" + priceTicket);
////            cinemaHall(seatRow - 1)[seatNumber - 1] = '8'
//            }
//        }
//    }
//}