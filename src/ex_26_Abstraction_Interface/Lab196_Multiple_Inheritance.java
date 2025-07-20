package ex_26_Abstraction_Interface;

public class Lab196_Multiple_Inheritance {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.money();
    }
}

interface Father1{
    void money();
}
interface Father2{
    void money();
}

class Child implements Father1, Father2{

    @Override
    public void money() {
        System.out.println("This is child's own money");
    }
}
