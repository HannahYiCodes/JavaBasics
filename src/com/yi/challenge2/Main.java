// Car Class Challenge
package com.yi.challenge2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Chevy", "Camaro 2SS", 10000, .10f);
        Car car2 = new Car("Ford", "Mustang GT", 30000, .50f);
        Car car3 = new Car("Dodge", "Hellcat", 100, .90f);

//        System.out.println("Make: " + car1.make + ", " + "Model: " + car1.model + ", " + "Mileage: " + car1.mileage + ", " + "Gas Tank Percent: " + car1.gasTankPercent*100 + "%");
//        System.out.println("Make: " + car2.make + ", " + "Model: " + car2.model + ", " + "Mileage: " + car2.mileage + ", " + "Gas Tank Percent: " + car2.gasTankPercent*100 + "%");
//        System.out.println("Make: " + car3.make + ", " + "Model: " + car3.model + ", " + "Mileage: " + car3.mileage + ", " + "Gas Tank Percent: " + car3.gasTankPercent*100 + "%");

        Car[] carsArray = {car1, car2, car3};
        for (int i = 0; i < carsArray.length; i++) {
            System.out.println(carsArray[i]);
        }
    }
}
