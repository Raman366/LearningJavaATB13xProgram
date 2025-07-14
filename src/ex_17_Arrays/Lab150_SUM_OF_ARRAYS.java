package ex_17_Arrays;

public class Lab150_SUM_OF_ARRAYS {
    public static void main(String[] args) {
        int[] numbers = {32, 12, 24};
        int sum = 0; // 32 + 12 + 24 -> 68

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            
        }
        System.out.println(sum);
    }
}
