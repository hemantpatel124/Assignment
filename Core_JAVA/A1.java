
//Write a Java program to Take three numbers from the user and print the greatest number.
  
  package Core_JAVA;

import java.util.Scanner;

public class A1 {
  
	public static void main(String[] args) {
		
		 int a,b,c;
		 
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Please enter the three number:");
		 System.out.print("1st. ");
		 a=sc.nextInt();
		 System.out.print("2nd. ");
		 b=sc.nextInt();
		 System.out.print("3rd. ");
		 c=sc.nextInt();
		 
		 
		 if(a>b) {
			 if(a>c) {
				 System.out.println("1st is gretest number.");
			 }
			 else {
				 System.out.println("3rd is grtest number.");
			 }
		 }
		 else if(b>a){
			 
			 if(b>c) {
				 System.out.println("2nd is gretest number"); 
			 }
			 else {
				 System.out.println("3rd is gretest numebr.");
			 }
		}
		else {
			 System.out.println("3rd is gretest number");
		 }
		 
		 
	}
  }
 