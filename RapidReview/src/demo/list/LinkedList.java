package demo.list;

import java.util.ArrayList;
import java.util.logging.Logger;

public class LinkedList {
	
	private final static Logger log=Logger.getLogger("LinkedList");
	
	private Node head;
	private int length;

	private void incrLength() {
		this.length=this.length+1;
	}
	
	private void decrLength() {
		this.length=this.length-1;
	}
	
	public LinkedList() {
		this.head=null;
		this.length=0;
	}
	
	private static Node remove(Node head, int data) {
		if(head.data==data) 
			return head.next;
		head.next=remove(head.next, data);
		return head;
	}
	
	private static Node add(Node head,int data) {
		if(head==null)
			return new Node(data);
		head.next=add(head.next, data);
		return head;
	}
	
	public void add(int data) {
		this.head=LinkedList.add(this.head, data);
		this.incrLength();
	}
	
	public void remove(int data) {
		this.head=LinkedList.remove(this.head, data);
		this.decrLength();
	}
	
	public ArrayList<Integer> toList() {
		ArrayList<Integer>list=new ArrayList<>();
		Node node=this.head;
		while(node!=null) {
			list.add(node.data);
			node=node.next;
		}
		return list;
	}
	
	public int get(int index) {
		if(index<0 || index>=this.length) {
			log.warning("Index "+index+" out of bound. Length of list is "+this.getLength());
			throw new IndexOutOfBoundsException();
		}
		Node node=this.head;
		int i=0;
		while(node!=null) {
			if(i==index)
				break;
			i++;
			node=node.next;
		}
		return node.data;
	}
	
	public int firstOccurance(int a) {
		Node node=this.head;
		int i=0;
		while(node!=null) {
			if(node.data==a)
				return i;
			node=node.next;
			i++;
		}
		return -1;
	}
	
	public boolean isPresent(int a) {
		return this.firstOccurance(a)>=0;
	}
	
	public int getLength() {
		return this.length;
	}

}
