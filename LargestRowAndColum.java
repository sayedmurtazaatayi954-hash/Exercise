yyyyyy
package largestrowandcolum;

import java.util.Random;

public class LargestRowAndColum {

    public static void main(String[] args) {
        //Initialize the 4x4 matrix with random values (0 or 1)
        Random random = new Random();
        char[][] board = new char[4][4];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = (char) ('0' + random.nextInt(2));
            }
        }

        // Print the matrix
        System.out.println("Randomly filled 4x4 matrix:");
        printMatrix(board);

        // Find the first row with the most 1s
        int largestRow = -1;
        int largestCol = -1;
        int maxOnesInRow = 0;

        for (int i = 0; i < board.length; i++) {
           int onesCount = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '1') {
                    onesCount++;
                }
            }

            if (onesCount > maxOnesInRow) {
                maxOnesInRow = onesCount;
                largestRow = i;
            }
        }

        // Find the first column with the most 1s
        for (int j = 0; j < board[0].length; j++) {
            int onesCount = 0;
            for (int i = 0; i < board.length; i++) {
                if (board[i][j] == '1') {
                    onesCount++;
                }
            }

            if (onesCount > maxOnesInRow) {
                maxOnesInRow = onesCount;
                largestCol = j;
            }
        }

        // Print the largest row and column indices
        System.out.println("Largest row index: " + largestRow);
        System.out.println("Largest column index: " + largestCol);
    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }



    }
    
}
