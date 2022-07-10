package com.yi.objectfactory.airplanefactory;

// COMMAND N = CONSTRUCTORS SHORT CUT
public class Airplane {
    // modelName, tailNumber, passengerCap, marketValue, gasTankPercent, gasTank, isFlying
    private String modelName;
    private String tailNumber;
    private short passengerCap;
    private int marketValue;
    private double gasTank;
    private boolean isFlying;

    public Airplane(String modelName, String tailNumber, short passengerCap, int marketValue, double gasTank, boolean isFlying) {
        this.modelName = modelName;
        this.tailNumber = tailNumber;
        this.passengerCap = passengerCap;
        this.marketValue = marketValue;
        this.gasTank = gasTank;
        this.isFlying = isFlying;
    }

    public String getModelName() {
        return modelName;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public short getPassengerCap() {
        return passengerCap;
    }

    public int getMarketValue() {
        return marketValue;
    }

    public double getGasTank() {
        return gasTank;
    }

    public boolean isFlying() {
        return isFlying;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "modelName='" + modelName + '\'' +
                ", tailNumber='" + tailNumber + '\'' +
                ", passengerCap=" + passengerCap +
                ", marketValue=" + marketValue +
                ", gasTank=" + gasTank +
                ", isFlying=" + isFlying +
                '}';
    }
}