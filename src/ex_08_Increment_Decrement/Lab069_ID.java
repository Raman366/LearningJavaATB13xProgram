package ex_08_Increment_Decrement;

public class Lab069_ID {
    public static void main(String[] args) {
        int a = 10;
        int result = a++;
        System.out.println(a);
        System.out.println(result);

        // Line No. |  a | Exp
        //  5 |  10 | NA
        //  6 |  11 | 10
        //  7 |  11 | NA
        //  8 | NA | 10
    }
}
