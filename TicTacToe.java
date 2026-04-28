public class TicTacToe {
//UC10
    static char[][] board = {
        {'X', 'O', 'X'},
        {'X', 'O', 'O'},
        {'O', 'X', 'X'}
    };

    public static void main(String[] args) {
        System.out.println(isDraw());
    }

    // Check if game is a draw
    static boolean isDraw() {

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {

                // If any empty cell exists → not a draw
                if (board[r][c] == '-') {
                    return false;
                }
            }
        }

        // No empty cells → draw
        return true;
    }
}