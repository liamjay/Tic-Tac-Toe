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

    public boolean placeMarker(int row, int col)
    {
        if (row >= 0 && row < 3) {
            if (col >=0 && col < 3) {
                if (board[row][col] == '-') {
                    board[row][col] = 'x';
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


}
