import java.awt.Color;
import junit.framework.*;

public class TestMapAttack {

	public void testMapAttack() {
        MainFrame frame = new MainFrame();
        Ghost ghost = frame.addGhost(new Location(2, 3), "mike", Color.red);
        PacMan pacman = frame.addPacMan(new Location(2, 2));
        //frame.startGame();
        System.out.println("This should be true.");
        assertTrue(ghost.myMap.attack());
	}

    public void testMapAttack1() {
        MainFrame frame = new MainFrame();
        Ghost ghost = frame.addGhost(new Location(1, 3), "mike", Color.red);
        PacMan pacman = frame.addPacMan(new Location(2, 2));
        //frame.startGame();
        System.out.println("This should be false.");
        assertFalse(ghost.myMap.attack());
	}
}
