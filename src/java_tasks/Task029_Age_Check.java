package java_tasks;

import java.util.Scanner;

public class Task029_Age_Check {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the age: ");

        if (scan.hasNextInt()){
            int age = scan.nextInt();

            if (age < 0) {
                System.out.println("Please enter only positive number");
            } else if (age > 0 && age <= 12){
                System.out.println("Child");

            } else if (age > 12 && age<= 19) {
                System.out.println("Teenager");

            } else if (age > 19 && age <= 64) {
                System.out.println("Adult");
                
            }else {
                System.out.println("Senior Citizen");
            }
        }else {
            System.out.println("Error! Please enter a valid integer number");
        }

    }
}
