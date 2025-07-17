package ex_19_OPPs_Constructor;

public class Lab171_DC {
    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car();
        c1.name = "BMW";
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);

        System.out.println(c2.name);
        c2.name = "TATA";
        System.out.println(c2.name);

        Baby1 b1 = new Baby1();
        //        b1.name = "Sumit";
        System.out.println(b1.name);
    }
}

class Car{
    String name;
    int year;
    String model;

    // DC
    Car(){
        name = "Unknown Car";
        year = 1992;
        model = "xxxx";

    }
}

class Baby1{
    String name;

    Baby1(){
        name = "Amit";
    }
}
