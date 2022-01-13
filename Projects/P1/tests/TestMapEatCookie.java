import junit.framework.*;
import java.awt.Color;
import java.io.*;
import javax.swing.JComponent;

public class TestMapEatCookie extends TestCase {

	public void testMapEatCookie() throws FileNotFoundException
	{
		MainFrame frame = new MainFrame();

		PacMan pacman = frame.addPacMan(new Location(1, 1));

		JComponent myComponent = frame.getMap().eatCookie("pacman");

		int myCookies = frame.getMap().getCookies();

		assertTrue((myCookies == 1));
		

	}
}
