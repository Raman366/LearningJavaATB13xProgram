package ex_17_Arrays;

import java.util.Scanner;

public class Lab158_Right_Triangle {
    public static void main(String[] args) {
        // How the pattern we want
        //  n = 3
        // *
        // **
        // ***

        System.out.println("Enter the n");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
