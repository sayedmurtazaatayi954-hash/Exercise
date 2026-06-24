
package thesumofanarraycolumbycolum;

import java.util.Scanner;

public class TheSumOfAnArrayColumByColum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // Prompt the user to enter a 4-by-4 matrix row by row
        System.out.println("Enter a 4-by-4 matrix row by row:");
        double[][] matrix = new double[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Display the sum of all elements in the major diagonal
        double sumMajorDiagonal = sumMajorDiagonal(matrix);
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal);

        scanner.close();
    }

    // Method to return the sum of all the numbers in the major diagonal in a matrix
    public static double sumMajorDiagonal(double[][] m) {
        if (m == null || m.length == 0 || m[0].length == 0) {
            throw new IllegalArgumentException("Matrix must not be null or empty");
        }

       double sum = 0;

        for (int i = 0; i < Math.min(m.length, m[0].length); i++) {
            sum += m[i][i];
        }

        return sum;




    }
    
}
