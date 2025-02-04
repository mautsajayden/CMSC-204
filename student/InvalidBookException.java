

/*
 * Create a custom exception named InvalidBookException
 * This exception is subclass of BookException class 
 * This exception is thrown when a book is invalid; missing title or invalid number of pages
 */

public class InvalidBookException extends BookException{
	
	public InvalidBookException() {
		super("InvalidBookException informing the user about the issue.");
	}
	
	public InvalidBookException(String message) {
		super(message);
	}
}