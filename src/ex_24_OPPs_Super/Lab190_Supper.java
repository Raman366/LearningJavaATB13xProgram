package ex_24_OPPs_Super;

import ex_12_While.Lab117_While_Guessing_Game;

public class Lab190_Supper {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.sound();
    }
}

class GOD{
    public int gold = 100;
    void sound(){
        System.out.println("God Voice");
    }
    GOD(){
        System.out.println("God DC");
    }
}
class Animal extends GOD{

    @Override
    void sound(){
        super.sound();
    }
    Animal(){
        super();
    }
    Animal(int a, int b){
        System.out.println(a+b);
    }
    void test(){
        System.out.println(super.gold);
    }
}
