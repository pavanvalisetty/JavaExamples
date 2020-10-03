package codingtest;

public class Optum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1, l = 3, r = 3; 
	    System.out.println( "The output is " + maximumXOR(n, l, r)); 
	}

	static int maximumXOR(int lo, int hi, int k) 
	{ 
	    int x = 0; 
	    for (int i = (int)(Math.log(k)/Math.log(2)); i >= 0; --i) 
	    { 
	        if ((lo & (1 << i))>0)  
	        { 
	            if ((x > k) || (x + (1 << i) - 1 < hi)) 
	                x ^= (1 << i); 
	        } 
	        else  
	        { 
	            if ((x ^ (1 << i)) <= k) 
	                x ^= (1 << i); 
	        } 
	    } 
	    return lo ^ x; 
	} 
}
