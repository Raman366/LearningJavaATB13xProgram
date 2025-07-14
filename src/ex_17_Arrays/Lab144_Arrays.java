package ex_17_Arrays;

public class Lab144_Arrays {
    public static void main(String[] args) {
        int[] marks = {2, 5, 55, 38, 98, 78};

        // 2nd way to create the Array

        int[] marks2 = new int[5]; // Fixed size 5, 0 to 4
        String[] name = new String[3]; // Fixed size 3, 0 to 2

        name[0] = "Raman";
        name[1] = "Ravi";
        name[2] = "Ranjan";

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
      //  System.out.println(name[]);
    }
}
