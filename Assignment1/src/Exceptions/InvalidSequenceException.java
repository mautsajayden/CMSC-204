package Exceptions;

public class InvalidSequenceException extends PasswordCheckerUtility {

	public InvalidSequenceException(){
		super("2 character in your password are the same");
	}
	
	public InvalidSequenceException(String message) {
		super(message);
	}
}
