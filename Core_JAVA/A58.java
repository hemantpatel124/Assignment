//Write a Java program to iterate through all elements in a hash list.


package Core_JAVA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class A58 {
	
	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add("Hemant");
		set.add("Kishor");
		set.add("Rudra");
		set.add("Kushal");
		set.add("Vatsal");
		
		System.out.println("Elements of Hash list : ");
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
