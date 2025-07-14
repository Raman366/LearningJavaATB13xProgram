package java_tasks;

import java.util.Scanner;

public class Task018_Armstrong_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scan.nextInt();
        int original = num;
        int sum = 0;

        int digits = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        // Check if it's an Armstrong number
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }

    }
}
