package org.example.Polymorphism;

class A {
    public static int sum (int x, int y){
        return x + y;
    }
}
class B extends A {
    public static int sum (int x , int y , int z){
        return  x + y + z;
    }
}

public class Overloading{
    public static void main(String[] args) {
        int result = A.sum(5,4);
        int result2 = B.sum(4, 5, 6);
        System.out.println("reults of overloading Sum method " + result + " " + result2 );
    }
}