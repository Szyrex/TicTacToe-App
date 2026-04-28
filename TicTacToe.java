import java.util.Random;

public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {

        makeComputerMove();

        // Display board after move
        printBoard();
    }

    // UC7: Computer random move
    static void makeComputerMove() {
        Random rand = new Random();

        int slot;
        int row, col;

        // Keep trying until a valid move is found
        while (true) {
            slot = rand.nextInt(9) + 1; // 1–9

            row = getRowFromSlot(slot);
            col = getColFromSlot(slot);

            if (isValidMove(row, col)) {
                placeMove(row, col, 'O'); // computer symbol
                System.out.println("Computer chose slot: " + slot);
                break;
            }
        }
    }

    // Convert slot → row
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    // Convert slot → column
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }

    // Check valid move
    static boolean isValidMove(int row, int col) {
        return (row >= 0 && row < 3 &&
                col >= 0 && col < 3 &&
                board[row][col] == '-');
    }

    // Place move
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Print board
    static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}