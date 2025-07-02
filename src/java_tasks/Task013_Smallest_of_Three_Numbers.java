package java_tasks;

import java.util.Scanner;

public class Task013_Smallest_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number!");
        int num1 = scanner.nextInt();

        System.out.println("Enter 2nd number!");
        int num2 = scanner.nextInt();

        System.out.println("Enter 3rd number!");
        int num3 = scanner.nextInt();

        if (num1 < num2 && num1 < num3){
            System.out.println(num1 + " is smallest");
        } else if (num2 < num3 && num2 < num1) {
            System.out.println(num2 + " is smallest");

        }else {
            System.out.println(num3 + " is smallest");
        }
    }
}
