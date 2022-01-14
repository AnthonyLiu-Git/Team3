import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapMove {
	public void testMapMove() {
		NoFrame frame = new NoFrame();
        PacMan pacman = frame.addPacMan(new Location(2, 4));
        frame.startGame();
        assertTrue(frame.getMap().move("pacman", new Location(2,4), Map.Type.PACMAN));
	}
}
