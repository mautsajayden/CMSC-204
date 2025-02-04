package Exceptions;

public class NoLowerAlphaException extends PasswordCheckerUtility {

	public NoLowerAlphaException() {
		super("Ther no lowercase character in your password");
	}
	
	public NoLowerAlphaException(String message) {
		super(message);
	}
}
