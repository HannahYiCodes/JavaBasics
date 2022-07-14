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

// POJO Objects: Plain Old Java Objects

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
        final StringBuilder sb = new StringBuilder("Airplane{");
        sb.append("\nModel: '").append(modelName).append('\'');
        sb.append("\nTail Number: '").append(tailNumber).append('\'');
        sb.append("\nPassenger Capacity: ").append(passengerCap);
        sb.append("\nPrice: ").append(marketValue);
        sb.append("\nFuel %: ").append(gasTank*100).append('%');
        sb.append("\nThe plane is ").append(isFlying ? "15,000ft in the air!" : "on the ground"); // boolean ternary operator
        return sb.toString();
    }
}