package ex_25_Abstraction_Abstract_Class;

public class Lab192_AB_Cars {
    public static void main(String[] args) {
        WagonR car = new WagonR();
        car.drive();
    //    Engine e1 = new Engine();

    }
}

abstract class Engine{
    abstract void startEngine();

    abstract void stopEngine();

    void checkEngine(){
        System.out.println("Everything is fine");
    }
}

class WagonR extends Engine{

    @Override
    void startEngine() {
        System.out.println("Starting the Car");
    }

    @Override
    void stopEngine() {
        System.out.println("Stoping the Car");
    }
    void drive(){
        checkEngine();
        startEngine();
        stopEngine();
    }
}
