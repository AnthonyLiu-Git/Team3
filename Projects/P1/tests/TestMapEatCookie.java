import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapEatCookie {

	public void testMapEatCookie() 
	{
		NoFrame frame = new NoFrame();

		PacMan pacman = frame.addPacMan(new Location(1, 1));

		JComponent myComponent = frame.getMap().eatCookie("pacman");

		int myCookies = frame.getMap().getCookies();

		assertTrue((myCookies == 1));
	}
}
