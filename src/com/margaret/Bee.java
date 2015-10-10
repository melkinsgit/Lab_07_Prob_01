package com.margaret;

/**
 * Created by margaretelkins on 10/10/15.
 */
public class Bee extends Insect {
    private String beeColor;
    private boolean makesHoney;
    private String favFlower;

    public Bee (String bugName, int wingNum, String beeColor, boolean makesHoney, String favFlower){
        this.bugName = bugName;
        this.wingNum = wingNum;
        this.beeColor = beeColor;
        this.makesHoney = makesHoney;
        this.favFlower = favFlower;
    }

    public printSpeciesData (){
        System.out.println("The " + bugName + " bee has "+ LEGS + " legs and " + wingNum + " wings. It is a " + beeColor + " bee.");
        if (makesHoney){
            System.out.println("The " + bugName + " makes honey.");
        }
        else {
            System.out.println("The " + bugName + " does not make honey.");
        }
    }
}
