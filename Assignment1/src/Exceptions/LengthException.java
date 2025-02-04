package Exceptions;

public class LengthException extends PasswordCheckerUtility {

	public LengthException() {
		super("Your password is less than 6 characters");
	}
	
	public LengthException(String message) {
		super(message);
	}
}
