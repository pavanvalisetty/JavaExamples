package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class StringArray {

	public static void main(String args[]) {
		     
			   String[] strPlaces = {"Great Barrier Reef", "Paris", "BoraBora", "Florence","Tokyo", "Cusco"};
			      int size = strPlaces.length;
			      for(int i = 0; i < size - 1; i++)
			      {
			         for(int j = i + 1; j < strPlaces.length; j++)
			         {
			            if(strPlaces[i].compareTo(strPlaces[j]) > 0)
			            {
			               String temp = strPlaces[i];
			               strPlaces[i] = strPlaces[j];
			               strPlaces[j] = temp;
			            }
			         }
			      }
			      System.out.println(Arrays.toString(strPlaces));
	}
}