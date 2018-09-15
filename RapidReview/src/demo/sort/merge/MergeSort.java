package demo.sort.merge;

public class MergeSort {
	
	private static int[] merge(int []array, int[]tempArray,int lb, int mid, int ub) {
		int i=lb,j=mid+1,k=lb;
		while(i<=mid && j<=ub) {
			if(array[i]<array[j])
				tempArray[k++]=array[i++];
			else
			tempArray[k++]=array[j++];
		}
		while(i<=mid)
			tempArray[k++]=array[i++];
		while(j<=ub)
			tempArray[k++]=array[j++];
		for(i=lb;i<=ub;i++)
			array[i]=tempArray[i];
		return array;
	}
	
	private static int[] sort(int[]array,int[]tempArray,int lb, int ub) {
		if(lb>=ub)
			return array;
		int mid=lb+(ub-lb)/2;
		array=sort(array, tempArray, lb, mid);
		array=sort(array, tempArray, mid+1, ub);
		array=merge(array, tempArray, lb, mid, ub);
		return array;
	}
	
	public static int[] sort(int []array) {
		return sort(array,new int[array.length],0,array.length-1);
	}

}
