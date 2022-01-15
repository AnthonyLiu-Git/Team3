import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class TestGhostValidMoves extends TestCase {

	public void testGhostValidMoves() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		Ghost ghost = frame.addGhost(new Location(5, 9), "name", Color.red);
		frame.startGame();

		ArrayList<Location> locations = new ArrayList<Location>();
		locations.add(new Location(5,10));
		locations.add(new Location(5,8));
		locations.add(new Location(6,9));

		boolean containsAll = true;

		for(Location l : ghost.get_valid_moves()) {
			if(!locations.contains(l)) {
				containsAll = false;
			}
		}

		assertTrue(containsAll && (locations.size() == ghost.get_valid_moves().size()));
	}
}
