package demo.main;

import demo.sort.bubble.BubbleSort;
import demo.sort.insertion.InsertionSort;
import demo.sort.quick.QuickSort;
import demo.sort.selection.SelectionSort;

public class Main {
	
	public static void main(String[]args) {
		int array[]={1,4,2,5,3,7,6},newArray[];
		newArray=QuickSort.sort(array);
		for(int i:newArray)
			System.out.println(i);
	}

}
