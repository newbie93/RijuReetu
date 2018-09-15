package demo.sort.quick;

public class QuickSort {
	
	private static int findPartition(int[]array,int lb, int ub) {
		int i=lb-1,j=lb,pivot=array[ub],temp;
		while(j<ub) {
			if(array[j]<=pivot) {
				i++;
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
			j++;
		}
		i++;
		array[ub]=array[i];
		array[i]=pivot;
		return i;
	}
	
	private static int[] sort(int[]array,int lb, int ub) {
		if(lb>=ub)
			return array;
		int j=findPartition(array, lb, ub);
		array=sort(array, lb, j-1);
		array=sort(array, j+1, ub);
		return array;
	}
	
	public static int[] sort(int []array) {
		return sort(array,0,array.length-1);
	}

}
