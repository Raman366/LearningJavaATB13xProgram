package java_tasks.programSuper;

public class Task044_Method_Super {
    public static void main(String[] args) {

        Child ch = new Child();
        ch.helloSon();
    }
}

class Parent{
    void helloSon(){
        System.out.println("How are you!");
    }
}
class Child extends Parent{
    @Override
    void helloSon(){
        super.helloSon();
        System.out.println("I'm good");

    }
}