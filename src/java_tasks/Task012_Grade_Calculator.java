package java_tasks;
import java.util.Scanner;

public class Task012_Grade_Calculator {
    public static void main(String[] args) {
        /*
        Write a program that calculates and displays the letter grade for a given numerical score
        (e.g., A, B, C, D, or F) based on the following grading scale:
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: 0-59
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks:");

        if(!scanner.hasNextInt()){
            System.out.println("Please enter int value!");
            return;
        }

        int marks = scanner.nextInt();
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks, please enter value 0 to 100");

        }else if(marks >= 90 && marks <= 100){
            System.out.println("Marks = " + marks + " Grade = A");
        }else if(marks >= 80 && marks <= 89){
            System.out.println("Marks = " + marks + " Grade = B");
        }else if(marks >= 70 && marks <= 79){
            System.out.println("Marks = " + marks + " Grade = C");
        }else if(marks >= 40 && marks <= 69){
            System.out.println("Marks = " + marks + " Grade = D");
        }else{
            System.out.println("Marks = " + marks + ", Status = Fail");
        }
    }
}
