package java_tasks;

import java.util.Scanner;

public class Task016_Character_is_Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'){
            System.out.println(ch + " is a Alphabet");
        }else {
            System.out.println("Invalid input, Please enter a character");
        }
    }
}
