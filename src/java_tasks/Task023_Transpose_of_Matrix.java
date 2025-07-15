package java_tasks;

public class Task023_Transpose_of_Matrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] transpose = new int[3][2];

        // Transpose logic
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                transpose[j][i] = matrix[i][j];

        // Print original matrix
        System.out.println("Original Matrix");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        // Print transpose matrix
        System.out.println("Transpose Matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(transpose[i][j] + " ");
            System.out.println();
        }
    }

}

