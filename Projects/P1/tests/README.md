# cmsc389T-winter22


**- PacMan**
- By Michael Ko, Benjamin Shasho, Stephen Duffy, Russell Nesbitt
- An image of your code playing PacMan
- How to run the game
```bash
javac -cp "src/" src/*.java
java -cp "src/" StartMenu
```

**Pacman methods**
- get_valid_moves()
  - a description of the implementation for each function
  - a description of the test you wrote
- move()
  - This method causes PacMan to move. It finds the possible valid moves and selects the final option in that list of moves and returns true. If no move exists it returns false.
  - The test for this method tests a case in which PacMan is spawned and tests if the final move possible is chosen for PacMan to move.
- is_ghost_in_range()
- consume()
  - This method first checks if Pacman's current location contains a cookie, and, if so, enters the current Map's eatCookie() method with "pacman" and returns the
      result. Otherwise, returns false.
  - The test for this method spawns Pacman into a location on the preset game board where a cookie is guarenteed to spawn, then asserts true if the cookie value has
      been incremented and false otherwise.

**Ghost methods**
- get_valid_moves()
- move()
  - This method causes a Ghost to move. It finds the possible valid moves and selects the final option in that list of moves, and returns true. If no move exists it returns false.
  - The test for this method tests a case in which a Ghost is spawned and tests if the final move possible is chosen for the Ghost to move.
- is_pacman_in_range()
- attack()
  - This method first runs the is_pacman_in_range() method to determine if an attack can be launched, and, if so, enters the current Map's attack() method with the
    Ghost's name and returns the result. Otherwise, returns false.
  - The test for this method spawns Pacman and a Ghost into a game board where they are are on the same x-axis and one y-axis unit apart. This should place them into attack
    range, and then uses the value returned by the attack method to check if the Ghost can attack Pacman successfully. It asserts true if the value returned is true, and false
    otherwise.

**Map methods**
- move(String name, Location loc, Type type)
- getLoc(Location loc)
  - This method returns a HashSet of Types that the location on the map contains. This is done by retrieving the values stored in the field variable of the Map class. If no value appers the return value will be a HashSet that contains Map.Type.WALL
  - The test for this method spawns a ghost and PacMan at seperate locations and the determines if their locations contain a PACMAN or GHOST reference. 
- attack(String name)
- eatCookie(String Name)
  - This method gets the location corresesponding to the String name input, then, if a cookie is present at that location, removes that cookie from the board and returns that       cookie after incrementing the Map's cookies value by 1. If there is no cookie at that location, it returns null.
  - The test for this method spawns Pacman at a location where a cookie is known to be present on the board, then checks to see if the cookie value has been incremented. If
    it has, the test asserts true, and if otherwise, it asserts false. As there is no way to inspect the contents of the board's private HashMaps from outside the Map class,
    successful removal of the cookie from the board is checked by visually inspecting the game display.
