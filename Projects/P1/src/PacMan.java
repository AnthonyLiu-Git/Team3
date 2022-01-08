import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan{
	String myName;
	Location myLoc;
	Map myMap;
	Location shift; 

	public PacMan(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		ArrayList<Location> validMoves = new ArrayList<Location>();
		for(int i = -1; i <= 1; i++) {
			for(int j = -1; j <= 1; j++) {
				if(Math.abs(i) != Math.abs(j)) {
					HashSet<Map.Type> move = myMap.getLoc(myLoc.shift(i,j));
					if(!move.contains(Map.Type.WALL)) {
						validMoves.add(move);
					}
				}
			}
		}
		return validMoves;
	}

	public boolean move() {
		return false;
	}

	public boolean is_ghost_in_range() { 
		return false;
	}

	public JComponent consume() { 
 		return null;
	}
}
