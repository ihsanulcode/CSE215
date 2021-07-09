package LAB_Final;

public class InvalidSalaryException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidSalaryException(String warning) {
		super(warning);
	}

}