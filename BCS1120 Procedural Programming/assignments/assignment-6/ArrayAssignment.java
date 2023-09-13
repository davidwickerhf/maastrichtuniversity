import java.util.Arrays;

public class ArrayAssignment {

    public static void main(String[] args) {
        int[][] testArray = new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        diagonalPrint(testArray);
    }

    public static int allNumsWithin(int[] A, int k) {
        return 0;
    }

    public static void diagonalPrint(int[][] M) {
        // Load starting points
        int[][] startingPoints = new int[M.length + M[0].length-1][3];
        // Vertical starting points
        for (int i = 0; i < M.length-1; i++) {
            startingPoints[i] = new int[]{i, 0, M[i][0]};
        }

        // Horizontal starting points
        for (int col = 0; col < M[0].length; col++) {
            startingPoints[M.length-1+col] = new int[]{M.length-1, col, M[M.length-1][col]};
        }

        for (int[] point : startingPoints) {
            // Print point
            System.out.printf("%d ", point[2]);

            // Neighbours loop
            int rowIndex = point[0];
            int colIndex = point[1];
            while (true) {
                if (rowIndex-1 < 0 || colIndex+1 > M[0].length-1) {
                    break;
                }
                rowIndex--;
                colIndex++;
                System.out.printf("%d ", M[rowIndex][colIndex]);
            }
        }
    }
}