package ex_06_Ternary_Operator;

public class Lab060_TO {
    public static void main(String[] args) {
        // The maximum number between two numbers using ternary operator
        int a = 10;
        int b = 20;
//        System.out.println(Math.max(a,b));

        int max = a > b ? a : b;
        System.out.println(max);
    }
}
