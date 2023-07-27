package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        /* Instanziierung Klasse --> Objekte */
        // Cat -- Referenztyp // Klasse
        // Cat -- Referenzvariable 

        Cat cat1 = new Cat();
        
        cat1.firstName = "Dickabella";
        cat1.furColor = "pink";
        cat1.age = 69;

        output(cat1.firstName);
        output(cat1.furColor);

        // .. was nicht passt, wird passend gemacht .. ;-)
        output(Integer.toString(cat1.age));
        output(String.valueOf(cat1.age));

        output("-----------------------");
        
        Cat cat2 = new Cat();
    }

    public static void output(String outputData) {
        System.out.println(outputData);
    }
}