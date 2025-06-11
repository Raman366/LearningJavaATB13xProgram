package ex_04_Operators;

public class Lab034_Unary_Operator {
    public static void main(String[] args) {
        // Unary Operator

        int a = +20;
 //       int a = +20 or 20, + sign is option when the value is positive
        int a1 = -110;
        int result = a + a1;
        System.out.println(a);
        System.out.println(a1);
        System.out.println(result);

        int b = -1;
        b = b+1;
        System.out.println(b);
    }
}
