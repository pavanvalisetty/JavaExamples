package com.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTest {
	void run() {
		System.out.println("mytest0 ");
	}
public static void main(String[] args) {
	
	int a=3;
	testfunction(a);
	System.out.println(a);
	int [] array=new int[10];
	DateFormat df=new SimpleDateFormat("");
	df.format(new Date());
	Integer i=new Integer(0);

	
	
}
public static void testfunction(int a) {
	a=10;
}
/*class Test{
	MyTest t=new MyTest(){
		
		void run() {
			System.out.println("mytest ");
		}
	};
}*/
}

