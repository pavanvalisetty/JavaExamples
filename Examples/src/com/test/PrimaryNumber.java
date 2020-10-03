package com.test;

import java.util.Scanner;

public class PrimaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int count = 0;
		/*
		 * for(int i=1; i<=n;i++) { if(n%i == 0) { count ++; } } if( count==2) {
		 * System.out.println(" number is prime"); }else {
		 * System.out.println(" number is not prime"); }
		 */

		for (int i = 1; i <= n; i++) {
			count=0;
			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					count++;
				}
				
			}
			if (count == 2) {
				System.out.println(" " + i);
			} 
		}

	}

}
