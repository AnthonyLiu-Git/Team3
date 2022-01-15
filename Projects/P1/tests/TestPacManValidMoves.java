import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.*;

public class TestPacManValidMoves extends TestCase {

	public void testPacManValidMoves() throws FileNotFoundException {
		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(5, 10));
		frame.startGame();

		ArrayList<Location> locations = new ArrayList<Location>();
		locations.add(new Location(5,11));
		locations.add(new Location(5,9));

		boolean containsAll = true;

		for(Location l : pacman.get_valid_moves()) {
			if(!locations.contains(l)) {
				containsAll = false;
			}
		}

		assertTrue(containsAll && (locations.size() == pacman.get_valid_moves().size()));
	}
}
