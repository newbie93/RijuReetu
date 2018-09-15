package demo.list;

import java.util.ArrayList;

public class LinkedList {
	
	Node head;
	int length;

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
	
	public ArrayList<Integer> toList() {
		ArrayList<Integer>list=new ArrayList<>();
		Node node=this.head;
		while(node!=null) {
			list.add(node.data);
			node=node.next;
		}
		return list;
	}
	
	public int at(int index) {
		Node node=this.head;
		int i=0;
		while(node!=null) {
			if(i==index)
				return node.data;
			i++;
			node=node.next;
		}
		throw new IndexOutOfBoundsException();
	}

}
