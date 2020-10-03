package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDeplicate {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int a[] = new int[5];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {

			a[i] = Integer.parseInt(br.readLine());
			// System.out.println("enter number"+a[i]);

		}
		for (int i = 0; i < 5; i++) {

			System.out.print(" " + a[i]);

		}

		System.out.print("Max value: " + getMax(a, a.length));
		Arrays.sort(a);
		int n = removeDuplicates(a, a.length);
		System.out.print(" ---------------------------------------after duplicate");
		for (int i = 0; i < n; i++) {

			System.out.print(" " + a[i]);

		}
	}

	private static int getMax(int[] array, int n) {

		int max = 0;
		for (int i = 0; i < n; i++) {

			if (array[i] > max) {
				max = array[i];
			}

		}

		return max;
	}

	private static int removeDuplicates(int[] arr, int n) {

	      if (n==0 || n==1){  
	            return n;  
	        }  
	        int[] temp = new int[n];  
	        int j = 0;  
	        for (int i=0; i<n-1; i++){  
	            if (arr[i] != arr[i+1]){  
	                temp[j++] = arr[i];  
	            }  
	         }  
	        temp[j++] = arr[n-1];     
	        // Changing original array  
	        for (int i=0; i<j; i++){  
	            arr[i] = temp[i];
	           // System.out.println(" " + temp[i]);
	        }  
	        return j;   
	}

}
