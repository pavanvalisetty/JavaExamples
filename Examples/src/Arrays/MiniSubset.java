package Arrays;

import java.util.Arrays;

public class MiniSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1, 2, 2,5,6,1,8,3,5, 4,4,4,4};

		System.out.println(subset(arr,arr.length));
	}

	// Function to count subsets such that all 
    // subsets have distinct elements. 
    public static int subset(int ar[], int n) 
    { 
        // Take input and initialize res = 0 
        int res = 0; 
  
        // Sort the array 
        Arrays.sort(ar); 
  
        // Traverse the input array and 
        // find maximum frequency 
        for (int i = 0; i < n; i++) { 
            int count = 1; 
  
            // For each number find its repetition / frequency 
            for (; i < n - 1; i++) { 
                if (ar[i] == ar[i + 1]) 
                    count++; 
                else
                    break; 
            } 
  
            // Update res 
            res = Math.max(res, count); 
        } 
  
        return res; 
    } 
}
