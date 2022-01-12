import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapEatCookie {

	public void testMapEatCookie()
	{
		MainFrame frame = new MainFrame();
		Location myLocation = new Location(1, 1);

		PacMan pacman = frame.addPacMan(myLocation);

		frame.startGame();

		if(frame.getMap().getCookies() == 1) 
		{
			assertTrue(true);
		}

		assertTrue(false);

	}
}
