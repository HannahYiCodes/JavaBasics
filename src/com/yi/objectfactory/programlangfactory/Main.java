package com.yi.objectfactory.programlangfactory;

import com.yi.objectfactory.UI;
import com.yi.objectfactory.countryfactory.Country;

public class Main {
    public static void main(String[] args) {
        System.out.println("Programming Language Factory\n\n");
        String langName = UI.readString("What is the programming language name?");
        String fileExtension = UI.readString("What is the file extension?");
        boolean isObjectOriented = UI.readBoolean("Is it object oriented?");

        ProgramLang generatedProgramLang = new ProgramLang(langName, fileExtension, isObjectOriented);
        System.out.println(generatedProgramLang);
    }
}
