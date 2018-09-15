package demo.main;

import demo.sort.bubble.BubbleSort;

public class Main {
	
	public static void main(String[]args) {
		int array[]={-1,5,4,3,2,1},newArray[];
		newArray=BubbleSort.sort(array);
		for(int i:newArray)
			System.out.println(i);
	}

}
