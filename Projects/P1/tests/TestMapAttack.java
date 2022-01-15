import java.awt.Color;
import junit.framework.*;
import java.io.*;

public class TestMapAttack extends TestCase {

	public void testMapAttack() throws FileNotFoundException {
        NoFrame frame = new NoFrame();
        Ghost ghost = frame.addGhost(new Location(2, 3), "mike", Color.red);
        PacMan pacman = frame.addPacMan(new Location(2, 2));
        System.out.println("This should be true.");
        assertTrue(ghost.attack());
	}



}
