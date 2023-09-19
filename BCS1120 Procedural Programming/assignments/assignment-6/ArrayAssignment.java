import java.util.ArrayList;
import java.util.stream.IntStream;

public class ArrayAssignment {

    public static void main(String[] args) {
        int[][] testArray = new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        //diagonalPrint(testArray);
        //System.out.println();

        int[] a = new int[]{0,2,0,2,0,2,2,1,1,0};
        //System.out.println(allNumsWithin(a, 3)); // Expect 4

        int[] b = new int[]{0,1,1,4,0,2,0,1,0,2};
        //System.out.println(allNumsWithin(b, 5)); // Expect 0

        int[] c = new int[]{1, 2, 2, 2, 2, 2, 2, 0};
        System.out.println(allNumsWithin(c, 3)); // Expect 8??? 2
        // 1, 2, 2, 2, 2, 2, 2, 0
    }

    public static int allNumsWithin2(int[] A, int k) {

        // Breaking conditions
        //  end of arry has been reached
        return 0;
    }

    public static int allNumsWithin(int[] A, int k) {

        int direction = 0; // 0 for descending, 1 for ascending
        ArrayList<ArrayList<Integer>> sequences = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> sequence = new ArrayList<Integer>();

        // Generate list of possible ordered sequences
        for (int i = 0; i < A.length; i++) {
            // If first loop
            if (i == 0) {
                // Initialize sequence
                sequence.add(A[i]);
                
                // Initialize direction
                direction = detectDirection(A, i);
            } else {

                // Process sequence elements

                // Check direction match and "consecutiveness"
                boolean directionValid = false;
                boolean sequenceValid = false;
                if (A[i] >= A[i-1] && direction == 1) {
                    // Direction is ascending, check sequence
                    directionValid = true;
                    if (A[i] == A[i-1] + 1 || A[i] == A[i-1]) {
                        // Sequence is correct
                        sequenceValid = true;
                        
                    }
                    
                } else if (A[i] <= A[i-1] && direction == 0){
                    directionValid = true;
                    // Direction is descending, check sequence
                    if (A[i] == A[i-1] - 1 || A[i] == A[i-1]) {
                        // Sequence is correct
                        sequenceValid = true;
                    }
                }

                if (sequenceValid && directionValid) {
                    sequence.add(A[i]);

                    // Add sequence to sequences array if the loop ended
                    if (i == A.length-1 && sequence.size() > 1) {
                        sequences.add(sequence);
                    }
                } else {

                    // Reset sequence (Direction change or skip in sequence)
                    
                    // Check if previous sequence is valid
                    if (sequence.size() > 1) {
                        // Check if sequence contains all numbers between 0 and k-1
                        int[] correctSequence = IntStream.range(0, k).toArray();

                        boolean orderedSequence = true;
                        for (int el : correctSequence) {
                            if (!sequence.contains(el)) {
                                orderedSequence = false;
                            }
                        }

                        if (orderedSequence) {
                            // Sequence is valid, store
                            sequences.add(sequence);
                        } 
                    }

                    // Reset variables
                    sequence.clear();
                    sequence.add(A[i]);

                    // Detect direction
                    direction = detectDirection(A, i);
                }

                
            }
        }

        // Trim sequences of repeats at both ends
        for (ArrayList<Integer> seq : sequences) {
            // Trim beginning
            int index = 0;
            while (seq.get(index) == seq.get(index+1)) {
                seq.remove(index);
            }

            // Trim ending
            index = seq.size()-1; //last item
            while (seq.get(index) == seq.get(index-1)) {
                seq.remove(index);
            }
        }
        
        
        
        int seqSize = 0;
        if (sequences.size() == 1) {
            seqSize = sequences.get(0).size();
            return seqSize;
        }

        // Select shortest sequence
        ArrayList<Integer> minSeq = new ArrayList<Integer>();
        for (int j = 0; j < sequences.size(); j++) {
            if (minSeq.size() == 0 || minSeq.size() > sequences.get(j).size()) {
                minSeq = sequences.get(j);
            }
        }

        return minSeq.size();
    }

    public static int detectDirection (int[] A, int index) {
        int direction = 0;
        for (int j = 0; j < A.length; j++) {
            if (A[j] > A[index]) {
                direction = 1;
                break;
            } else if (A[j] < A[index]) {
                direction = 0;
                break;
            }
        }
        return direction;
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