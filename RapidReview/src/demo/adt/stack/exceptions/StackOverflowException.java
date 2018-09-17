package demo.adt.stack.exceptions;

public class StackOverflowException extends RuntimeException {
	
	private final String MESSAGE="No space in stack! Max size reached!";
	
	@Override
	public String getMessage() {
		return MESSAGE;
	}

}
