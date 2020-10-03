package com.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//myfunction(1,1,1,1,1);
		//f1(10,20);
		/*ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		ArrayList ab=new ArrayList();
		ab=(ArrayList<Integer>) al.clone();
		ab.add(4);
		ab.remove(2);
		System.out.println(ab.equals(al));*/
		HashMap<String, String> hm=new HashMap<String, String>();
		/*hm.put("abc", "two");
		hm.put(1, "two");
		System.out.println(hm.keySet());
		System.out.println(hm.values());*/
		
		
	}
	public static void f1(long l,long l1) {
		System.out.println("long");
	}
	public static void f1(float l,float l1) {
		System.out.println("float");
	}
	public static void myfunction(int a,int b,int c,int d,int e) throws FileNotFoundException {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(a);
		al.add(b);
		al.add(c);
		al.add(d);
		al.add(e);
		Collections.sort(al,Collections.reverseOrder());
		//System.out.println(al);
		int sum=0;
		sum=al.get(0)*al.get(1)+al.get(2)-al.get(3)/al.get(4);

		//System.out.println("sum:"+sum);
		int i=0;
		while(true) {
		if(i++==4) {
			break;
			
		}
		i++;
		}
		System.out.println(""+i);
		PrintStream pr=new PrintStream(new FileOutputStream("Abc"));
		//System.out=pr;
		
	}

}
