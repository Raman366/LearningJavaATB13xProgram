package java_tasks;

import java.util.Scanner;

public class Task019_Loan_Eligibility {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = scan.nextInt();

        System.out.println("Enter the Salary");
        double salary = scan.nextDouble();

        System.out.println("Enter the credit score");
        int credit_score = scan.nextInt();
//        int age = 20;
//        double salary = 55000.0;
//        int credit_score = 750;

        boolean isEligible = true;

        if (age <= 0 || age < 18 || age > 80){
            System.out.println("Invalid age: Age must be between 18 and 80");
            isEligible = false;
        }
        if (salary <= 0 || salary < 30000){
            System.out.println("Invalid salary: Salary must be at least 30,000 ");
            isEligible = false;
        }
        if (credit_score <= 0 || credit_score < 650 || credit_score > 850){
            System.out.println("Invalid credit: Credit score must be between 650 and 850");
            isEligible = false;
        }
        if (isEligible){
            System.out.println("Great: You are eligible for the Loan");
        }else {
            System.out.println("Sorry!! You are not eligible");
        }

    }
}
