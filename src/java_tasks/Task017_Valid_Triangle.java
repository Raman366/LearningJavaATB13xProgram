package java_tasks;

import java.util.Scanner;

public class Task017_Valid_Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter side1 of the triangle");
        int side1 = scan.nextInt();

        System.out.println("Enter side2 of the triangle");
        int side2 = scan.nextInt();

        System.out.println("Enter side3 of the triangle");
        int side3 = scan.nextInt();

        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2){
            System.out.println("It's a valid triangle");
        }else {
            System.out.println("Invalid Triangle");
        }
    }
}
