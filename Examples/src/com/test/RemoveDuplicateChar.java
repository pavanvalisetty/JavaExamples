package com.test;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="hello world! Kill Corona";
		
		System.out.println(" duplicate remove:"+removeDuplicate(s,s.length()));
		
	}

	private static String removeDuplicate(String s,int n) {
		
		char[] myChar=s.toCharArray();
		
		int index=0;
		
		for(int i=0;i<n;i++) {
			int j;
			for(j=0;j<i;j++) {
				
				if(myChar[i]==myChar[j]) {
					break;
				}
			}
			if(i==j) {
				myChar[index++]=myChar[i];
			}
		}
		
		
		return String.copyValueOf(myChar);
		
	}
}
