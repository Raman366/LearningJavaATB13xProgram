package java_tasks.programSuper;

public class Task048_Protected_Super {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.doEat();
    }
}

class Animal{
    protected void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void doEat(){
        // Calls the inherited protected method
        eat();
    }
}
