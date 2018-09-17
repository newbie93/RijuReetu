
package demo.sort.utils;

public class ArrayUtil {
	
	public static String arrayToString(int[]array) {
		StringBuilder stringBuilder=new StringBuilder();
		for(int k:array)
			stringBuilder.append(k+" ");
		return stringBuilder.toString();
	}

}
