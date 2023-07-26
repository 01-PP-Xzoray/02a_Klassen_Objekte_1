package com.cc.java;

public class Cat {
    
// this --> Instanzvariable & Objektgebunden

public void tellYourAddress() {
    System.out.println("Blick von innen: " + this);
}

public void testObj() {
    System.out.println("Grüße aus dem Objekt " + this);
}

public static void testClass() {
    System.out.println("Grüße aus der Klasse!");
}

}