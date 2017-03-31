package connect4;

import java.util.Scanner;

public class Connect4 {

    public static void main(String[] args) {
        int winner, column, i, j;
        winner = 0;
        Scanner stdin = new Scanner(System.in);
        //NOTE for number representation of piece 
        //use two different numbers that wont have common sum 
        //1 and 10
        int userColumn;
        //R for red, B for blue 
        char R, B;
        //Creates the board 
        int[][] board = {
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1}
        };
        while (winner == 0) {
            for (i = 0; i <= 1; i++) {
                board = choice(i, board);
                print(board);
            }
        }
    }

    public static void print(int[][] board) {
        int i, j;
        for (i = 0; i <= 6; i++) {
            for (j = 0; j <= 6; j++) {
                System.out.print(board[i][6 - j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static int[][] choice(int playerID, int[][] board) {
        Scanner stdin = new Scanner(System.in);
        int playerChoice, columnNum, i, j;
        System.out.println("Which column to drop piece");
        playerChoice = stdin.nextInt();
        columnNum = playerChoice - 1;
        if (playerID == 0) {
            for (i = 0; i <= 6; i++) {
                if ((board[i][columnNum]) == 0) {
                    continue;
                }
                if ((board[i][columnNum]) != 0) {
                    board[6 - i][columnNum] = board[6 - i][columnNum] + 10;
                }
            }
        }
        if (playerID == 1) {
            for (j = 0; j <= 6; j++) {
                if ((board[j][columnNum]) == 0) {
                    continue;
                }
                if ((board[j][columnNum]) != 0) {
                    board[j][columnNum] = board[j][columnNum] + 100;
                }
            }
        }
        return board;
    }
    //maybe have another method to check for winner 

}
