//Write a program in Java to input 5 numbers from keyboard and find their sum and average using for loop.
package Core_JAVA;

import java.util.Scanner;

public class A5 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size=sc.nextInt();
		int num[]=new int[size];

		for(int i=0;i<num.length; i++) {
			System.out.println("Enter num"+(i+1)+" : ");
			num[i]=sc.nextInt();
		}
		
		int sum=0;
		int avg=0;
		
		for(int i=0;i<num.length;i++) {
			sum = sum + num[i];
		}
		
		avg=sum/num.length;
		
		System.out.println("Sum of "+num.length+" number is : "+sum);
		System.out.println("Average of "+sum+" is : "+avg);
	
	}

}
