package algorithms;

public class BinaryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;

		int[] arr = new int[n];

		// Print all binary strings
		generateAllBinaryStrings(n, arr, 0);
		
		System.out.println("Decimal of 10 is: ");  
		toBinary(10);    
		System.out.println("Decimal of 21 is: ");  
		toBinary(21);    
		System.out.println("Decimal of 31 is: ");    
		toBinary(31);  
	}

	// Function to print the output
	static void printTheArray(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}

	// Function to generate all binary strings
	static void generateAllBinaryStrings(int n, int arr[], int i) {
		if (i == n) {
			printTheArray(arr, n);
			return;
		}

		// First assign "0" at ith position
		// and try for all other permutations
		// for remaining positions
		arr[i] = 0;
		generateAllBinaryStrings(n, arr, i + 1);

		// And then assign "1" at ith position
		// and try for all other permutations
		// for remaining positions
		arr[i] = 1;
		generateAllBinaryStrings(n, arr, i + 1);
	}
///	-----------------------------------------
	public static void toBinary(int decimal){  
	     int binary[] = new int[40];  
	     int index = 0;  
	     while(decimal > 0){  
	       binary[index++] = decimal%2;  
	       decimal = decimal/2;  
	     }  
	     for(int i = index-1;i >= 0;i--){  
	       System.out.print(binary[i]);  
	     }  
	System.out.println();//new line
	}  
}
