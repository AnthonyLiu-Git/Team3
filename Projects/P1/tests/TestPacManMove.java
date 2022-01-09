import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class TestPacManMove extends TestCase {

	public void testPacManMove() throws FileNotFoundException{


        MainFrame frame = new MainFrame();
        Ghost ghost = frame.addGhost(new Location(2, 3), "mike", Color.red);
        PacMan pacman = frame.addPacMan(new Location(1, 1));
        frame.startGame();

		ArrayList<Location> valid_moves = pacman.get_valid_moves(); 
		
		pacman.move();
        System.out.println("This should be true.");

        assertTrue(pacman.myLoc.equals(valid_moves.get(valid_moves.size() - 1)));
	}

}

