package demo.sort.bubble;

public class BubbleSort {
	
	public static int[] sort(int[]array) {
		int temp,i,j;
		for(i=0;i<array.length-1;i++) {
			for(j=0;j<array.length-1-i;j++) {
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return array;
	}

}
