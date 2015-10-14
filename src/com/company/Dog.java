package com.company;

/**
 * Created by admin on 10/14/15.
 */
public class Dog {
    private String name;
    private String address;
    private int[] walksPerDay;   //For example, {0, 1, 1, 2, 1, 0, 1}

    public String getName(){
        return name;
    }

    Dog(String name, String address) {
        this.name = name;
        this.address = address;
    }

    protected void setWalksPerDay(int walks[]) {
        walksPerDay = walks;
    }

    //monday = 0, tuesday = 1, wednesday = 2.....
    protected int getNumberOfWalksForDay(int dayOfWeek) {

        return walksPerDay[dayOfWeek];
    }


}
