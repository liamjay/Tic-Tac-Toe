package TicTacToe;

import org.junit.Test;
import static org.junit.Assert.*;

public class BoardTest {
    @Test
    public void testIsBoardFullReturnsFalse()
    {
        Board board    = new Board();
        Boolean actual = board.isBoardFull();

        assertFalse(actual);
    }

    @Test
    public void testIsBoardFullReturnsTrue()
    {
        Board board = new Board();
        this.setMarkers(board);

        Boolean actual = board.isBoardFull();

        assertTrue(actual);
    }

    @Test
    public void testPlaceMarkerReturnsFalse()
    {
        Board board = new Board();
        Boolean actual = board.placeMarker(4, 4);

        assertFalse(actual);
    }

    @Test
    public void testPlaceMarkerReturnsTrue()
    {
        Board board = new Board();
        Boolean actual = board.placeMarker(0, 0);

        assertTrue(actual);
    }

    private void setMarkers(Board board)
    {
        board.placeMarker(0, 0);
        board.placeMarker(0, 1);
        board.placeMarker(0, 2);

        board.placeMarker(1, 0);
        board.placeMarker(1, 1);
        board.placeMarker(1, 2);

        board.placeMarker(2, 0);
        board.placeMarker(2, 1);
        board.placeMarker(2, 2);
    }
}
