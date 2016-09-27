package TicTacToe;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void testGettersAndSetters()
    {
        Player player = new Player();
        player.setName("Player Name");
        player.setMarker('x');

        assertEquals("Player Name", player.getName());
        assertEquals('x', player.getMarker());
    }
}
