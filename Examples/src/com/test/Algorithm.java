package com.test;

import java.util.Scanner;

public class Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			//Input 1- UDDDUDUU
		/*Input 2-DDUUDDUDUUUD*/
		

			String s ="UDDDUDUU";

			Scanner formatString = new Scanner(System.in);
			
			String input=formatString.next();
			
			char[] ch =input.toCharArray();
			
			boolean validInput= false;
			for(int i=0;i<ch.length;i++) {
				
				if(ch[i]!='D' || ch[i]!='U') {
					validInput = true;
				}
				
			}
			// Process logic to find cycles 
			if( validInput) {
				
				for(int i=0;i<ch.length;i++) {
					
					if(ch[i]=='D' && ch[i+1]=='D') {
						// binaries length
						//10010
						
						/* 000
						 * 001 = 1
						 * 010 = 2
						 * 011 = 3
						 * 100 = 4
						 * 101 = 5
						 * 110 = 6
						 */
					//	UDDDUDUU 10001011
					//  8 4 2 1
						
					}
				
					
				}
				int count = 2;
				for(int j=1;j<8;j++) {
					System.out.println("---"+count * j);
				}
			}
			
			
	}

}
