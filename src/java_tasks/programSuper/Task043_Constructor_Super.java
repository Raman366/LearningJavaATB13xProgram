package java_tasks.programSuper;

public class Task043_Constructor_Super {
    public static void main(String[] args) {
        Crow cr = new Crow();
    }
}

class Birds{
    Birds(){
        System.out.println("Parent Bird");
    }
}
class Crow extends Birds{
    Crow(){
        super();
        System.out.println("This is a Crow");
    }
}