//Write a Java program that takes a year from user and print whether that year is a leap year or not. 
package Core_JAVA;

import java.util.Scanner;

public class A3 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int year;
		
		System.out.println("Enter year : ");
		year=sc.nextInt();
		
		if(year%4==0 && year%400==00) {
			System.out.println(year+" :year is leap year");
		}else {
			System.out.println(year+" :year is not leap year");
		}
	}
}
