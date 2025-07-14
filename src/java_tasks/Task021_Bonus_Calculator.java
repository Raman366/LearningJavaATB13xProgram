package java_tasks;

import java.util.Scanner;

public class Task021_Bonus_Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary");
        double salary = scan.nextDouble();

        System.out.println("Enter years of experience you have?");
        int years = scan.nextInt();

        double bonus = 0;

        if (years < 1){
            System.out.println("No Bonus");
            return;
        } else if (years >= 1 && years <= 3) {
            bonus = salary * 0.05;
        } else if (years >= 4 && years <= 6) {
            bonus = salary * 0.10;
            
        } else{
            bonus = salary * 0.15;
            
        }
        System.out.println("Bonus amount = " + bonus);
    }
}
