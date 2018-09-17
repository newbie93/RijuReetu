package demo.adt.stack;

import java.util.logging.Logger;

import demo.adt.stack.exceptions.StackOverflowException;
import demo.adt.stack.exceptions.StackUnderflowException;

public class StackAR implements Stack {
	
	private static final Logger log=Logger.getLogger("StackAR");
	
	private final static int MAX_SIZE=100;
	
	private int array[];
	private int size;
	private int maxSize;
	
	public StackAR(int maxSize) {
		this.maxSize=maxSize;
		this.array=new int[this.maxSize];
		this.size=0;
	}
	
	public StackAR() {
		this.maxSize=MAX_SIZE;
		this.array=new int[this.maxSize];
		this.size=0;
	}

	@Override
	public void push(int data) {
		if(this.size>=this.maxSize)
			throw new StackOverflowException();
		this.array[this.size++]=data;
	}

	@Override
	public int pop() throws StackUnderflowException {
		if(this.size==0)
			throw new StackUnderflowException();
		return this.array[--this.size];
	}

	@Override
	public int peek() throws StackUnderflowException {
		if(this.size==0)
			throw new StackUnderflowException();
		return this.array[this.size-1];
	}

	@Override
	public boolean isEmpty() {
		return this.size==0;
	}
	
	public int getMaxSize() {
		return this.maxSize;
	}

}
