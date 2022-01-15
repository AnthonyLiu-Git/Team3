import junit.framework.*;
import java.awt.Color;
import java.io.*;


public class TestMapGetLoc extends TestCase {

	public void testMapGetLoc() throws FileNotFoundException{

		NoFrame frame = new NoFrame();
        Ghost ghost = frame.addGhost(new Location(2, 3), "mike", Color.red);
        PacMan pacman = frame.addPacMan(new Location(1, 1));
        frame.startGame();

		assertTrue(frame.getMap().getLoc(new Location(2,3)).contains(Map.Type.GHOST) && frame.getMap().getLoc(new Location(1,1)).contains(Map.Type.PACMAN));
	}
}
