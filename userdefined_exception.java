package javaPurab;

class InvalidAgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String str) 
		{
// calling the constructor of parent Exception
			super(str);
		}
}


public class userdefined_exception {
	static void validate(int age) throws InvalidAgeException {
		if (age < 18) {
		// throw an object of user defined exception
		throw new InvalidAgeException("age is not valid to vote");
		} else {
		System.out.println("welcome to vote");
		}
		}
		public static void main(String[] args) {
		try {
		// calling the method
		validate(12);
		} catch (InvalidAgeException ex) {
	System.out.println("Caught the exception");
			// printing the message from InvalidAgeException object
	System.out.println("Exception occured: " + ex);
			}
		}

	}


