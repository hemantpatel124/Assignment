/*Write a Java program to insert an element into the array list at the first position.
 */
package Core_JAVA;

import java.util.ArrayList;
import java.util.Iterator;

public class A49 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add("Hemant");
		list.add(26);
		list.add("Java");
		
		System.out.println("Befor new element insert ArrayList : ");
		System.out.println(list);
		
		list.add(0,"New Element");
		
		System.out.println("\nAfter insert element ArrayList : ");
		System.out.println(list);
		
	}
}
