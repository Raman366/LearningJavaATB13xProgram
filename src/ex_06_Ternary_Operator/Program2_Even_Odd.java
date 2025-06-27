package ex_06_Ternary_Operator;

public class Program2_Even_Odd {
    public static void main(String[] args) {
        int A = 19;
        String result = (A%2 == 0) ? "Even" : "Odd";
        System.out.println(result);

        A = 20;
        result = (A%2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
