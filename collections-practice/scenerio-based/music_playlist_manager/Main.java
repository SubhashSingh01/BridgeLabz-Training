package music_playlist_manager;

public class Main {

	public static void main(String[] args) {
		SongManager sm=new SongManager();
		try {
			sm.addSong(new Song("Dil tu hi bata"));
			sm.addSong(new Song("Jai ho"));
			sm.addSong(new Song("Rang de basanti chola"));
			sm.addSong(new Song("om shanti om"));
			sm.addSong(new Song("ek haseena thi"));
		}
		catch(SongAlreadyExistsException s) {
			System.out.println(s.getMessage());
		}
		sm.playSong("Jai ho");
		sm.playSong("om shanti om");
		sm.showPlaylist();
		sm.showRecentlyPlayed();

	}

}
