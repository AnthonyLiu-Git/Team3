import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class TestGhostMove extends TestCase {

	public void testGhostMove() throws FileNotFoundException{

        NoFrame frame = new NoFrame();
        Ghost ghost = frame.addGhost(new Location(2, 3), "mike", Color.red);
        PacMan pacman = frame.addPacMan(new Location(1, 1));
        frame.startGame();

		ArrayList<Location> valid_moves = ghost.get_valid_moves();

		ghost.move();
        System.out.println("This should be true.");

        assertTrue(ghost.myLoc.equals(valid_moves.get(valid_moves.size() - 1)));

	}


}