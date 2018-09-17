package demo.adt.stack.exceptions;

public class StackUnderflowException extends RuntimeException {
	
	private final static String MESSAGE="Stack has no items!";

	@Override
	public String getMessage() {
		return MESSAGE;
	}
	
}
