import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.*;

public class TestPacManValidMoves extends TestCase {

	public void testPacManValidMoves() throws FileNotFoundException {
		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(5, 10));

		ArrayList<Location> locations = new ArrayList<Location>();
		locations.add(new Location(5,11));
		locations.add(new Location(5,9));
		ArrayList<Location> pacman_loc = pacman.get_valid_moves();
		boolean containsAll = true;
		System.out.println(pacman_loc);
		for(Location l : pacman_loc) {
			if(!locations.contains(l)) {
				containsAll = false;
				break;
			}
		}

		assertTrue(containsAll && (locations.size() == pacman.get_valid_moves().size()));
	}
}
