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


		//Check if cookie was incremented
		if(frame.getMap().getCookies() == 1)
		{

			//Note: This is all I can figure out how to test, as
			//components, field, and locations are also changed
			//but are private and have no getter methods.
			
			assertTrue(true);

		}

		assertTrue(false);


	}
}
