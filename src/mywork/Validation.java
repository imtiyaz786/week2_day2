package mywork;

public class Validation {
	
	public boolean validateEmail(String email) throws InvalidEmailException{
		if(email != null && email .matches("[a-z]{6}[A-Z]{3}[0-9]{5}[*]{1}"))
			return true;
		else
			throw new InvalidEmailException("Entered email : " + email + " is invalid");
			
		
	}
	
	public boolean validateAadhar(String aadhar) throws InvalidAadharException {
		if(aadhar!=null && aadhar.matches("[A-Z]{3}[a-z]{3}[0-9]{8}"))
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
