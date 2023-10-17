import java.util.Arrays;
import java.util.ArrayList;

public class DiagonalPrint {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        diagonalPrint(matrix);
    }

    public static void diagonalPrint(int[][] matrix) {
        if (matrix.length == 0)
            return;

        int nodesCount = matrix.length + matrix[0].length - 1;
        int[][] nodes = new int[nodesCount][];

        // Loop over amount of nodes
        int indexX = 0;
        int indexY = 0;

        // Get starting nodes
        for (int i = 0; i < (nodesCount); i++) {
            nodes[i] = new int[] { matrix[indexX][indexY], indexX, indexY };

            if (i >= matrix.length - 1) {
                indexY++;
            } else {
                indexX++;
            }
        }

        // Loop over starting points
        for (int[] node : nodes) {
            // Print node
            System.out.printf("%d ", node[0]);

            // Loop to find all upper-right nodes starting from a starter node
            boolean loop = true;
            int indX = node[1] - 1;
            int indY = node[2] + 1;

            while (loop) { //
                if (indX < 0 || indY > matrix.length) {
                    loop = false;
                } else {
                    // print found node
                    System.out.printf("%d ", matrix[indX][indY]);

                    // increment indexes
                    indX--;
                    indY++;
                }
            }
        }

    }
}
