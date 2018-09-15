package demo.main;

import demo.sort.bubble.BubbleSort;
import demo.sort.selection.SelectionSort;

public class Main {
	
	public static void main(String[]args) {
		int array[]={-1,5,4,3,2,1},newArray[];
		newArray=SelectionSort.sort(array);
		for(int i:newArray)
			System.out.println(i);
	}

}
