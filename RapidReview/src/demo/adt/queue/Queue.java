package demo.adt.queue;

public interface Queue {
	
	public void enqueue(int data);
	
	public int dequeue();
	
	public boolean isEmpty();

}
