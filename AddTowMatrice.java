
package addtowmatrice;

public class AddTowMatrice {

  public static void main(String[] args) {
      // Example matrices
        double[][] matrixA = {{1, 2},
                                         {3, 4}};
        
        double[][] matrixB = {{5, 6}, 
                                         {7, 8}};

        // Add the matrices
        double[][] resultMatrix = addMatrices(matrixA, matrixB);

        // Display the result
        System.out.println("The matrices are added as follows:");
        for (double[] row : resultMatrix) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    /**
     * Adds two matrices.
    *
     * @param a The first matrix.
     * @param b The second matrix.
     * @return A new matrix containing the result of the addition.
     */
    public static double[][] addMatrices(double[][] a, double[][] b) {
        int rows = a.length;
        int cols = a[0].length;

        // Create a new matrix to store the result
        double[][] result = new double[rows][cols];

        // Add corresponding elements from matrix1 and matrix2
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

       return result;


    }
    
}
