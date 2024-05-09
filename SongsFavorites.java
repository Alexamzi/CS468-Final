import java.util.ArrayList;
import java.util.Iterator;

public class SongsFavorites implements SongIterator{
	
	// ArrayList holds SongInfo objects
	
	ArrayList<SongExtraInfo> bestSongs;
	
	public SongsFavorites() {
		
		bestSongs = new ArrayList<SongExtraInfo>();

        // add with extra info
		addSong("Complicated","Avril Lavigne",2002,"Let Go","4:05");
		addSong("Everything I Wanted","Billie Eillish",2019,"When We Fall Asleep, Where Do We Go?","4:05");
		addSong("Grief", "Tony Ann", 2023,"NA: Single","3:19");
		
	}
	
	// Add a SongInfo object to the end of the ArrayList
	
	public void addSong(String songName, String bandName, int yearReleased){
		
		SongExtraInfo songExtraInfo = new SongExtraInfo(songName, bandName, yearReleased,"","");
		
		bestSongs.add(songExtraInfo);
		
	}

	public void addSong(String songName, String bandName, int yearReleased, String albumName, String playTime){
		
		SongExtraInfo songExtraInfo = new SongExtraInfo(songName, bandName, yearReleased, albumName, playTime);
		
		bestSongs.add(songExtraInfo);
		
	}
	
	
	// Get rid of this
	// Return the ArrayList filled with SongInfo Objects
	
	public ArrayList<SongExtraInfo> getBestSongs(){
		
		return bestSongs;
		
	}

	// NEW By adding this method I'll be able to treat all
	// collections the same
	
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return bestSongs.iterator();
	}
	
}