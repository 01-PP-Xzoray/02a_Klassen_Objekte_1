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

    public Cat(String firstName, String furColor, int age) {
    this.firstName = firstName;
    this.furColor = furColor;
    this.age = age;
    }
    
    public String getFirstName() {
        if (getPermission()) {
            return firstName;
        } else {
            return "Sorry, no permission!";
        }
    }

    public String getFurColor() {
        return furColor;
    }

    public int getAge() {
        return age;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    private boolean getPermission() {
        return false;
    }
}