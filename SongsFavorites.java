import java.util.ArrayList;
import java.util.Iterator;

public class SongsFavorites implements SongIterator{
	
	// ArrayList holds SongInfo objects
	
	ArrayList<SongInfo> bestSongs;
	
	public SongsFavorites() {
		
		bestSongs = new ArrayList<SongInfo>();

        addSong("Complicated","Avril Lavigne",2002);
		addSong("Everything I Wanted","Billie Eillish",2019);
		addSong("Grief", "Tony Ann", 2023);
		
	}
	
	// Add a SongInfo object to the end of the ArrayList
	
	public void addSong(String songName, String bandName, int yearReleased){
		
		SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
		
		bestSongs.add(songInfo);
		
	}
	
	
	// Get rid of this
	// Return the ArrayList filled with SongInfo Objects
	
	public ArrayList<SongInfo> getBestSongs(){
		
		return bestSongs;
		
	}

	// NEW By adding this method I'll be able to treat all
	// collections the same
	
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return bestSongs.iterator();
	}
	
}