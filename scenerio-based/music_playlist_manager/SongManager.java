package music_playlist_manager;
import java.util.*;

public class SongManager {
	List<Song> songs=new LinkedList<>();
	Stack<Song> recentlyPlayed=new Stack<>();
	Set<String> set=new HashSet<>();
	
	public void addSong(Song song) throws SongAlreadyExistsException {
		if(!set.contains(song.songName)) {
		songs.add(song);
		set.add(song.songName);
		}
		else
			throw new SongAlreadyExistsException("this song already esixted "+song.songName);
	}
		public void playSong(String songName) {
	        for (Song s : songs) {
	            if (s.songName == songName) {
	                System.out.println("Playing: " + s.songName);
	                recentlyPlayed.push(s);
	                return;
	            }
	        }
	        System.out.println("Song not found!");
	    }
		
		//complete Playlist
		public void showPlaylist() {
	        System.out.println("Playlist: ");
	        for (Song s : songs) {
	            System.out.println(s.songName);
	        }
	    }

	    // Recently Played
	    public void showRecentlyPlayed() {
	        System.out.println("Recently Played: ");
	        for (Song s : recentlyPlayed) {
	            System.out.println(s.songName);
	        }
	    }
	}
