package ex_25_Abstraction_Abstract_Class;

public class Lab191_Abstraction {
    public static void main(String[] args) {
        Car c1 = new Car();
        // Father f1 = new Father(); // This is abstract in nature.
        Child ch = new Child();
        Father fa = new Child(); // Dynamic Dispatch.
        ch.loan50K();
    }
}

class Car{
    // This is concreate class
    // this doesn't have the abstract methods
    void done(){

    }
}
abstract class Father{
    // This is called the abstract function.
    abstract void loan50K();

    // as a complete function
    void loan25K(){
        System.out.println("Given the 25K");
    }
}
class Child extends Father{

    @Override
    void loan50K() {
        System.out.println("Son has to pay loan taken by father");
    }
}
