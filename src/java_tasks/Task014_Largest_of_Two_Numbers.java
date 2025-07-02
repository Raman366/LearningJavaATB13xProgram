package java_tasks;

import java.util.Scanner;

public class Task014_Largest_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number!");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd number!");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println(num1 + " is largest");
        }else {
            System.out.println(num2 + " is largest");
        }
    }
}
