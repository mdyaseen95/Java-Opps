package org.example.staticuse;

public class Employee {

    int id;
    String name;
    static String company = "Bridge labz";               //Static VARIABLE

    void display( int r, String n) {
        id = r;
        name = n;
        System.out.println(id + " " + n + " " + company);
    }

    static void change(){
        company = "ABC";                                   //Static Method to change static variable
    }

    static {
        System.out.println("Hello Employees");
        System.out.println("Welcome");                      //static block
    }

}

class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        System.out.println("Old employess of Bridgelabz");
        e1.display(100,"Ramesh");
        e2.display(101, "Rahul");
        System.out.println("New Employees of ABC");
        e1.change();
        e2.change();
        e1.display(100,"Ramesh");
        e2.display(101, "Rahul");
    }
}