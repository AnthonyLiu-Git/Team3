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
  - a description of the implementation for each function
  - a description of the test you wrote
- move()
- is_ghost_in_range()
  - Checks if the ghost is in range by checking left, right, up, and down and seeing if ghost is there.
  - Method is tested by checking when ghost is next to pacman and when ghost is not next to pacman. Also check for when ghost is on top of Pacman.
- consume()

**Ghost methods**
- get_valid_moves()
- move()
- is_pacman_in_range()
  - Checks if the Pacman is in range by checking left, right, up, and down and seeing if Pacman is there.
  - Method is tested by checking when ghost is next to pacman and when ghost is not next to pacman. Also check for when ghost is on top of Pacman.
- attack()

**Map methods**
- move(String name, Location loc, Type type)
- getLoc(Location loc)
- attack(String name)
  - Changes the location of the ghost to the location of the Pacman. Set gameover to true.
  - Method is tested by checking if game ends when ghost is on top of Pacman.
- eatCookie(String Name)
