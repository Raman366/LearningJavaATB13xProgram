package ex_18_OPPs;

public class Lab163_Cats {
    Lab163_Cats(){
        System.out.println("DC - Main Class");
    }
    public static void main(String[] args) {

        Cat c1 = new Cat();
        new Cat();
        Cat c2;

        c1.running();
    //    c2.running(); Object is not created
        new Cat().running();
    }
}

class Cat{
    String name; // null

    void running(){
        System.out.println("Running");
    }
}