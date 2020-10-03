package com.test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Vector;

public class CollectionExample {

	private static Field field;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<Integer>();
		Vector v=new Vector();
		v.capacity();
		
		System.out.println("ArrayList capacity : " 
                + getArrayListCapacity(al));
		
	}
private static int getArrayListCapacity(ArrayList<Integer> list) throws Exception{
        
        //get the elementData field from ArrayList class
        Field arrayField = ArrayList.class.getDeclaredField("elementData");
        
        /*
         * Since the elementData field is private, we need 
         * to make it accessible first 
         */
        arrayField.setAccessible(true);
        
        //now get the elementData Object array from our list
        Object[] internalArray = (Object[])arrayField.get(list);
        
        //Internal array length is the ArrayList capacity!
        return internalArray.length;
    }
	
}