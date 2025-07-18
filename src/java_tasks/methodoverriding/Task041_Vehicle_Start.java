package java_tasks.methodoverriding;

public class Task041_Vehicle_Start {
    public static void main(String[] args) {

        Bike b1 = new Bike();
        b1.start();

        Car car = new Car();
        car.start();
    }
}

class Vehicle{

    void start(){
        System.out.println("Starting Vehicle");
    }
}

class Bike extends Vehicle{

    @Override
    void start(){
        System.out.println("Kick to start Bike");
    }
}

class Car extends Vehicle{

    @Override
    void start(){
        System.out.println("Turn the key to start Car");
    }
}