package ex_24_OPPs_Super;

public class Lab189_SuperKeyword {
    public static void main(String[] args) {
        Car c1 = new Car(100);
        c1.display();
    }
}

class Vehicle{
    public int maxSpeed = 200;

    Vehicle(){
        System.out.println("Default Cons");
    }
    Vehicle(int a){
        System.out.println("ParaM Cons");
        System.out.println("ParaM Cons " + a);
    }

    // Method Overloading - Same, same name function with different arguments.
    void message(int a){
        System.out.println("Type 2");
    }
    void message(){
        System.out.println("Type 1");
    }
    int message(String a){
        System.out.println("Type 4");
        return 0;
    }

    void display(){
        System.out.println("Parent Vehicle");
    }
}

class Car extends Vehicle{
    private int maxSpeed = 190;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    Car(){
        super(); // calling parents default
    }
    Car(int a){
        super(10); // parent's parameterized call
    }

    @Override
    void display() {
        System.out.println(super.maxSpeed); //  instance variable call
        System.out.println(this.maxSpeed); // This means my variable call.
        System.out.println("Hii Override");
    }
}
