/*"W.A.J. P to demonstrate try catch block, 
  Take two numbers from the user and perform the division operation and handle Arithmetic Exception. 
  O/P- Enter two numbers: 10 0
Exception in thread main java.lang.ArithmeticException:/ by zero"
 */

package Core_JAVA;

import java.util.Scanner;

public class A36 {
	
	public static void main(String[] args) {
		
		int num1=10,num2=0,result;
		
		try {

			System.out.println("Rsult : "+ num1/num2);
		}
		catch (ArithmeticException e) {
			System.out.println("Number cannot divided by zero");
		}
	}
}
