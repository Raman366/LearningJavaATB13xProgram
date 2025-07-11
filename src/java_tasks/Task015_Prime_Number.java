package java_tasks;

import java.util.Scanner;

public class Task015_Prime_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number!");

        int num = scan.nextInt();
        boolean prime = true;

        if (num <= 1)
            prime = false;



            if (num % 2 == 0){
                System.out.println(num + " is not a prime number");
            }else {
                System.out.println(num + " is a prime number");
            }
        }

    }

