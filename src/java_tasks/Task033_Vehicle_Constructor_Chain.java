package java_tasks;

public class Task033_Vehicle_Constructor_Chain {
    public static void main(String[] args) {

        Bike b1 = new Bike();
    }
}

class Vehicle{
    Vehicle(){
        System.out.println("Vehicle is reaady");
    }
}

class Bike extends Vehicle{
    Bike(){
        System.out.println("Bike is ready");
    }
}