package com.yi.objectfactory.bugfactory;

public class Bug {
    private String bugSpecies;
    private short bugSizeInches;
    private short bugLegs;
    private boolean isBugNocturnal;

    public Bug(String bugSpecies, short bugSizeInches, short bugLegs, boolean isBugNocturnal) {
        this.bugSpecies = bugSpecies;
        this.bugSizeInches = bugSizeInches;
        this.bugLegs = bugLegs;
        this.isBugNocturnal = isBugNocturnal;
    }

    public String getBugSpecies() {
        return bugSpecies;
    }

    public void setBugSpecies(String bugSpecies) {
        this.bugSpecies = bugSpecies;
    }

    public short getBugSizeInches() {
        return bugSizeInches;
    }

    public void setBugSizeInches(short bugSizeInches) {
        this.bugSizeInches = bugSizeInches;
    }

    public short getBugLegs() {
        return bugLegs;
    }

    public void setBugLegs(short bugLegs) {
        this.bugLegs = bugLegs;
    }

    public boolean isBugNocturnal() {
        return isBugNocturnal;
    }

    public void setisBugNocturnal(boolean nocturnal) {
        isBugNocturnal = nocturnal;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bug{");
        sb.append("bugSpecies='").append(bugSpecies).append('\'');
        sb.append(", bugSizeInches=").append(bugSizeInches);
        sb.append(", bugLegs=").append(bugLegs);
        sb.append(", isNocturnal=").append(isBugNocturnal);
        sb.append('}');
        return sb.toString();
    }
}
