package java_tasks.methodoverloading;

public class Task038_Greet_User {
    public static void main(String[] args) {

        Greeter g1 = new Greeter();
        g1.greet();
        g1.greet("Raman");
    }
}

class Greeter{

    void greet(){
        System.out.println("Hello");
    }

    void greet(String name){
        System.out.println("Hello " + name);
    }
}
