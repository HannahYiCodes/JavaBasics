package com.yi.objectfactory.companyfactory;

public class Company {
    private String companyName;
    private short yearEstablished;
    private double marketCap;

    public Company(String companyName, short yearEstablished, double marketCap) {
        this.companyName = companyName;
        this.yearEstablished = yearEstablished;
        this.marketCap = marketCap;
    }

    public String getCompanyName() {
        return companyName;
    }

    public short getYearEstablished() {
        return yearEstablished;
    }

    public double getMarketCap() {
        return marketCap;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", yearEstablished=" + yearEstablished +
                ", marketCap=" + marketCap +
                '}';
    }
}
