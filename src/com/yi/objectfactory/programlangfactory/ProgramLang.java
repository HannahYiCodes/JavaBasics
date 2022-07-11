package com.yi.objectfactory.programlangfactory;

public class ProgramLang {
    private String langName;
    private String fileExtension;
    private boolean isObjectOriented;

    public ProgramLang(String langName, String fileExtension, boolean isObjectOriented) {
        this.langName = langName;
        this.isObjectOriented = isObjectOriented;
        this.fileExtension = fileExtension;
    }

    public String getLangName() {
        return langName;
    }

    public boolean isObjectOriented() {
        return isObjectOriented;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    @Override
    public String toString() {
        return "ProgramLang{" +
                "langName='" + langName + '\'' +
                ", isObjectOriented=" + isObjectOriented +
                ", fileExtension='" + fileExtension + '\'' +
                '}';
    }
}
