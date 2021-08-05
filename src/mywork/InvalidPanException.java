package mywork;

public class InvalidPanException extends Exception {

	
	public InvalidPanException() {
		super();
	}
	public InvalidPanException(String pan) {
		super(pan);
	}
	


}
