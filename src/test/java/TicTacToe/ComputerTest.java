package TicTacToe;

import org.junit.Test;
import static org.junit.Assert.*;

public class ComputerTest {
    @Test
    public void testGettersAndSetters()
    {
        Computer computer = new Computer();
        computer.setMarker("x");

        assertEquals("x", computer.getMarker());
    }
}
