import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

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
		return false;
	}
	
	public HashSet<Type> getLoc(Location loc) {
		//wallSet and emptySet will help you write this method
		return null;
	}

	public boolean attack(String Name) {
		//update gameOver
		return false;
	}
	
	public JComponent eatCookie(String name)
	{
		//update locations, components, field, and cookies
		//the id for a cookie at (10, 1) is tok_x10_y1
		
		//Generate cookie string
		Location nameLocation = locations.get(name);
		int x = nameLocation.x;
		int y = nameLocation.y;

		String cookieId = "tok_x" + Integer.toString(x) + "_y" + Integer.toString(y);


		//Check if a cookie exists at the name's location
		if(locations.containsKey(cookieId)) 
		{

			//Save the cookie for return
			JComponent returnCookie = components.get(cookieId);

			//Remove it if so (Updates locations)
			locations.remove(cookieId);

			//Update cookie(s?)
			cookies--;

			//Remove that cookie from the list of components (Updates components)
			components.remove(cookieId);

			//Update the relevant field by setting it to empty			
			field.put(nameLocation, emptySet);

			//Returns the CookieComponent saved earlier
			return returnCookie;

		}
		
		//If not, return null
		return null;
	}
}
