package demo.main;

import java.util.logging.Logger;

import demo.adt.stack.StackAR;
import demo.list.LinkedList;
import demo.sort.bubble.BubbleSort;
import demo.sort.heap.HeapSort;
import demo.sort.insertion.InsertionSort;
import demo.sort.merge.MergeSort;
import demo.sort.quick.QuickSort;
import demo.sort.selection.SelectionSort;
import demo.sort.utils.ArrayUtil;

public class Main {
	
	private static Logger log=Logger.getLogger("Main");
	
	public static void main(String[]args) {
		int array[]={1,2,3,4,5,6,7},newArray[];
		//newArray=BubbleSort.sort(array);
		//log.info(ArrayUtil.arrayToString(newArray));
		
		StackAR stackAR=new StackAR(10);
		for(int i=1;i<=10;i++)
			stackAR.push(i);
		
		while(!stackAR.isEmpty())
			System.out.println(stackAR.pop());
		
		stackAR.push(100);

		System.out.println(stackAR.peek());
		System.out.println(stackAR.pop());
		
	}

}
