package demo.adt.stack;

import demo.adt.stack.exceptions.StackUnderflowException;

public interface Stack {
	
	public void push(int data);
	
	public int pop();
	
	public int peek();
	
	public boolean isEmpty();

}
