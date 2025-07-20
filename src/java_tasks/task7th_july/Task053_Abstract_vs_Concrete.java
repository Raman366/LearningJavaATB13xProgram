package java_tasks.task7th_july;

public class Task053_Abstract_vs_Concrete {
    public static void main(String[] args) {
        Child ch = new Child();

        ch.display();
        ch.show();
    }
}

abstract class Parent{
    abstract void show();

    void display(){
        System.out.println("This is concrete method of Abstract class");
    }
}
class Child extends Parent{

    @Override
    void show() {
        System.out.println("show method implemented in child class: Abstract method implemented");
    }
}
