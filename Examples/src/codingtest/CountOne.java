package codingtest;

public class CountOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = { 1,0,1 };
		int arr[] = {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 }; 
        int n = A.length; 
        int x = 1; 
        //System.out.println(countOccurrences(A, n, x)); 
        
        System.out.println(MaximumPossible(268));
	}

	 static int countOccurrences(int arr[], int n, int x) 
	    { 
	        int res = 0; 
	        for (int i=0; i<n; i++) 
	            if (x == arr[i]) 
	              res++; 
	        return res; 
	    } 
	     
	 static int MaximumPossible(int N)
     {
         int digit = 5;

         if (N == 0)
         {
             return digit * 10;
         }

         int negative = N / Math.abs(N);
         N = Math.abs(N);
         int n = N;
         int maxVal=0;
         int counter = 0;
         int position = 1;

         while (n > 0)
         {
             counter++;
             n = n / 10;
         }

         for (int i = 0; i <= counter; i++)
         {
             int newVal = ((N / position) * (position * 10)) + (digit * position) + (N % position);

             if (newVal * negative > maxVal)
             {
                 maxVal = newVal * negative;
             }

             position = position * 10;
         }

         return maxVal;
     }
 
	
}
