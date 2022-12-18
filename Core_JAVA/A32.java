/*"Write a program to print the factorial of a number by defining a method named 'Factorial'. 
   Factorial of any number n is represented by n! And is equal to 1*2*3*.
   *(n-1) *n.
E.g.- 
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
2! = 2*1 = A
Also, 1! = 1
0! = 0"
 */

package Core_JAVA;

import java.util.Scanner;

public class A32 {

	public static void main(String[] args) {
		
		int num;
		int fact=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number: ");
		num=sc.nextInt();
		
		if(num==0) {
			System.out.println("Factorial of "+num+" is "+num);
		}
		else {
				for(int i=1;i<=num;i++) {
				fact=fact*i;
			}
			System.out.println("Factorial of "+num+" is "+fact);
		}
	}

	
}
