# CS468-Final

MAIN BRANCH
Pulling from this branch will provide the same functionality as pulling from the JavaDoc branch. There were no changes to the code.


Iterator Design Pattern. Implementation of a design pattern exampled by Derek Banas.

The initial commit "base code" is code created and provided by Derek Banas
https://www.newthinktank.com/2012/10/iterator-design-pattern-tutorial/

To build the code, you can compile the "RadioStation.java" class and execute the program.
I added a Makefile to make this easier:

    1. Navigate to the project folder in a terminal window
    
    2. Compile the code by entering the command "make"
    
    3. Run the code by entering "make run"
    
    Optional. Enter "make clean" to remove all the generated .class files

The output of the project should print a list all of the songs to the terminal window.


Changes I made to the code:
- I created several more java classes featuring some of my favorite songs
- These songs are added as class files that implement SongIterator,
   The actual info for the songs is stored in SongInfo, I plan to extend 
   this class to include song runtime, album (or single), and possibly lyrics

- I created a new class, SongExtraInfo, that extends SongInfo, by adding an album and year

- I added functionality in several classes and methods to print the extra details
