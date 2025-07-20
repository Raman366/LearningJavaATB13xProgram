package ex_26_Abstraction_Interface;

public class Lab194_Interface {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(10,20);

        Square s1 = new Square();
        s1.getArea(5,4);
    }
}

class Rectangle implements Polygon {


    @Override
    public void getArea(int length, int breadth) {
        System.out.println("The area of a rectangle is " + (length * breadth));
    }
}
class Square implements Polygon{

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("Area of a Square is: " + 3.14 * length * breadth);
    }
}

interface Polygon{
    void getArea(int length, int breadth);

    //    void complete(){
//
//    }
    default void complete() {
        System.out.println("This is possible !");
    }
    default void complete2() {
        System.out.println("This is possible2 !");
    }
    static void staticComplete() {
        System.out.println("Static F1 in interface allowed, complete");
    }
}
abstract class A {
    abstract void m1();

    void complete() {
        System.out.println("complete!");
    }
}