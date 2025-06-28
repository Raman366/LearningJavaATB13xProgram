package ex_08_Increment_Decrement;

public class Lab066_ID_Op {
    public static void main(String[] args) {

        int a = 10;
        int b = ++a; // pre-increment -> value of 'a' is first increased then assigned to 'b'
           // 10+1 is assigned

        System.out.println(a);
        System.out.println(b);

        // Expression and Result Table
        // Line no | a | result b
        //   6    |10 | NA
        //   7   | 11 | 11
        //  10   | 11(NA) | 11
        //  11   | 11 | 11(NA)
    }
}
