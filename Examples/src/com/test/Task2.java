package com.test;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = 5, B = 3; 
        generateString(A, B); 
	}

	static void generateString(int A, int B)  
    { 
        String rt = ""; 
        while (0 < A || 0 < B)  
        { 
  
            // More 'b', append "bba" 
            if (A < B) 
            { 
                if (0 < B--) 
                { 
                    rt += ('b'); 
                } 
                if (0 < B--)  
                { 
                    rt += ('b'); 
                } 
                if (0 < A--)  
                { 
                    rt += ('a'); 
                } 
            }  
              
            // More 'a', append "aab" 
            else if (B < A) 
            { 
                if (0 < A--)  
                { 
                    rt += ('a'); 
                } 
                if (0 < A--)  
                { 
                    rt += ('a'); 
                } 
                if (0 < B--)  
                { 
                    rt += ('b'); 
                } 
            }  
              
            // Equal number of 'a' and 'b' 
            // append "ab" 
            else
            { 
                if (0 < A--)  
                { 
                    rt += ('a'); 
                } 
                if (0 < B--)  
                { 
                    rt += ('b'); 
                } 
            } 
        } 
        System.out.println(rt); 
    } 
}
