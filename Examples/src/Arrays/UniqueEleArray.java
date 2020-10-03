package Arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class UniqueEleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//For the following array [4, 1, 1, 2, 3, 2, 4], the unique integer is 3.
		int array[]= {4, 1, 1, 2, 3, 2, 4};
		Integer array1[]= {4, 1, 1, 2, 3, 2, 4};
		
		Set<Integer> unique=new TreeSet<Integer>();
		
		unique.addAll(Arrays.asList(array1));
		//System.out.println(""+unique);
		
	 
		
		System.out.print(firstNonRepeating(array, array.length)); 
	}
	static int firstNonRepeating(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) { 
            int j; 
            for (j = 0; j < n; j++) 
                if (i != j && arr[i] == arr[j]) 
                    break; 
            if (j == n) 
                return arr[i]; 
        } 
  
        return -1; 
    } 
}
