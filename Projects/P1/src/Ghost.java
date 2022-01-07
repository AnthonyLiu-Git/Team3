import java.util.HashSet;
import java.util.ArrayList;
import java.lang.Math;

public class Ghost{
	String myName;
	Location myLoc;
	Map myMap;

	public Ghost(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		ArrayList<Location> validMoves = new ArrayList<Location>();
		for(int i = -1; i <= 1; i++) {
			for(int j = -1; j <= 1; j++) {
				if(Math.abs(i) != Math.abs(j)) {
					if(!myMap.getLoc(myLoc.shift(i,j)).contains(Map.Type.WALL)) {
						validMoves.add(new Location(i,j));
					}
				}
			}
		}
		return validMoves;
	}

	public boolean move() {
		return false;
	}

	public boolean is_pacman_in_range() { 
		return false;
	}

	public boolean attack() {
		return false;
	}
}
