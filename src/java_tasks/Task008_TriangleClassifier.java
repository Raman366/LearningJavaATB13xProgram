package java_tasks;
import java.util.Scanner;
public class Task008_TriangleClassifier {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the side 1");
            int side1 = scanner.nextInt();

            System.out.println("Enter the side 2");
            int side2 = scanner.nextInt();

            System.out.println("Enter the side 3");
            int side3 = scanner.nextInt();

            System.out.println(side1);
            System.out.println(side2);
            System.out.println(side3);

            if(side1 == side2 && side2 == side3){
                System.out.println("It's a Equilateral Triangle");
            }else if(side1 == side2 || side2 == side3 || side3 == side1){
                System.out.println("It's a Isosceles Triangle");
            }
            else {
                System.out.println("It's a Scalene Triangle");
            }
        }
    }

