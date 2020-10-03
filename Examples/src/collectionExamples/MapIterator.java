package collectionExamples;

import java.util.HashMap;
import java.util.Map;

public class MapIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<String,String> gfg = new HashMap<String,String>(); 
	      
	        // enter name/url pair 
	        gfg.put("GFG", "geeksforgeeks.org"); 
	        gfg.put("Practice", "practice.geeksforgeeks.org"); 
	        gfg.put("Code", "code.geeksforgeeks.org"); 
	        gfg.put("Quiz", "quiz.geeksforgeeks.org"); 
	          
	        // using for-each loop for iteration over Map.entrySet() 
	        for (Map.Entry<String,String> entry : gfg.entrySet())  
	            System.out.println("Key = " + entry.getKey() + 
	                             ", Value = " + entry.getValue()); 
	    } 

}
