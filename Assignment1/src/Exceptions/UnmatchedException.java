package Exceptions;

public class UnmatchedException extends PasswordCheckerUtility {

	public UnmatchedException() {
		super("The passwords do not match");
	}
	
	public UnmatchedException(String message) {
		super(message);
	}
}
