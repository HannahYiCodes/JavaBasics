package com.yi.challenge2;

public class Car {
    public static String generateCarName(String carMake, String carModel, Integer carMileage, float gasTankPercent) {
        return "Make: "+ carMake + ", " + "Model: " + carModel + ", " + "Mileage: " + carMileage + ", " + "Gas Tank Percent: " + gasTankPercent*100 + "%";
    }
}
