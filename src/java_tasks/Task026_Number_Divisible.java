package java_tasks;

import java.util.Scanner;

public class Task026_Number_Divisible {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");

        if (scan.hasNextInt()) {
            int num = scan.nextInt();

            if (num % 5 == 0 && num % 11 == 0) {
                System.out.println(num + " is divisible by 5 & 11");
            } else {
                System.out.println(num + " is not divisible by 5 & 11");
            }
        } else {
            System.out.println("Please enter integer value only");
        }

    }
}
