package java_tasks;
import java.util.Scanner;
public class Task028_Guess_Website_Domain {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter a website URL: ");
            String url = scan.nextLine().toLowerCase(); // Convert to lowercase for consistency

            if (url.contains(".com")) {
                System.out.println("This is commercial type website");

            } else if (url.contains(".org")) {
                System.out.println("This is Non-profit organization type of website");

            } else if (url.contains(".edu")) {
                System.out.println("This is Educational institution website");

            } else if (url.contains(".gov")) {
                System.out.println("This is the Government website");

            } else if (url.contains(".net")) {
                System.out.println("This is Network-related website");

            } else if (url.contains(".info")) {
                System.out.println("This is Informational website");
            } else {
                System.out.println("The website type is Unknown or other types of websites");
            }
        }
    }


