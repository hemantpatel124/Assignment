//Write a Java program to sort a given array list.

package Core_JAVA;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class A54 {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Hemant");
		list.add("Vatsal");
		list.add("Kishor");
		list.add("Rudra");
		list.add("Kushal");
		
		
		System.out.println("Elements of Arraylist : ");
		System.out.println(list);
		
		
		System.out.println("\nAfter Sorting Array List: ");
		Collections.sort(list);
		for(String student:list) {
			System.out.println(student);
		}
	}
}
