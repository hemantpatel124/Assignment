/*Write a Java program to iterate through all elements in an array list.
 */
package Core_JAVA;

import java.util.ArrayList;
import java.util.Iterator;

public class A48 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add("Hemant");
		list.add(26);
		list.add("Java");
		
		System.out.println("Elements of Arraylist : ");
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
