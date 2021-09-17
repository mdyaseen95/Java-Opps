package org.example.Constructor;

public class Car {

    int model;
    String variant;

    //Default Constructor
    Car() {
        System.out.println("Nano is Cheap car");
    }

    Car( String w, int m ){
        variant = w;
        model =  m;
    }
    public static void main(String[] args) {
        Car nano = new Car(); //default constructor
        Car maruthi = new Car("petrol", 800); //Parameterized constructor
        System.out.println("Maruthi Car Details");
        System.out.println(maruthi.variant + " " + maruthi.model);
    }
}
