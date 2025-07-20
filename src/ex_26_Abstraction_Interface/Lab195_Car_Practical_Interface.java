package ex_26_Abstraction_Interface;

public class Lab195_Car_Practical_Interface {
    public static void main(String[] args) {
        Car1 tesla = new Car1();
        tesla.drive();
    }
}

class Car1 implements Engine1, Brakes{

    void drive(){
        startEngine();
        applyBreak();
        stopEngine();
    }

    @Override
    public void applyBreak() {
        System.out.println("Apply Break");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stoping Engine");
    }
    @Override
    public void money() {
        System.out.println("Son has to earn money");
    }
}

interface Brakes {
    void applyBreak();
    void money();
}

interface Engine1 {
    void startEngine();
    void money();
    void stopEngine();

    default void completeF1() {
        System.out.println("Default complete function!");
    }

}
