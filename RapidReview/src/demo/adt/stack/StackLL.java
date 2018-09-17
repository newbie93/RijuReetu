package demo.adt.stack;

import java.util.logging.Logger;

import demo.adt.stack.exceptions.StackUnderflowException;
import demo.list.LinkedList;

public class StackLL implements Stack {
	
	private static final Logger log=Logger.getLogger("StackLL");
	
	private LinkedList linkedList;
	
	public StackLL() {
		linkedList=new LinkedList();
	}

	@Override
	public void push(int data) {
		linkedList.add(data);
	}

	@Override
	public int pop() {
		if(this.isEmpty())
			throw new StackUnderflowException();
		//TODO: linked list remove last element
		return 0;
	}

	@Override
	public int peek() {
		if(this.isEmpty())
			throw new StackUnderflowException();
		return this.linkedList.get(0);
	}

	@Override
	public boolean isEmpty() {
		return linkedList.getLength()==0;
	}
	
}
