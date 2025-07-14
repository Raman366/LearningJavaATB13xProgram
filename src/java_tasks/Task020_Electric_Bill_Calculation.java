package java_tasks;

import java.util.Scanner;

public class Task020_Electric_Bill_Calculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of units you have consumed: ");
        int units = scan.nextInt();

        double bill = 0;

        if (units <= 100) {
            bill = units * 0.50;
        } else if (units > 100 && units <= 200) {
            bill = (100 * 0.50) + (units - 100) * 0.75;
        } else if (units > 200 && units <= 300) {
            bill = (100 * 0.50) + (100 * 0.75) + (units - 200) * 1.20;
        } else {
            bill = (100 * 0.50) + (100 * 0.75) + (100 * 1.20) + (units - 300) * 1.50;
        }
        System.out.println("Total amount = " + bill);
    }
}
