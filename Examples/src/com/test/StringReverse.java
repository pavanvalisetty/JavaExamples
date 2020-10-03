package com.test;


public class StringReverse {
	
	
	public static void main(String[] args) {
		
		String s =" welcome to corona free world";
		char[] array= s.toCharArray();
		
		int left=0;
		int right=array.length-1;
		for(left=0;left<right;left++,right--) {
			
			char ch=array[left];
			array[left]=array[right];
			array[right]=ch;
			
		}
		System.out.println("reverse string"+String.valueOf(array));
		
	}

}
