import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestAttack extends TestCase {

	public void testAttack() throws FileNotFoundException
	{
		MainFrame frame = new MainFrame();
		Ghost attackGhost = frame.addGhost(new Location(9,11), "clyde", Color.red);
		PacMan pacman = frame.addPacMan(new Location(9,12));

		assertTrue(attackGhost.attack());
	}
}
