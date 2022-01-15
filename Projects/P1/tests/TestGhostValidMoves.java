import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class TestGhostValidMoves extends TestCase {

	public void testGhostValidMoves() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		Ghost ghost = frame.addGhost(new Location(5, 5), "name", Color.red);
		frame.startGame();

		ArrayList<Location> locations = new ArrayList<Location>();
		locations.add(new Location(4,6));
		locations.add(new Location(5,7));
		locations.add(new Location(5,5));

		assertEquals(ghost.get_valid_moves(), locations);
	}
}
