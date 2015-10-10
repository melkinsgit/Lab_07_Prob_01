package com.margaret;

/**
 * Created by Margaret on 10/8/2015.
 */
public class Insect {
    protected String bugName;
    protected int wingNum;
    static final int LEGS = 6;

    public void setBugName(String bugName) {
        this.bugName = bugName;
    }

    public void setWings(int wings) {
        this.wingNum = wings;
    }

    public String getBugName() {
        return bugName;
    }

    public int getWings() {
        return wingNum;
    }
}
