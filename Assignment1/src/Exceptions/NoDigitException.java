package Exceptions;

public class NoDigitException extends PasswordCheckerUtility {

	public NoDigitException() {
		super("There is no digit in your passwrod");
	}
	
	public NoDigitException(String message) {
		super(message);
	}
}
