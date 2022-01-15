import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapMove extends TestCase {
	public void testMapMove() throws FileNotFoundException {
		NoFrame frame = new NoFrame();
        PacMan pacman = frame.addPacMan(new Location(5, 10));
        frame.startGame();
        assertTrue(frame.getMap().move("pacman", new Location(5,11), Map.Type.PACMAN));
	}
}
