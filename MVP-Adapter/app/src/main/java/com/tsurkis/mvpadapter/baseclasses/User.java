package com.tsurkis.mvpadapter.baseclasses;

/**
 * Created by T.Surkis on 10-Jun-17.
 */
public class User {
    private String name;
    private int age;
    private boolean isMarried;

    public User(String name, int age, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMarried() {
        return isMarried;
    }
}
