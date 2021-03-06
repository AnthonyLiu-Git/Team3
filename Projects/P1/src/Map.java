import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;
import java.util.ArrayList;

public class Map{

	public enum Type {
		EMPTY,
		PACMAN,
		GHOST,
		WALL,
		COOKIE
	}

	private HashMap<Location, HashSet<Type>> field;
	private boolean gameOver;
	private int dim;

	private HashMap<String, Location> locations;
	private HashMap<String, JComponent> components;
	private HashSet<Type> emptySet;
	private HashSet<Type> wallSet;

	private int cookies = 0;

	public Map(int dim){
		gameOver = false;
		locations = new HashMap<String, Location>();
		components = new HashMap<String, JComponent>();
		field = new HashMap<Location, HashSet<Type>>();

		emptySet = new HashSet<Type>();
		wallSet = new HashSet<Type>();
		emptySet.add(Type.EMPTY);
		wallSet.add(Type.WALL);
		this.dim = dim;
	}


	public void add(String name, Location loc, JComponent comp, Type type) {
		locations.put(name, loc);
		components.put(name, comp);
		if (!field.containsKey(loc)) field.put(loc, new HashSet<Type>());
		field.get(loc).add(type);
	}

	public int getCookies() {
		return cookies;
	}

	public boolean isGameOver() {
		return gameOver;
	}

	public boolean move(String name, Location loc, Type type) {
		//update locations, components, and field
		//use the setLocation method for the component to move it to the new location

		if(this.getLoc(loc).contains(Type.WALL)) {
			return false;
		}
		else {
			// removing old location data
			Location oldLocation = locations.get(name);
			field.get(oldLocation).remove(type);
			if (field.get(oldLocation).isEmpty()) {
                field.get(oldLocation).add(Type.EMPTY);
            }
			// updating to new location
			field.get(loc).add(type);
			locations.replace(name, loc);
			components.get(name).setLocation(loc.x, loc.y);
			return true;
		}
	}

	public HashSet<Type> getLoc(Location loc) {
		//wallSet and emptySet will help you write this method

        if (field.get(loc) == null) {
            HashSet<Type> wall = new HashSet<Type>();
            wall.add(Type.WALL);
            return wall;
        }
		HashSet<Type> location_types = field.get(loc);

		return location_types;
	}

	public boolean attack(String Name) {
		if (isGameOver()) {
			return gameOver;
		}

		Location ghostLocation = locations.get(Name);

		if (ghostLocation != null) {
			Location[] moves = { ghostLocation.shift(0, 1), ghostLocation.shift(0, -1), ghostLocation.shift(1, 0),
					ghostLocation.shift(-1, 0) };
			for (Location l : moves) {
				if (field.get(l) != null && field.get(l).contains(Map.Type.PACMAN)) {
					gameOver = false;
					return false;
				}
			}
		}
		return true;

	}

	public JComponent eatCookie(String name) {
		//update locations, components, field, and cookies
		//the id for a cookie at (10, 1) is tok_x10_y1
		//

		Location nameLocation = locations.get(name);
		int x = nameLocation.x;
		int y = nameLocation.y;

		String cookieId = "tok_x" + Integer.toString(x) + "_y" + Integer.toString(y);

		if(locations.containsKey(cookieId))
		{
			JComponent returnCookie = components.get(cookieId);

			locations.remove(cookieId);

			cookies = cookies + 1;

			components.remove(cookieId);

			field.put(nameLocation, emptySet);

			return returnCookie;

		}


		return null;
	}
}
