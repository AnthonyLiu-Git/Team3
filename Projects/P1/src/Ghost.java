import java.util.HashSet;
import java.util.ArrayList;

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
		return null;
	}

	public boolean move() {
		return false;
	}

	public boolean is_pacman_in_range() {
		HashSet<Map.Type> curr = myMap.getLoc(myLoc);
        HashSet<Map.Type> right = myMap.getLoc(myLoc.shift(1,0));
        HashSet<Map.Type> left = myMap.getLoc(myLoc.shift(-1,0));
        HashSet<Map.Type> up = myMap.getLoc(myLoc.shift(0,1));
        HashSet<Map.Type> down = myMap.getLoc(myLoc.shift(0,-1));

        if (right.contains(Map.Type.PACMAN) || left.contains(Map.Type.PACMAN)
            || up.contains(Map.Type.PACMAN) || down.contains(Map.Type.PACMAN)
            || curr.contains(Map.Type.PACMAN) ) {
            return true;
        }
		return false;
	}

	public boolean attack() {
		return false;
	}
}
