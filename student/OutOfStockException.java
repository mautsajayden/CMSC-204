
/*
 * Create a custom exception named OutOfStockException
 * This exception is subclass of BookException class 
 * This exception is thrown when a book is out of stock
 */

public class OutOfStockException extends BookException{
	
	public OutOfStockException(){
		super("Book out of Stock");
	}
	
	public OutOfStockException(String message) {
		super(message);
	}
}