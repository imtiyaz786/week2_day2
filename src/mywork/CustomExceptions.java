package mywork;

public class CustomExceptions {

	public static void main(String[] args) {
		Validation  v = new Validation();
		try {
			if(v.validateEmail("iali75637@gmail.com"))
				System.out.println("Email has been validated successfully");
			
		}
		catch (InvalidEmailException e) {
			System.out.println(e.getMessage());
			
		}
		
		try {
			if(v.validateAadhar("390335800856"))
				System.out.println("Aadhar has been validated successfully");


			
		}
		catch (InvalidAadharException e) {
			System.out.println(e.getMessage());
			
		}
		
		try {
			if(v.validatePan("ADTPH1234J"));
			System.out.println("Pan has been validated successfully");


			
		}
		catch (InvalidPanException e) {
			System.out.println(e.getMessage());
			
		}


	}

}
