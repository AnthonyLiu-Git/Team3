# cmsc389T-winter22


**- PacMan**
- By Michael Ko, Benjamin Shasho, Stephen Duffy, Russel Nessbitt
- An image of your code playing PacMan
- How to run the game
```bash
javac -cp "src/" src/*.java
java -cp "src/" StartMenu
```

**Pacman methods**
- get_valid_moves()
  - given its current location, it checks the surrounding non-diagonal cells to see if there is a wall. If there is no wall it is considered a valid place and the coordinate is added to an ArrayList which is then returned once all locations are checked.
  - used example test from project description readme
- move()
  - This method causes PacMan to move. It finds the possible valid moves and selects the final option in that list of moves and returns true. If no move exists it returns false.
  - The test for this method tests a case in which PacMan is spawned and tests if the final move possible is chosen for PacMan to move.
- is_ghost_in_range()
- consume()

**Ghost methods**
- get_valid_moves()
  - given its current location, it checks the surrounding non-diagonal cells to see if there is a wall. If there is no wall it is considered a valid place and the coordinate is added to an ArrayList which is then returned once all locations are checked.
  - used example test from project description
- move()
  - This method causes a Ghost to move. It finds the possible valid moves and selects the final option in that list of moves, and returns true. If no move exists it returns false.
  - The test for this method tests a case in which a Ghost is spawned and tests if the final move possible is chosen for the Ghost to move.
- is_pacman_in_range()
- attack()

**Map methods**
- move(String name, Location loc, Type type)
  - Returns false if the passed location is a wall, otherwise it removes old location data and updates fields to remove references of the object being moved from where it is originally and updates fields and location data to put the object being moved in its new location. 
  - Tries to move pacman in a known empty cell.
- getLoc(Location loc)
  - This method returns a HashSet of Types that the location on the map contains. This is done by retrieving the values stored in the field variable of the Map class. If no value appers the return value will be a HashSet that contains Map.Type.WALL
  - The test for this method spawns a ghost and PacMan at seperate locations and the determines if their locations contain a PACMAN or GHOST reference. 
- attack(String name)
- eatCookie(String Name)
