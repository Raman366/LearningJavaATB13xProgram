package java_tasks;

public class Task024_Diagonal_Sum {
    public static void main(String[] args) {

                int[][] matrix = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };

                int n = matrix.length;
                int primarySum = 0;
                 int secondarySum = 0;

                for (int i = 0; i < n; i++) {
                    primarySum += matrix[i][i];               // Primary diagonal
                    secondarySum += matrix[i][n - 1 - i];     // Secondary diagonal
                }

                System.out.println("Primary Diagonal Sum: " + primarySum);
                System.out.println("Secondary Diagonal Sum: " + secondarySum);


    }
}
