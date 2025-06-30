package java_tasks;
import java.util.Scanner;

public class Task011_Leap_Year {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = scanner.nextInt();

        if(year%4==0){
            System.out.println("It's a Leap Year");
        }else{
            System.out.println("It's not a Leap Year");
        }
    }
}
