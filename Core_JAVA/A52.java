//Write a Java program to remove the third element from an array list.

package Core_JAVA;

import java.util.ArrayList;
import java.util.Iterator;

public class A52 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Hemant");
		list.add("Kishor");
		list.add("Rudra");
		list.add("Kushal");
		list.add("Vatsal");
		
		System.out.println("Elements of Arraylist : ");
		System.out.println(list);
		
		
		System.out.println("\nAfter third element remove : ");
		list.remove(3);
		System.out.println(list);
	}
}
