package demo.main;

import java.util.logging.Logger;

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
		int array[]={2,3,4,5,6,7,1},newArray[];
		newArray=BubbleSort.sort(array);
		log.info(ArrayUtil.arrayToString(newArray));
	}

}
