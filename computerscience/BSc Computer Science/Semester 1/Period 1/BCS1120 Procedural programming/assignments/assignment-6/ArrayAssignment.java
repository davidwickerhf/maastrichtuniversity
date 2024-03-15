import java.util.ArrayList;
import java.util.stream.IntStream;

public class ArrayAssignment {

    public static void main(String[] args) {
        int[][] testArray = new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        diagonalPrint(testArray);

        int[] a = new int[]{0,2,0,2,0,2,2,1,1,0};
        System.out.println(allNumsWithin(a, 3));
         // Expect 4

        int[] b = new int[]{0,1,1,4,0,2,0,1,0,2};
        System.out.println(allNumsWithin(b, 5)); // Expect 0

        int[] c = new int[]{1, 2, 2, 2, 2, 2, 2, 0};
        System.out.println(allNumsWithin(c, 3)); // Expect 8??? 2
        // 1, 2, 2, 2, 2, 2, 2, 0
    }

    public static int allNumsWithin(int[] A, int k) {
        // Generate list of elements to find in a sequence
        int[] toFind = IntStream.range(0, k).toArray();
        ArrayList<Integer> toFindList = new ArrayList<Integer> ();
        for (int i = 0; i < toFind.length; i++) {
            toFindList.add(toFind[i]);
        }

        // Store sequences array
        ArrayList<ArrayList<Integer>> sequences = new ArrayList<ArrayList<Integer>>();


        // For every element in the array
        for (int i = 0; i < A.length-1; i++) {
            ArrayList<Integer> found = new ArrayList<Integer>();
            int lastIndex = i;

            for (int j = i; j < A.length; j++) {
                // check if element needs to be added
                found.add(A[j]);
                

                // check if all elements have been found
                boolean foundAll = true;
                for (Integer integer : toFindList) {
                    if (!found.contains(integer)) {
                        foundAll = false;
                    }
                }

                if (foundAll) {
                    // Sequence has been found
                    lastIndex = j+1;
                    break;
                } 
                // Else: continue finding items
            }

            // Add sequence to sequence array
            ArrayList<Integer> sequence = new ArrayList<Integer>();
            for (int l = i; l < lastIndex; l++) {
                sequence.add(A[l]);
            }
            if (sequence.size() > 2) {
                sequences.add(sequence);
            }
        }

        // Select sortest sequence
        ArrayList<Integer> shortest = new ArrayList<Integer>();
        for (ArrayList<Integer> seq : sequences) {
            if (shortest.size() == 0 || shortest.size() > seq.size()) {
                shortest = seq;
            }
        }

        return shortest.size();
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