package java_tasks.programSuper;

public class Task045_Variable_Super {
    public static void main(String[] args) {
        Son mySon = new Son();
        mySon.print();
    }
}

class Raman{
    int money = 200;
}
class Son extends Raman{
    int money = 100;

    void print(){
        System.out.println("Son has: " + money);
        System.out.println("Father has: " + super.money);
    }
}
