package java_tasks;

import java.util.Scanner;

public class Task022_Travel_Status_Check {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter visa status(Valid/Invalid): ");
        String visaStatus = scan.nextLine();

        if (age >= 18 && visaStatus.equalsIgnoreCase("valid")){
            System.out.println("Great: You can travel");
        }else {
            System.out.println("Sorry!!: You cannot travel");
        }
    }
}
