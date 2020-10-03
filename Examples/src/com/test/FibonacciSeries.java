package com.test;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int count = 0;
		int first=0;
		int second=1;
		int third=first+second;
			
		while( true) {
			
			System.out.println(""+third);
			if(third>=n) {
				break;
			}
			
			first =second;
			second = third;
			third = first+ second;
		}
	}

}
