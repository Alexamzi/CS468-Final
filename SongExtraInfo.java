// Will hold all of the info needed for each song

// I told all users to:
// 1. create a function named addSong() for adding song, band and release
// 2. create a function named getBestSongs() that will return the collection
//    of songs

public class SongExtraInfo extends SongInfo{


    String songPlaytime;
    String songAlbum;
	
	public SongExtraInfo(String newSongName, String newBandName, int newYearReleased, String albumName, String playTime) {
        super(newSongName, newBandName, newYearReleased);
        songPlaytime = playTime;
        songAlbum = albumName;

        
    }


    public void SongInfo(String newSongName, String newBandName, int newYearReleased, String newPlayTime, String newAlbum){
		
		songName = newSongName;
		bandName = newBandName;
		yearReleased = newYearReleased;
        songPlaytime = newPlayTime;
        songAlbum = newAlbum;
        
	}

    public void setAlbum(String newAlbumName){
        songAlbum = newAlbumName;
    }

    public void setPlaytime(String newPlaytime){
        songPlaytime = newPlaytime;
    }
	

    public String getAlbum(){ return songAlbum; }
    public String getPlaytime() { return songPlaytime; }
	
}