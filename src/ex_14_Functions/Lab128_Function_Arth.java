package ex_14_Functions;
import java.util.Scanner;

/**
 * This class provides basic arithmetic operations.
 */
public class Lab128_Function_Arth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = 0;
        if (scanner.hasNextInt()){
            a = scanner.nextInt();
        }else {
            System.out.println("Please enter int vale olny");
        //    return;
            System.exit(0);
        }


        System.out.println("Enter 2nd number");
        int b = 0;
        if (scanner.hasNextInt()){
            b = scanner.nextInt();
        }else {
            System.out.println("Please enter int vale olny");
        //    return;
            System.exit(0);
        }

        int result_sum = sum(a, b);
        System.out.println(result_sum);

        int result_sub = sub(a, b);
        int result_mul = mul(a, b);
        int result_div = div(a, b);
        int result_mod = mod(a, b);

        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
        System.out.println(result_mod);

    }
    /**
     * Adds two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    static int sum(int a, int b){
        return a + b;
    }
    /**
     * Subtracts the second integer from the first.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the difference of a and b
     */
    static int sub(int a, int b) {
        return a - b;
    }

    /**
     * Divides the first integer by the second.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the quotient of a and b
     */
    static int div(int a, int b) {
        if (b == 0) {
//            System.out.println("b can't be zero");
            throw new ArithmeticException("b can't be zero");
//            System.exit(0);
        }
        return a / b;
    }

    /**
     * Multiplies two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the product of a and b
     */
    static int mul(int a, int b) {
        return a * b;
    }

    // Mod
    static int mod(int a, int b) {
        return a % b;
    }
}
