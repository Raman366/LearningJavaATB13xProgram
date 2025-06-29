package java_tasks;
import java.util.Scanner;
public class Task009_Vowels_Consonants_Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.println("Enter a name");

        String input = scanner.nextLine();
        input = input.toLowerCase();

        int vowels = 0;
        int consonants =0;

        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        System.out.println("No. of Vowels: " + vowels);
        System.out.println("No. of Consonants: " + consonants);


    }
}