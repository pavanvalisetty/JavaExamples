package charEx;

import java.util.Arrays;

public class CompareArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] arr1 = new char[] { 'x', 'y', 'b', 'a' };
	      char[] arr2 = new char[] { 'y', 'x', 'a', 'b','z' };
	      char[] arr3 = new char[] { 'x', 'y', 'a', 'b' };
	      
	      Arrays.sort(arr1);
	      Arrays.sort(arr3);
	      
	      System.out.println("equal or not :"+Arrays.equals(arr1, arr3));
	      
	}

}
