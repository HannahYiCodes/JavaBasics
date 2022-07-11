package com.yi.objectfactory.countryfactory;

public class Country {
    private String countryName;
    private String countryCapital;
    private int countryPop;
    private int capitalPop;

    public Country(String countryName, String countryCapital, int countryPop, int capitalPop) {
        this.countryName = countryName;
        this.countryCapital = countryCapital;
        this.countryPop = countryPop;
        this.capitalPop = capitalPop;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCountryCapital() {
        return countryCapital;
    }

    public int getCountryPop() {
        return countryPop;
    }

    public int getCapitalPop() {
        return capitalPop;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", countryCapital='" + countryCapital + '\'' +
                ", countryPop=" + countryPop +
                ", capitalPop=" + capitalPop +
                '}';
    }
}
