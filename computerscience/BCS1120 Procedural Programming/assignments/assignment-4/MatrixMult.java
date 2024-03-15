
public class MatrixMult {

    // To perform matrix multiplication, the first matrix must have the same number
    // of columns as the second matrix has rows. The number of rows of the resulting
    // matrix equals the number of rows of the first matrix, and the number of
    // columns of the resulting matrix equals the number of columns of the second
    // matrix.

    // Same number of columns as the second matrix has rows
    // Resulting number of rows == rows of first matrix
    // Number of columns == number of columns fo the second matrix

    public static void main(String[] args) {

        double a[][]={{1,2,3}, {4,5,6}};    
        double b[][]={{7,8}, {9, 10}, {11, 12}};  
        
        printMatrix(a);
        printMatrix(b);
        printMatrix(multiplyMatrices(a, b));
    }

    public static double[][] multiplyMatrices(double[][] firstMatrix, double[][] secondMatrix) {
        // Check matrix legality row[]col[]
        if (firstMatrix[0].length == secondMatrix.length) {
            // Multiplication is possible
            double[][] product = new double[firstMatrix.length][secondMatrix[0].length];

            // foreach row
            for (int row = 0; row < firstMatrix.length; row++) {
                // foreach column in second matrix
                for (int col = 0; col < secondMatrix[0].length; col++) {
                    
                    double sum = 0;
                    // Foreach element in the first matrix row
                    for (int el = 0; el < firstMatrix[0].length; el++) {
                        sum += firstMatrix[row][el] * secondMatrix[el][col];
                    }

                    // Add sum to product matrix
                    product[row][col] = sum;
                }

                
            }

            return product;
        }
        {
            // Multiplication is not possible
            System.out.println("Invalid matrix multiplication");
            return null;
        }
    }

    public static void printMatrix(double[][] matrix) {
        // Loop rows
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            // Loop cols
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%f ", matrix[i][j]);
            }
            System.out.print("\n");
        }
    }
}
