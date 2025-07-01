package ex_14_Functions;

public class Lab126_UD_Part1 {
    // User Defined Functions.

    // 1.Without Parameters and Without Return Type
    // 2.Without Parameters but With Return Type
    // 3.With Parameters and Without Return Type
    // 4. With Parameters and With Return Type

    public static void main(String[] args) {
        // 1.Without Argument / Parameters and Without Return Type.
        wp_wr_greet();

//  2. Without Parameters but With Return Type
        String msg = greet_with_hello_wp_with_RT();
        System.out.println(msg);

//  3. With Parameters and Without Return Type ( 90%)
        greet_with_details("Raman", 28, 10000);
        greet_with_details("Heman", 25, 1000);

        //  4. With Parameters and With Return Type
        int sum = sum_of_two_numbers(65, 55);
        int sum2 = sum_of_two_numbers(650, 551);
        int sum3 = sum_of_three_numbers(65, 55, 78);
        int sum4 = sum_of_three_numbers(88, 550, 781);

        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
    }

    // 1. Without Parameters and Without Return Type. (Declare) /Define
    static void wp_wr_greet(){
        System.out.println(" -- Type 1 : Without Parameters Without Return Type -- ");
        System.out.println("Hi, How are you?");
    }

    //  2. Without Parameters but With Return Type
    static String greet_with_hello_wp_with_RT(){
        System.out.println(" -- Type 2 : Without Parameters but With Return Type -- ");
        System.out.println("wp_with_RT");
        return "Hey there!!";
    }

    //  3. With Parameters and Without Return Type ( 90%)
    static void greet_with_details(String name, int age, double salary){
        System.out.println("Your name is " + name + "\nYour age is " + age + "\nYour salary is " + salary);
    }

   // 4. With Parameters and With Return Type
    static int sum_of_two_numbers(int a, int b){
        return a + b;
    }
    static int sum_of_three_numbers(int a, int b, int c){
        return a + b + c;
    }
}
