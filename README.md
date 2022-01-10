# cmsc389T-winter22


**- PacMan**
- By Michael Ko, Benjamin Shasho, Stephen Duffy, Russell Nesbitt
![alt text](https://github.com/cmsc388T-winter22/Team3/blob/main/Projects/P1/Screen%20Shot%202022-01-10%20at%2013.25.53.png)
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
   - Checks if the ghost is in range by checking left, right, up, and down and seeing if ghost is there.
   - Method is tested by checking when ghost is next to pacman and when ghost is not next to pacman. Also check for when ghost is on top of Pacman.
- consume()
   - Checks if the Pacman's current location coincides with that of a Cookie, and, if so, enters the Map's eatCookie method and returns its value. Otherwise, returns null.
   - Method is tested by adding Pacman to the board at a location which will always contain a cookie, and checks that the value of cookies has been incremented to 1. If so, asserts true. Otherwise, asserts false.

**Ghost methods**
- get_valid_moves()
  - given its current location, it checks the surrounding non-diagonal cells to see if there is a wall. If there is no wall it is considered a valid place and the coordinate is added to an ArrayList which is then returned once all locations are checked.
  - used example test from project description
- move()
  - This method causes a Ghost to move. It finds the possible valid moves and selects the final option in that list of moves, and returns true. If no move exists it returns false.
  - The test for this method tests a case in which a Ghost is spawned and tests if the final move possible is chosen for the Ghost to move.
- is_pacman_in_range()
   - Checks if the Pacman is in range by checking left, right, up, and down and seeing if Pacman is there.
   - Method is tested by checking when ghost is next to pacman and when ghost is not next to pacman. Also check for when ghost is on top of Pacman.
- attack()
  - Checks if pacman is in attack distance for the Ghost using the is_pacman_in_range() method, and, if so, enters the Map's attack method with the Ghost's name as the             parameter and returns its value. Otherwise, returns false.
  - Method is tested by spawning Pacman and a Ghost next to each other on the game board, then checking to see if the Ghost is able to attack Pacman. If true, assert true.         Otherwise, assert false.
 
**Map methods**
- move(String name, Location loc, Type type)
  - Returns false if the passed location is a wall, otherwise it removes old location data and updates fields to remove references of the object being moved from where it is originally and updates fields and location data to put the object being moved in its new location. 
  - Tries to move pacman in a known empty cell.
- getLoc(Location loc)
  - This method returns a HashSet of Types that the location on the map contains. This is done by retrieving the values stored in the field variable of the Map class. If no value appers the return value will be a HashSet that contains Map.Type.WALL
  - The test for this method spawns a ghost and PacMan at seperate locations and the determines if their locations contain a PACMAN or GHOST reference. 
- attack(String name)
  - Changes the location of the ghost to the location of the Pacman. Set gameover to true.
  - Method is tested by checking if game ends when ghost is on top of Pacman.
- eatCookie(String Name)
  - Checks to see if a Cookie exists at the location corresponding to that of the name parameter. If so, the cookie is removed from the board and returned, after incrementing       the cookies value. Otherwise, returns null.
  - Method is tested by spawning Pacman at a location known to contain a cookie, then checking to see if the cookies value has been incremented to 1. As there is no way of         checking the private HashMaps and HashSet used to contain board information from outside the Map class, visual confirmation of the cookie's absence from the board is           required.
