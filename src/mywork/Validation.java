package mywork;

public class Validation {
	
	public boolean validateEmail(String email) throws InvalidEmailException{
		if(email .matches("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b"))
			return true;
		else
			throw new InvalidEmailException("Entered email : " + email + " is invalid");
			
		
	}
	
	public boolean validateAadhar(String aadhar) throws InvalidAadharException {
		if(aadhar.matches("[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$"))
			return true;
		else
			throw new InvalidAadharException("Entered aadhar : " + aadhar + " is invalid");		
	}

	public boolean validatePan(String pan) throws InvalidPanException {
		if(pan != null && pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"))
			return true;
		else
			throw new InvalidPanException("Entered pan : " + pan + " is invalid");
	}
		

}
