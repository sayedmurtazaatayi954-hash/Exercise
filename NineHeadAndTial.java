
package nineheadandtial;

import java.util.Random;
import java.util.Scanner;

public class NineHeadAndTial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Initialize the 3x3 matrix with random values (0 or 1)
        Random random = new Random();
        char[][] board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = (char) ('0' + random.nextInt(2));
            }
        }

        // Print the matrix
        System.out.println("Randomly filled 3x3 matrix:");
        printMatrix(board);

        // Prompt the user to enter a number between 0 and 511
       
        int number = scanner.nextInt();

        // Convert the decimal number to binary string
        String binaryString = Integer.toBinaryString(number);

        // Pad the binary string with leading zeros to match the matrix size (3x3)
        while (binaryString.length() < 9) {
            binaryString = "0" + binaryString;
        }

        // Print the corresponding matrix with 'H' and 'T'
        System.out.println("Corresponding matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (binaryString.charAt(i * 3 + j) == '1') {
                    System.out.print('H');
                } else {
                    System.out.print('T');
                }
            }
            System.out.println();
        }

        scanner.close();
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
