package ex_02_Java_Basics;

public class Lab021_printF {
    public static void main(String[] args) {
        int a = 10;
        System.out.print("It prints command without new line");
        System.out.println("Hey there!");
        System.out.println("It adds new line in the end");

        System.out.println(a);
        System.out.printf("The value of a is %d", a);

        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean
        int b = 20;
        System.out.println("---");
        System.out.printf("%d + %d", a,b);
    }
}
