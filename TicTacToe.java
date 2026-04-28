public class TicTacToe {
//UC8
    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {

        // Loop until game ends
        while (!gameOver) {

            if (isHumanTurn) {
                System.out.println("Human's turn");
                // (In real game → call user input + place move)
            } else {
                System.out.println("Computer's turn");
                // (In real game → call computer move)
            }

            // Simulated condition (replace later with win/draw check)
            gameOver = checkGameOver();

            // Switch turn
            isHumanTurn = !isHumanTurn;
        }

        System.out.println("Game Over!");
    }

    // Dummy method (will be replaced in next UC)
    static boolean checkGameOver() {
        return false; // keeps loop running for now
    }
}