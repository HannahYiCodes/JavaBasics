package com.yi.objectfactory.companyfactory;

import com.yi.objectfactory.UI;

public class Main {
    public static void main(String[] args) {
        System.out.println("Company Factory\n\n");
        String companyName = UI.readString("What is the company name?");
        short yearEstablished = UI.readShort("What year was the company established?", (short) 0, (short) 9000);
        double marketCap = UI.readDouble("What is the market cap (as a decimal)?", 0, 1);

        Company generatedCompany = new Company(companyName, yearEstablished, marketCap);
        System.out.println(generatedCompany);

    }
}
