package music_playlist_manager;

public class SongAlreadyExistsException extends Exception {
	SongAlreadyExistsException(String msg){
		super(msg);
	}
}
