

/*
 * Create a custom BookException class 
 */
public class BookException extends RuntimeException {
	
	public BookException() {
		super("Book title not found and pages not more than one");
	}
	
	public BookException(String message) {
		super(message);
	}
}