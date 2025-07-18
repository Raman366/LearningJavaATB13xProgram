package ex_21_OOPs_Polymorphism.methodoverriding;

public class Lab184_MOverriding {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.sound();
    }
}

class Animal{

    void sound(){
        System.out.println("Default Sound");
    }
}

class Dog extends Animal{

    @Override
    void sound(){
        System.out.println("Barks!!");
    }

    void methodOverLoad(){

    }

    void methodOverLoad(int a){

    }
}
