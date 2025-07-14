package ex_17_Arrays;

import java.util.Arrays;

public class Lab151_2nd_Largest_Number {
    public static void main(String[] args) {

        // Find Second Largest Number in an Array

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        // 100 , 34
//        Arrays.sort(numbers);
//        System.out.println(numbers[numbers.length-2]);

        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("Second largest number in the Array is: " + secondLargest);
    }
}
