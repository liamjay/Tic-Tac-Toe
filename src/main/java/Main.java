import java.util.Scanner;
import TicTacToe.Board;
import TicTacToe.Player;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Board board   = new Board();
        Player player = new Player();

        System.out.println("Please enter your name");
        player.setName(input.next());

        System.out.println("Please enter the marker want (`x` or `o`)");
        player.setMarker(input.next(".").charAt(0));

        while (!board.isBoardFull()) {
            System.out.println("Please enter what row you want the marker to be placed");
            int row = input.nextInt();

            System.out.println("Please enter what col you want the marker to be placed");
            int col = input.nextInt();

            board.placeMarker(row, col, player.getMarker());

            board.printBoard();

            continue;
        }

        System.out.println("Board is full. Play again?");
    }
}
