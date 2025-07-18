package ex_20_Inheritance.single_inheritance;

public class Lab176_Real_Si {
    public static void main(String[] args) {

        TestCase1 t1 = new TestCase1();
        t1.running();

        TestCase2 t2 = new TestCase2();
        t2.runningTC2();

        CommonToAll c1 = new CommonToAll();
        TestCase1 t3 = new TestCase1();
        CommonToAll c2 = new TestCase1(); // Dynamic Dispatch (extends)
//        TestCase1 t4 = new CommonToAll();

        // Webdriver driver = new ChromeDriver();
    }
}
