package com.yi.asktheuser;

public class UserInterface_3 {
    private String theName;
    private int theInteger;
    private boolean theBoolean;
    private byte theByte;
    private short theShort;
    private float theFloat;
    private long theLong;
    private double theDouble;

    public UserInterface_3(String theName, int theInteger, boolean theBoolean, byte theByte, short theShort, float theFloat, long theLong, double theDouble) {
        this.theName = theName;
        this.theInteger = theInteger;
        this.theBoolean = theBoolean;
        this.theByte = theByte;
        this.theShort = theShort;
        this.theFloat = theFloat;
        this.theLong = theLong;
        this.theDouble = theDouble;
    }

    public String getTheString() {
        return theName;
    }
    public void setTheString(String theString) {
        this.theName = theName;
    }

    public int getTheInteger() { return theInteger; }
    public void setTheInteger(int theInteger) { this.theInteger = theInteger; }

    public boolean getTheBoolean() { return theBoolean; }
    public void setTheBoolean(boolean theBoolean) { this.theBoolean = theBoolean; }

    public byte getTheByte() { return theByte; }
    public void setTheByte(byte theByte) { this.theByte = theByte; }

    public short getTheShort() { return theShort; }
    public void setTheShort(short theShort) { this.theShort = theShort; }

    public float getTheFloat() { return theFloat; }
    public void setTheFloat(float theFloat) { this.theFloat = theFloat; }

    public long getTheLong() { return theLong; }
    public void setTheLong(long theLong) { this.theLong = theLong; }

    public double getTheDouble() { return theDouble; }
    public void setTheDouble(double theDouble) { this.theDouble = theDouble; }

}

//    @Override
//    public String generatedInfo() {
//        return "String: " + theName +
//                "\nThe Integer: " + theInteger +
//                "\nThe Boolean: " + theBoolean +
//                "\nThe Byte: " + theByte +
//                "\nThe Short: " + theShort +
//                "\nThe Float: " + theFloat +
//                "\nThe Long: " + theLong +
//                "\nThe Double: " + theDouble;
//    }
