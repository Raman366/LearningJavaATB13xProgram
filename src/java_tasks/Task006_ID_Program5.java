package java_tasks;

public class Task006_ID_Program5 {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ + ++a;
        System.out.println("a:" + a); // 7
        System.out.println("b:" + b); // 12

        // Summary:
        //  Expression	Value Used	Value of a After
        //    a++	         5	           6
        //    ++a	         7	           7
    }
}
