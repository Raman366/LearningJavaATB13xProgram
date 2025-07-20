package java_tasks.task7th_july;

public class Task052_Abstract_Constructor {
    public static void main(String[] args) {

        Rose r1 = new Rose();
        r1.flowerType();
    }
}

abstract class Flower{
    Flower(){
        System.out.println("Abstract class constructor");
    }
    void flowerType(){
        System.out.println("This method from abstract class");
    }
}

class Rose extends Flower{
//    void flowerType(){
//
//    }
}