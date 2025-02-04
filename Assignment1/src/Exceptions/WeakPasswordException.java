package Exceptions;

public class WeakPasswordException extends PasswordCheckerUtility {

	public WeakPasswordException() {
		super("length is between 6 and 9");
	}
	
	public WeakPasswordException (String message) {
		super(message);
	}
}
