package Arrays;

import java.util.Arrays;

public class SecondLarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {12,1,52,6,8,84,633,85};
		
		//Arrays.sort(array);
		//System.out.println("second larget"+array[array.length-2]);
		
		Arrays.stream(array).boxed().sorted().forEach(System.out::println);
		
	}

}
