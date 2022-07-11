package com.yi.objectfactory.countryfactory;

import com.yi.objectfactory.UI;

public class Main {
    public static void main(String[] args) {
        System.out.println("Country Factory\n\n");
        String countryName = UI.readString("What is the country's name?");
        String countryCapital = UI.readString("What is the country's capital?");
        int countryPop = UI.readInt("What is the country's population?", 0, 1400000000);
        int capitalPop = UI.readInt("What is the country's capital's population?", 0, 1400000000);

        Country generatedCountry = new Country(countryName, countryCapital, countryPop, capitalPop);
        System.out.println(generatedCountry);

    }
}
