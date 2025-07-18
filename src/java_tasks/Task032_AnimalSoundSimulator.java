package java_tasks;

public class Task032_AnimalSoundSimulator {
    public static void main(String[] args) {

        Cat myCat = new Cat();

        // Inherited method from Animal
        myCat.makeSound();

        // Method specific to Cat
        myCat.meow();
    }
}

class Animal{
    void makeSound(){
        System.out.println("Animal will sound");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Cat says Meow");
    }
}