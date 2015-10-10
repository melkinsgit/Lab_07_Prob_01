package com.margaret;

/**
 * Created by margaretelkins on 10/10/15.
 */
public class Butterfly extends Insect {
    private String wingColor;
    private String favFlower;

    public String getWingColor() {
        return wingColor;
    }

    public String getFavFlower() {
        return favFlower;
    }

    public void setWingColor(String wingColor) {
        this.wingColor = wingColor;
    }

    public void setFavFlower(String favFlower) {
        this.favFlower = favFlower;
    }

    public Butterfly (String bugName, String wingColor, int wingNum, String favFlower) {
        this.bugName = bugName;
        this.wingColor = wingColor;
        this.wingNum = wingNum;
        this.favFlower = favFlower;}

    public printButterflyData ();{
        System.out.println("A " + bugName + " butterfly has " + LEGS + " legs, " + wingNum + " wings. It is " + wingColor + " and it's favorite flower is called " + favFlower + ".");
    }
}
