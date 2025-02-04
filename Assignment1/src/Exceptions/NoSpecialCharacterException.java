package Exceptions;

public class NoSpecialCharacterException  extends PasswordCheckerUtility{
	
	public  NoSpecialCharacterException() {
		super("There is no special character in your password \' @ \' ");
		
	}
	
	public  NoSpecialCharacterException(String message) {
		super (message);
	}
}
