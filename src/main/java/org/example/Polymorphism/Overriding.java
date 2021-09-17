package org.example.Polymorphism;

class Car {
    void display(){
        System.out.println("Cars are Increasing in Number");
    }
}
class Sportscar extends Car {
    void display(){
        System.out.println("Sports car are less in number");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Sportscar benz = new Sportscar();
        benz.display();

    }
}
