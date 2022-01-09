import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManInRange extends TestCase {

	public void testPacManInRange() throws FileNotFoundException{
        MainFrame frame = new MainFrame();
        Ghost ghost = frame.addGhost(new Location(2, 3), "mike", Color.red);
        PacMan pacman = frame.addPacMan(new Location(2, 2));
        frame.startGame();
        System.out.println("This should be true.");
        assertTrue(ghost.is_pacman_in_range());
	}

    public void testPacManNotInRange()throws FileNotFoundException{
        MainFrame frame = new MainFrame();
        Ghost ghost = frame.addGhost(new Location(3, 3), "john", Color.red);
        PacMan pacman = frame.addPacMan(new Location(2, 2));
        frame.startGame();
        System.out.println("This should be false.");
        assertFalse(ghost.is_pacman_in_range());
    }

    public void testPacGhostSameSpot()throws FileNotFoundException{
        MainFrame frame = new MainFrame();
        Ghost ghost = frame.addGhost(new Location(3, 3), "elon", Color.red);
        PacMan pacman = frame.addPacMan(new Location(3, 3));
        frame.startGame();
        System.out.println("This should be true.");
        assertTrue(ghost.is_pacman_in_range());
    }
}
