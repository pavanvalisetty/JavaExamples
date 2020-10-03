package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class MulitpleExample {

	static final int NO_OF_CHARS = 256;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vector<String> vector = new Vector<String>();
		
		 vector.add("code");
	     vector.add("doce");
	     vector.add("ecod");
	     vector.add("framer");
	     vector.add("framer");
	     vector.add("frame");
		String[] array = vector.toArray(new String[vector.size()]);
		
		 List<String> itemList = new ArrayList<String>();
		 itemList.add("4");
		 itemList.add("code");
		 itemList.add("aaagmnrs");
		// itemList.add("ecod");
		 itemList.add("anagrams");
		 itemList.add("doce");
		 //itemList.add("frame");
		// ["code","aaagmnrs","anagrams","doce"] 
		 String[] itemsArray = new String[itemList.size()];
	        itemsArray = itemList.toArray(itemsArray);
		 
		List<String> mylist = findAllAnagrams(itemsArray, itemsArray.length); 
		 System.out.println(mylist); 
	}

	static List findAllAnagrams(String arr[], int n) 
    { 
		TreeSet<String> ll =new TreeSet<String>();
        for (int i = 0; i < n; i++) 
            for (int j = i+1; j < n; j++) 
                if (areAnagram(arr[i], arr[j])) {
                    System.out.println(arr[j]); 
                    ll.add(arr[i]);
                   
                }
        
        List<String> list = new ArrayList<String>(ll);
        return list;
    } 
	static boolean areAnagram(String str1, String str2) 
    { 
        int[] count = new int[NO_OF_CHARS]; 
        int i; 
  
        for (i = 0; i < str1.length() && i < str2.length(); 
                                                   i++) 
        { 
            count[str1.charAt(i)]++; 
            count[str2.charAt(i)]--; 
        } 
  
        if (str1.length() != str2.length()) 
          return false; 
  
        
        for (i = 0; i < NO_OF_CHARS; i++) 
            if (count[i] != 0) 
                return false; 
         return true; 
    } 
	
	


	



}
