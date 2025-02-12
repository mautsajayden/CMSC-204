import java.util.ArrayList;

public class PasswordCheckerUtility  {
	 
	public PasswordCheckerUtility( ){
		
	}
	
	//Compare equality of two passwords
	public static void comparePasswords(String password, String passwordConfirm) throws UnmatchedException{
		if(!(password.equals(passwordConfirm))){
			throw new UnmatchedException("Passwords do not match");
		}
	}
	
	//Compare equality of two passwords
	public static boolean comparePasswordsWithReturn(String password,String passwordConfirm) {
		return password.equals(passwordConfirm);
	}

	public static boolean isValidLength​(String password) throws LengthException{
		int passwordLength = password.length();

        boolean isCheck = passwordLength >= 6;
        if (!(isCheck)) {
            throw new LengthException();
        } 
        return isCheck;	
       }

	//Checks the password alpha character requirement - Password must contain an uppercase alpha character
	public static boolean	hasUpperAlpha​(java.lang.String password) throws NoUpperAlphaException {
		boolean isCheck=false;
		for(int i =0;i<password.length();i++){
			if(Character.isUpperCase(password.charAt(i))){
				isCheck = true;
				break;
			}
		}
		if(!(isCheck)) {
			throw new NoUpperAlphaException();}

			return isCheck;
	}
	

	//Checks the password lowercase requirement - Password must contain at least one lowercase alpha character
	public static boolean	hasLowerAlpha​(java.lang.String password) throws NoLowerAlphaException {
		boolean isCheck=false;
		
		for(int i =0;i<password.length();i++){
			if((Character.isLowerCase(password.charAt(i)))){
				isCheck = true;
				break;
			}
		}
		if(!(isCheck)) {
			throw new NoLowerAlphaException();
		}
		return isCheck;
	}

	//Checks the password Digit requirement - Password must contain a numeric character
	public static boolean	hasDigit​(java.lang.String password) throws NoDigitException {
		boolean isCheck = false;
	    
	    for (int i = 0; i < password.length(); i++) {
	        if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
	            isCheck = true;
	            break;
	        }
	    }
	    
	    if (!isCheck) {  
	        throw new NoDigitException();
	    }
	    
	    return true;
	}

	//Checks the password SpecialCharacter requirement - Password must contain a Special Character
	public static boolean	hasSpecialChar​(java.lang.String password) throws NoSpecialCharacterException{
		 boolean isCheck = false;
	        for (int i = 0; i < password.length(); i++) {
	            if (password.charAt(i) == '!' || password.charAt(i) == '@' || password.charAt(i) == '#' || password.charAt(i) == '$' || password.charAt(i) == '%' || password.charAt(i) == '^' || password.charAt(i) == '&' || password.charAt(i) == '*') {
	                isCheck = true;
	                break;
	            }
	        }
	        if (!(isCheck)) {
	            throw new NoSpecialCharacterException();
	        }
	        return true;
	}

	//Checks the password Sequence requirement - Password should not contain more than 2 of the same character in sequence
	public static boolean	NoSameCharInSequence​(java.lang.String password) throws InvalidSequenceException{
		 int num = 1;
		 boolean isCheck = false;
		         for (int i = 0; i < password.length(); i++) {
		             char n = password.charAt(i);
		             num = 1; 

		             for (int j = i + 1; j < password.length(); j++) {
		                 if (n == password.charAt(j)) {
		                     isCheck = true;
		                 }
		                 else{
		                     isCheck = false;
		                 }
		                 if(isCheck){
		                     num++;
		                 }
		                 else{
		                     num =1;
		                 }
		                 if (num >= 3) {
		                     throw new InvalidSequenceException();
		                 }
		             }
		         }
		         return false;
       	}

	//Return true if valid password (follows all the following rules), returns false if an invalid password 1.
	public static boolean	isValidPassword​(java.lang.String password) throws LengthException, NoUpperAlphaException, NoLowerAlphaException, NoDigitException, NoSpecialCharacterException, InvalidSequenceException{	
		return (isValidLength​(password) && hasUpperAlpha​(password)  &&  hasLowerAlpha​(password) && hasDigit​(password) && hasSpecialChar​(password) && NoSameCharInSequence​(password));
	}

//checks if the password contains 6 to 9 characters
public static boolean hasBetweenSixAndNineChars​(java.lang.String password) {
	int numLength = password.length();

	return (numLength >= 6 && numLength <= 9);
}

//Checks if password is VALID and the length is NOT between 6-9 characters
public static boolean	isWeakPassword​(String password)throws WeakPasswordException {
		if(!(hasBetweenSixAndNineChars​(password)))
			return false;
		else 
			throw new WeakPasswordException();
}
	
/*This method will accept an ArrayList of passwords as the parameter and return an ArrayList with 
the status of any invalid passwords (weak passwords are not considered invalid*/
public static ArrayList<String> getInvalidPasswords (ArrayList<String> passwords){
	ArrayList<String> invalidPasswords = new ArrayList<>();
	for (int i = 0; i < passwords.size(); i++) {
        String pass = passwords.get(i);
        try {
            if (isValidPassword​(pass)) {
                passwords.remove(i);
                i--; 
            }
        } catch (Exception e) {
            invalidPasswords.add(pass + " -> " + e.getMessage());
        }
    }
    
    return invalidPasswords;
}
}
