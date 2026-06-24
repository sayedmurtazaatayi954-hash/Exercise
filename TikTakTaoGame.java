
package tiktaktaogame;

import java.util.Scanner;

public class TikTakTaoGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           char[][] board = new char[3][3];
       
        boolean gameOver = false;

        while (!gameOver) {
            printBoard(board);

            if (hasWinner(board,'X')) {
                System.out.println("X wins!");
                gameOver = true;
            } else if (hasWinner(board, 'O')) {
                System.out.println("O wins!");
                gameOver = true;
            } else if (isBoardFull(board)) {
                System.out.println("It's a draw!");
                gameOver = true;
            }

            int row;
            int col;
            do {
                System.out.print('X' + " player, enter a row (0, 1, or 2): ");
                row = scanner.nextInt();
                System.out.print('O' + " player, enter a column (0, 1, or 2): ");
                col = scanner.nextInt();

                if (board[row][col] == 0) {
                    board[row][col] = 'X';
                    break;
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            } while (true);

            if (hasWinner(board, 'O')) {
                System.out.println("O wins!");
                gameOver = true;
            } else if (isBoardFull(board)) {
                System.out.println("It's a draw!");
                gameOver = true;
            }

            row = -1;
            col = -1;

            do {
                System.out.print('O' + " player, enter a row (0, 1, or 2): ");
                row = scanner.nextInt();
                System.out.print('X' + " player, enter a column (0, 1, or 2): ");
                col = scanner.nextInt();

                if (board[row][col] == 0) {
                    board[row][col] = 'O';
                    break;
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            } while (true);
        }

        scanner.close();
    }

    private static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean hasWinner(char[][] board, char player) {
        // Check rows
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < board[0].length; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }

        // Check diagonals
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player)
            || (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }

        return false;
    }

    private static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }

        return true;



    }
    
}
