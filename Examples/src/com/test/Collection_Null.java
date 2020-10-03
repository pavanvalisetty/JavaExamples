package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Collection_Null {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> a1 = new ArrayList();
		a1.add(12);
		a1.add(13);
		System.out.println(a1);
		
		LinkedList<Object> al = new LinkedList();
		al.add(12);
		al.add(13);
		al.add(null);
		System.out.println(al);
		
		Vector<Object> av = new Vector();
		av.add(null);
		av.add(null);
		av.add(12);
		av.add(15);
		System.out.println(av);
		
		HashSet<Object> a2 = new HashSet();
		a2.add(12);
		a2.add(null);
		a2.add(10);
		a2.add(5);
		System.out.println(a2);
		LinkedHashSet<Object> a3 = new LinkedHashSet();
		a3.add(null);
		a3.add(null);
		a3.add(15);
		a3.add(10);
		System.out.println(a3);
		
		HashSet<Object> a = new HashSet();
		a.add(null);
		a.add(null);
		System.out.println(a);
		
		TreeSet<Object> at = new TreeSet();
		//at.add(null);
		//at.add(null);
		System.out.println(at);
		HashMap<Object, Object> hm =new HashMap();
		hm.put(null, null);
		hm.put(null, null);
		System.out.println(hm);
		
		LinkedHashMap<Object, Object> lhm =new LinkedHashMap();
		lhm.put(null, null);
		lhm.put(null, 12);
		System.out.println(lhm);
		
		Hashtable<Object, Object> ht =new Hashtable();
		//ht.put(null, 12);
		//ht.put(null, 12);
		System.out.println(ht);
		
		TreeMap<Object, Object> tm =new TreeMap();
		tm.put(12, null);
		//tm.put(null, 12);
		System.out.println(tm);
		
		var name = " abc";
		System.out.println(name);
		
	}

}
