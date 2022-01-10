import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestConsume extends TestCase {

	public void testConsume() throws FileNotFoundException
	{
		MainFrame frame = new MainFrame();
		PacMan pacman = frame.addPacMan(new Location(1,1));
		
		frame.startGame();

		if(frame.getMap.getCookies() == 1) 
		{
			assertTrue(true);
		}
	
		assertTrue(false);

	}
}
