public class TicTacToe {
//UC6
    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        // Initialize board with '-'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // Place a sample move
        placeMove(0, 0, 'X');

        // Display result
        System.out.println(board[0][0]);
    }

    // Method to place symbol on board
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }
}