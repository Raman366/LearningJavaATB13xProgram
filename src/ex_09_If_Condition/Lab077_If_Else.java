package ex_09_If_Condition;

import java.util.Scanner;

public class Lab077_If_Else {
    public static void main(String[] args) {
        // Allowed to vote or not
        // If age > 18 -> allowed to vote.
        // else age < >18 -> Not allowed to vote.

        // int age = Integer.parseInt(args[0]);

        System.out.println("Enter the Age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age <= 18){
            System.out.println("Not allowed to Vote");
        }else {
            System.out.println("Allowed to Vote");
        }
    }
}
