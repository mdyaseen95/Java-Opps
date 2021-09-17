package org.example.inheritance;

public class Product {
    int pid;
    String pname;
  void display ( int pid , String pname ){
      this.pid = pid;
      this.pname = pname;
      System.out.println("Producid and Productname  " + pid + " " + pname);
  }
}
class Mobile extends Product {
    int ram;
    int price;
    void display2  ( int ram, int price){
        this.ram = ram;
        this.price = price;
    }
}

class Online {
    public static void main(String[] args) {
    Mobile mi = new Mobile();
    mi.display(121, "xiomi");
    mi.display2(6, 1500);
    Mobile samsung = new Mobile();
    samsung.display(122, "galaxy");
    samsung.display2(4, 12000);
        System.out.println("Mobile specifications\tproductid\tproductname\tproductram\tproductprice\t");
        System.out.println("Mobile specifications\t" + mi.pid +"\t\t\t" + mi.pname + "\t\t\t " + mi.ram + "\t\t\t" +mi.price);
        System.out.println("Mobile specifications\t" + samsung.pid +"\t\t\t" + samsung.pname + "\t\t\t " + samsung.ram + "\t\t\t" +samsung.price);
    }
}