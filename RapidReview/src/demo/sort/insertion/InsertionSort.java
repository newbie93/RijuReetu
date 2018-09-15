package demo.sort.insertion;

public class InsertionSort {
	
	public static int[] sort(int[]array) {
		int ptr,i,j;
		for(i=1;i<array.length;i++) {
			ptr=array[i];
			for(j=i-1;j>=0;j--) {
				if(array[j]>ptr)
					array[j+1]=array[j];
				else
					break;
			}
			array[j+1]=ptr;
		}
		return array;
	}

}
