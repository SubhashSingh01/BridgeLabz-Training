package Movie_Manager;

public class InvalidShowTimeException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public InvalidShowTimeException(String msg) {
		super(msg);
	}
}
