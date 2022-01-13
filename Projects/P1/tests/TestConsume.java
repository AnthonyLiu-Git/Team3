import junit.framework.*;
import java.awt.Color;
import java.io.*;
import javax.swing.JComponent;

public class TestConsume extends TestCase {

	public void testConsume() throws FileNotFoundException
	{
		MainFrame frame = new MainFrame();
		PacMan pacman = frame.addPacMan(new Location(1,1));

		JComponent myComponent = pacman.consume();
		
		int myCookies = frame.getMap().getCookies();

		assertTrue((myCookies == 1));
	}
}
