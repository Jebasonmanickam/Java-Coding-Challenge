package exception;

// import java.util.Scanner;



	public class InvalidPetAgeHandlingException extends Exception {

		private static final long serialVersionUID = 1L;
		private String message;

		public InvalidPetAgeHandlingException(String message) {
			this.message = message;
		}

		public String getMessage() {
			return message;
		}

	}

