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
		int array[]={7,6,5,4,3,2,1},newArray[];
		newArray=InsertionSort.sort(array);
		log.info(ArrayUtil.arrayToString(newArray));
	}

}
