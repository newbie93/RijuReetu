package demo.sort.selection;

public class SelectionSort {
	
	public static int[] sort(int[]array) {
		int minIndex,temp,i,j;
		for(i=0;i<array.length-1;i++) {
			minIndex=i;
			for(j=i+1;j<array.length;j++) {
				if(array[j]<array[minIndex])
					minIndex=j;
			}
			if(minIndex!=i) {
				temp=array[minIndex];
				array[minIndex]=array[i];
				array[i]=temp;
			}
		}
		return array;
	}

}
