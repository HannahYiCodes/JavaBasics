package com.yi.challenge2;

public class Car {
    private String make;
    private String model;
    private int mileage;
    private float gasTankPercent;

    public Car(String make, String model, int mileage, float gasTankPercent) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.gasTankPercent = gasTankPercent;
    }
    public String getMake() {
        return make;
    }
    public void getMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void getModel(String model) {
        this.model = model;
    }
    public int getMileage() {
        return mileage;
    }

    public void getMileage(int mileage) {
        this.mileage = mileage;
    }
    public float getGasTankPercent() {
        return gasTankPercent;
    }
    public void getGasTankPercent(float gasTankPercent) {
        this.gasTankPercent = gasTankPercent;
    }

    @Override
    public String toString() {
        return "Make: " + make + ", Model: " + model + ", Mileage: " + mileage + ", Gas Tank: " + gasTankPercent*100 + "%";
    }
}
