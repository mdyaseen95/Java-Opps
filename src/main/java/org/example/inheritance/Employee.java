package org.example.inheritance;

//Multi-level inheritance;

public class Employee {
    int id;
    int Salary;
    void display1( int id, int salary){
        this.id = id;
        this.Salary = Salary;
    }
}

class programmer extends Employee {
    int bonus;
    void display2( int bonus ) {
        this.bonus = bonus;

    }
}
class javadeveloper extends programmer {
    int hours ;
    void display3 ( int hours ){
        this.hours = hours;
    }
}

class test {
    public static void main(String[] args) {

        javadeveloper j1 = new javadeveloper();
        j1.display1(500, 20000);
        j1.display2(1000);
        j1.display3(10);
        System.out.println("employee details " + j1.id + " " + j1.Salary + " " + j1.bonus + " " + j1.hours) ;
    }
}