/*Write a Java program that takes the user to provide a single character from the alphabet.
Print Vowel or Consonant, depending on the user input. 
If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, 
print an error message.*/

package Core_JAVA;

import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		
		System.out.print("Please enter single character:");
		
		Scanner sc= new Scanner(System.in);
		String s;
		s=sc.next();
		
		if(s.length()>1) {
			System.out.println("Error. Please enter single character...");
		}
		else if((s.charAt(0)>=65 && s.charAt(0)<=90) || (s.charAt(0)>=97 && s.charAt(0)<=122) ) {
			
			if(s.equalsIgnoreCase("a") ||s.equalsIgnoreCase("e") || s.equalsIgnoreCase("i") || s.equalsIgnoreCase("o") || s.equalsIgnoreCase("u")) { 
				System.out.println(s +" is Vowel"); 
			} 
			else { 
				System.out.println(s + " is Consonant "); 
			}
		}
		
		else {
			System.out.println("Error. Please enter character..");
		}
		
	}
}
