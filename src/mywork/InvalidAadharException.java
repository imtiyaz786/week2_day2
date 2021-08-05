package mywork;

public class InvalidAadharException extends Exception {

	public InvalidAadharException() {
		super();
	}
	public InvalidAadharException(String aadhar) {
		super(aadhar);
	}
	

}
