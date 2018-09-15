package demo.sort.heap;

public class HeapSort {
	
	private static int[] heapify(int[]array,int index,int length) {
		if(index*2>length)
			return array;
		int largestIndex=index,temp;
		if(array[largestIndex]<array[index*2])
			largestIndex=index*2;
		if(index*2+1<=length && array[largestIndex]<array[index*2+1])
			largestIndex=index*2+1;
		if(largestIndex!=index) {
			temp=array[index];
			array[index]=array[largestIndex];
			array[largestIndex]=temp;
			array=heapify(array, largestIndex, length);
		}
		return array;
	}
	
	private static int[] makeHeap(int[]array,int length) {
		for(int i=length/2;i>=1;i--)
			array=heapify(array, i, length);
		return array;
	}
	
	private static int[] sort(int[]array, int length) {
		makeHeap(array, length);
		int max;
		for(int i=1;i<length;i++) {
			max=array[1];
			array[1]=array[length-i+1];
			array[length-i+1]=max;
			array=heapify(array, 1, length-i);
		}
		return array;
	}
	
	public static int[] sort(int[]array) {
		int tempArray[]=new int[array.length+1];
		for(int i=0;i<array.length;i++)
			tempArray[i+1]=array[i];
		tempArray=sort(tempArray,tempArray.length-1);
		for(int i=1;i<tempArray.length;i++)
			array[i-1]=tempArray[i];
		return array;
	}

}
