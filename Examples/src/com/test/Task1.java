package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int getSum(int n) {
		
		int a = n %10;
		int b = n /10;
		//return (a+b);
		
		String [] abc = new String[]{""," "};
		//Collections.sort(abc,)
		
		 ArrayList<Album> c = new ArrayList<Album>();

		    c.add( new Album("DaftPunk","Discovery","2001"));
		    c.add( new Album ("Pink Floid","The Dark Side Of The Moon","1973"));
		    c.add( new Album( "The Clash", "London Calling", "1979"));
		  //  java.util.Collections.sort((List<T>) c);
		    System.out.print(c);  
		
		return 1;		
	}
}

class Album  {
private String author;
private String name;
private String year;

public Album(String a, String n, String y) { // constructor

author = a;
name = n;
year = y;

}

public String toString()
{

   return  author +","+ name + "," + year;

} 

public int compareTo(Album a) {
   // usually toString should not be used,
   // instead one of the attributes or more in a comparator chain
   return author.compareTo(a.author);

}
}