package demo.sort.bubble;

import java.util.logging.Logger;

import demo.sort.utils.ArrayUtil;

public class BubbleSort {
	
	private static Logger log=Logger.getLogger("BubbleSort");
	
	/*public static int[] sort(int[]array) {
		int temp,i,j;
		for(i=0;i<array.length-1;i++) {
			for(j=0;j<array.length-1-i;j++) {
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
			log.info("step #"+(i+1)+" : "+ArrayUtil.arrayToString(array));
		}
		return array;
	}*/
	
	public static int[] sort(int []array) {
		int temp,i,j;
		boolean sorted=false;
		for(i=0;i<array.length-1 && Boolean.FALSE.equals(sorted);i++) {
			sorted=true;
			for(j=array.length-1;j>i;j--) { // for(j=i+1;j<array.length-1;j++)
				if(array[j]<array[j-1]) {
					temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
					sorted=false;
				}
			}
			log.info("step #"+(i+1)+" : "+ArrayUtil.arrayToString(array));
		}
		return array;
	}
	

}
