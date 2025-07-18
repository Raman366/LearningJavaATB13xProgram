package java_tasks.methodoverriding;

public class Task040_Animal_Sound {
    public static void main(String[] args) {

        Animal an = new Animal();
        an.sound();

        Dog d1 = new Dog();
        d1.sound();

        Cat c1 = new Cat();
        c1.sound();

        Cow c2 = new Cow();
        c2.sound();

    }
}

class  Animal{

    void sound(){
        System.out.println("Default Sound");
    }
}

class Dog extends Animal{

    @Override
    void sound(){
            System.out.println("Barks");
        }
}

class Cat extends Animal{

    @Override
    void sound(){
        System.out.println("Meoww");
    }
}

class Cow extends Animal{

    @Override
    void sound(){
        System.out.println("Mooo");
    }
}