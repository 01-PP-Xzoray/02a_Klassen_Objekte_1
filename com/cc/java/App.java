package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        /* Instanziierung Klasse --> Objekte */
        // Cat -- Referenztyp // Klasse
        // Cat -- Referenzvariable 

        // Instanziierung mit custom constructor
        Cat cat1 = new Cat("Dickabella", "pink", 17);

        /* Ausgabe */
        output(cat1.getFirstName());
        output(cat1.getFurColor());
        // .. was nicht passt, wird passend gemacht! // 1.Möglichkeit
        output(String.valueOf(cat1.getAge()));

        output("-----------------------");
        
        Cat cat2 = new Cat("Analonzo", "brown", 69);

        output(cat2.getFirstName());
        output(cat2.getFurColor());
        // Typenkonventierung int --> String // 2.Möglichkeit
        output(Integer.toString(cat2.getAge()));
    }   

    public static void output(String outputData) {
        System.out.println(outputData);
    }
}