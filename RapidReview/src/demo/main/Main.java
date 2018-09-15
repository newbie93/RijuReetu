package demo.main;

import demo.sort.bubble.BubbleSort;
import demo.sort.insertion.InsertionSort;
import demo.sort.merge.MergeSort;
import demo.sort.quick.QuickSort;
import demo.sort.selection.SelectionSort;

public class Main {
	
	public static void main(String[]args) {
		int array[]={1,2,3,4,5,6},newArray[];
		newArray=MergeSort.sort(array);
		for(int i:newArray)
			System.out.println(i);
	}

}
