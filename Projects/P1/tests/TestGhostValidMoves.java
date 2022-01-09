import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostValidMoves extends TestCase {

	public void testGhostValidMoves() throws FileNotFoundException{
		MainFrame frame = new MainFrame();
		Ghost ghost = frame.addGhost(new Location(9, 11));
		frame.startGame();

		ArrayList<Location> locations = new ArrayList<Location>();
		locations.add(new Location(9,12));
		locations.add(new Location(10,11));
		locations.add(new Location(10,12));

		assertEquals(ghost.get_valid_moves(), locations);
	}
}
