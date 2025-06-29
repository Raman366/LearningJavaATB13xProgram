package ex_10_Switch;

import java.util.Scanner;

public class Lab079_Switch {
    public static void main(String[] args) {
        //
        // Take a user input and tell them the day which they have told.
        // 1 to 7 -> 1 -> mon, 5 -> fri
        // 8 ? - Not allowed or error

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Day 1 to 7");
        int day = scanner.nextInt();

        switch (day){

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not allowed");
                break;
        }
    }
}
