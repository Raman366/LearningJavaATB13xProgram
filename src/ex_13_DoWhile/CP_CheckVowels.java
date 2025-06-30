package ex_13_DoWhile;

import java.util.Scanner;

public class CP_CheckVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Alphabet ");
        char ch = scanner.next().toLowerCase().charAt(0);

        switch (ch){
            case 'a','e','i','o','u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;
        }
    }
}
