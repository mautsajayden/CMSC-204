
public class PasswordCheckerUtility extends RuntimeException {
	 
	 public PasswordCheckerUtility( ){
		 
	 }
	 
	 //Compare equality of two passwords
	 public static void comparePasswords(String password, String passwordConfirm) {
		 System.out.println(password.equals(passwordConfirm));
	 }
	 
	 //Compare equality of two passwords
	 public static boolean comparePasswordswithRetun(java.lang.String password, java.lang.String passwordConfirm) {
		 
			 
	 }
	 
	 /*This method will accept an ArrayList of passwords as the parameter and return an ArrayList with 
	 the status of any invalid passwords (weak passwords are not considered invalid*/
	 public static void getInvalidPasswords java.util.ArrayList<java.lang.String>(java.util.ArrayList<java.lang.String> passwords){
		 
	 }
	 
	 //checks if the password contains 6 to 9 characters
	 public static boolean hasBetweenSixAndNineChars​(java.lang.String password) {
		 
	 }
	 
	 //Checks the password Digit requirement - Password must contain a numeric character
	 public static boolean	hasDigit​(java.lang.String password) {
		 
	 }
	 
	 //Checks the password lowercase requirement - Password must contain at least one lowercase alpha character
	 public static boolean	hasLowerAlpha​(java.lang.String password) {
		 
	 }
	 
	 //Checks the password SpecialCharacter requirement - Password must contain a Special Character
	 public static boolean	hasSpecialChar​(java.lang.String password) {
		 
	 }
	 
	 //Checks the password alpha character requirement - Password must contain an uppercase alpha character
	 public static boolean	hasUpperAlpha​(java.lang.String password) {
		 
	 }
	 
	 //Checks the password length requirement - The password must be at least 6 characters long
	 public static boolean	isValidLength​(java.lang.String password) {
		 
	 }
	 
	 //Return true if valid password (follows all the following rules), returns false if an invalid password 1.
	 public static boolean	isValidPassword​(java.lang.String password) throws LengthException, NoUpperAlphaException, NoLowerAlphaException, NoDigitException, NoSpecialCharacterException, InvalidSequenceException{
		 
	 }
	 
	 //Checks if password is VALID and the length is NOT between 6-9 characters
	 public static boolean	isWeakPassword​(java.lang.String password) {
		 
	 }
	 
	 //Checks the password Sequence requirement - Password should not contain more than 2 of the same character in sequence
	 public static boolean	NoSameCharInSequence​(java.lang.String password) {
		 
	 }
}
