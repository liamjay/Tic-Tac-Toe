import java.io.*;
import TicTacToe.Board;
import TicTacToe.Player;

public class Main {
    public static void main(String[] args)throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input     = new BufferedReader(reader);

        Board board   = new Board();
        Player player = new Player();

        System.out.println("Please enter your name");
        player.setName(input.readLine());

        System.out.println("Please choose the marker you want. (`x` or `o`)");
        player.setMarker(input.readLine());

        System.out.println();

        while (!board.isBoardFull()) {
            board.printBoard();
        }
    }
}
