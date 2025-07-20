package java_tasks.task7th_july;

public class Task055_Interface_With_Default_Static {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        Vehicle.fuelType();
    }
}

interface Vehicle{
    default void start(){
        System.out.println("Vehicle is started");
    }

    static void fuelType(){
        System.out.println("Fuel type is Petrol");
    }
}

class Car implements Vehicle{

}
