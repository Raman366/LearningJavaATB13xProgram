package java_tasks;

import java.util.Scanner;

public class Task027_Convert_Days {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of days: ");

        if (scan.hasNextInt()) {
            int totalDays = scan.nextInt();

            if (totalDays < 0) {
                System.out.println("Please enter only positive number.");
            } else {
                int years = totalDays / 365;
                int remDays = totalDays % 365;

                int months = remDays / 30;
                int days = remDays % 30;

                System.out.println("Years: " + years);
                System.out.println("Months: " + months);
                System.out.println("Days: " + days);
            }
        } else{
            System.out.println("Error!!! Please enter a valid integer number.");
        }
    }
}