import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.*;

public class TestPacManValidMoves extends TestCase {

	public void testPacManValidMoves() throws FileNotFoundException{
		MainFrame frame = new MainFrame();
		PacMan pacman = frame.addPacMan(new Location(9, 11));
		frame.startGame();

		ArrayList<Location> locations = new ArrayList<Location>();
		locations.add(new Location(9,12));
		locations.add(new Location(10,11));
		locations.add(new Location(10,12));

		assertEquals(pacman.get_valid_moves(), );
	}
}
