package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        /* Instanziierung Klasse --> Objekte */
        // Cat -- Referenztyp // Klasse
        // Cat -- Referenzvariable 

        Cat cat1 = new Cat();
        
        /* Wertzuweisung */ 
        cat1.firstName = "Dickabella";
        cat1.furColor = "pink";
        cat1.age = 17;

        /* Ausgabe */
        output(cat1.tellYourName());
        output(cat1.furColor);
        // .. was nicht passt, wird passend gemacht! // 1.Möglichkeit
        output(String.valueOf(cat1.age));

        output("-----------------------");
        
        Cat cat2 = new Cat();
        cat2.firstName = "Analonzo";
        cat2.furColor = "brown";
        cat2.age = 69;

        output(cat2.firstName);
        output(cat2.furColor);
        // Typenkonventierung int --> String // 2.Möglichkeit
        output(Integer.toString(cat2.age));
    }   

    public static void output(String outputData) {
        System.out.println(outputData);
    }
}