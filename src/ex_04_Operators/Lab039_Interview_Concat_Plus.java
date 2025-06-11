package ex_04_Operators;

public class Lab039_Interview_Concat_Plus {
    public static void main(String[] args) {

        String first_name = "Raman";
        String last_name = "Kumar";

        int a = 10;
        int b = 20;

        System.out.println(first_name + last_name + a + b);
        System.out.println(a + b + first_name + last_name);

        System.out.println(first_name + last_name + (a + b));
        // BODMAS concept
    }
}
