package ex_17_Arrays;

import java.util.Arrays;

public class Lab146_Arrays_Print {
    public static void main(String[] args) {
        int[] marks = {55, 87, 100,76, 65, 83};
        System.out.println("---------");

        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);

        }
        //        System.out.println(marks); // Ref Address

        Arrays.sort(marks);

        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);

        }
    }
}
