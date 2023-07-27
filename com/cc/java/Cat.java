package com.cc.java;

public class Cat {

    /*   
    *  Felder (fields)
    *  Attribute (attributes)
    *  Eigenschaften (properties)
    *
    */

    // public - jeder darf sehen
    // private- nur die eigene Klasse darf sehen
    private String firstName;
    private String furColor;
    private int age;

    
    
    public String getFirstName() {
        return firstName;
    }

    public String getFurColor() {
        return furColor;
    }

    public int getAge() {
        return age;
    }

    public Cat(String firstName, String furColor, int age) {
        this.firstName = firstName;
        this.furColor = furColor;
        this.age = age;
    }
}