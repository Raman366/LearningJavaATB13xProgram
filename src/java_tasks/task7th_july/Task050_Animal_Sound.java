package java_tasks.task7th_july;

public class Task050_Animal_Sound {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();
    }
}

abstract class Animal{
   abstract void makeSound();

}
class Dog extends Animal{

    @Override
    void makeSound() {
        System.out.println("Barks");
    }
}
class Cat extends Animal{

    @Override
    void makeSound() {
        System.out.println("Meows");
    }
}
