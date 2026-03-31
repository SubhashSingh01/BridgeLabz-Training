package railway_platform_allocation;

class PlatformUnavailableException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PlatformUnavailableException(String message) {
        super(message);
    }
}