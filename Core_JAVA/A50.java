//Write a Java program to retrieve an element (at a specified index) from a given array list.

package Core_JAVA;

import java.util.ArrayList;
import java.util.Iterator;

public class A50 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Hemant");
		list.add("Kishor");
		list.add("Rudra");
		list.add("Kushal");
		list.add("Vatshal");
		
		System.out.println("Elements of Arraylist : ");
		System.out.println(list);
		
		String s=list.get(1);
		System.out.println("\nSpecified index fetch elment : "+s);
		
	}
}
