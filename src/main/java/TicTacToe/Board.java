package TicTacToe;

public class Board {
    private char[][] board;

    public Board()
    {
        board = new char[3][3];
        initializeBoard();
    }

    private void initializeBoard()
    {
        // Loop through rows
        for (int i = 0; i < 3; i++) {
            // Loop through columns
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard()
    {
        System.out.println("Tic Tac Toe");
        System.out.println("-------------");

        for (int i = 0; i < 3; i++) {
            System.out.print("| ");

            for (int j = 0; j < 3;  j++) {
                System.out.print(board[i][j] + " | ");
            }

            System.out.println();
            System.out.println("-------------");
        }
    }

    public boolean placeMarker(int row, int col, char marker)
    {
        if (row >= 0 && row < 3) {
            if (col >=0 && col < 3) {
                if (board[row][col] == '-') {
                    board[row][col] = marker;
                    return true;
                }
            }
        }

        return false;
    }

    public boolean isBoardFull()
    {
        boolean isFull = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.board[i][j] == '-') {
                    isFull = false;
                }
            }
        }

        return isFull;
    }

    public boolean checkForWin()
    {
        if (checkRowsForWin() == true || checkColsForWin() == true || checkDiagonalsForWin() == true) {
            return true;
        }

        return false;
    }

    private boolean checkRowsForWin()
    {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
                return true;
            }
        }

        return false;
    }

    private boolean checkColsForWin()
    {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
                return true;
            }
        }

        return false;
    }

    private boolean checkDiagonalsForWin()
    {
        if ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true)) {
            return true;
        }

        return false;
    }

    private boolean checkRowCol(char c1, char c2, char c3)
    {
        if ((c1 != '-') && (c1 == c2) && (c2 == c3)) {
            return true;
        }

        return false;
    }
}
