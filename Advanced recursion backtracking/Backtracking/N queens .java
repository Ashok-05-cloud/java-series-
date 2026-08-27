public class NQueens {

    static int n = 4;

    static boolean isSafe(
            char[][] board,
            int row,
            int col) {

        // Check same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n;
             i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    static boolean solve(
            char[][] board,
            int row) {

        // All queens placed
        if (row == n) {
            printBoard(board);
            return true;
        }

        for (int col = 0; col < n; col++) {

            if (isSafe(board, row, col)) {

                // Choose
                board[row][col] = 'Q';

                // Explore
                boolean solved =
                    solve(board, row + 1);

                // Undo
                board[row][col] = '.';

                if (solved) {
                    return true;
                }
            }
        }

        return false;
    }

    static void printBoard(char[][] board) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        char[][] board = new char[n][n];

        // Fill board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        if (!solve(board, 0)) {
            System.out.println("No solution exists");
        }
    }
}