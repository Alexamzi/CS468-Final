# CS468-Final
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
   this class to include song runtime, album (or single), and possibly lyrics.
- The list of songs I added required editting in DiscJockey.java and RadioStation.java 
   to make sure they were printed correctly