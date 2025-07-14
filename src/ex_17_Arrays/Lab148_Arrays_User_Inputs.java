package ex_17_Arrays;

import java.util.Scanner;

public class Lab148_Arrays_User_Inputs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array(int only):");
        int size = scan.nextInt();

        int[] numbers_marks = new int[size];

        //        float[] numbers_marks =  new float[size];
        // String[] numbers_marks =  new String[size];

        for (int i = 0; i < numbers_marks.length; i++) {
            System.out.println("Enter the numbers");
            numbers_marks[i] = scan.nextInt();
            
        }
        System.out.println("Marks are printed below");

        for (int i = 0; i < numbers_marks.length; i++) {
            System.out.println(numbers_marks[i]);

        }
    }
}
