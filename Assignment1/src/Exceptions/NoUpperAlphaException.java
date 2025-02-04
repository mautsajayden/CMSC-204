package Exceptions;

public class NoUpperAlphaException extends PasswordCheckerUtility {

	public NoUpperAlphaException () {
		super("There is no upper case letter in the password");
	}
	
	public NoUpperAlphaException(String message) {
		super(message);
	}
}
