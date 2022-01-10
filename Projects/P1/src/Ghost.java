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
                    HashSet <Map.Type> x = myMap.getLoc(myLoc.shift(i, j));
                   
					if(!x.contains(Map.Type.WALL)) {
						
						validMoves.add(new Location(myLoc.x + i, myLoc.y +j));
					}
				}
			}
		}
		return validMoves;
	}

	public boolean move() {

		ArrayList<Location> locations = this.get_valid_moves();

        if(locations == null || locations.size() == 0){

            return false;

        } else {

            this.myLoc = locations.get(locations.size() - 1);
			myMap.move(myName, myLoc, Map.Type.GHOST);
            return true;

        }
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

	public boolean attack()
	{

		//Might be more complex than this, depending on Map.attack ()
		if(is_pacman_in_range())
		{
			return myMap.attack(myName);
		}

		return false;
	}
}
