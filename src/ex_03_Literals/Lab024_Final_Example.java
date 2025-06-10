package ex_03_Literals;

public class Lab024_Final_Example {
    public static void main(String[] args) {
        int local = 0;
        System.out.println(local);

        final float PI = 3.14f;
   //     PI = 4.32f; This is final in nature so cannot be changed
        System.out.println(PI);
    }
}
