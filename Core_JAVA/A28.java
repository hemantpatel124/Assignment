/*Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with separate methods 
  for each operation whose real and imaginary parts are entered by user. 
 */

package Core_JAVA;

import java.util.Scanner;

class Complex{
	private final double real;
	private final double imaginary;
	
	public Complex(double real, double imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}
	
	
	public Complex sum(Complex c) {
		double r=this.real+c.real;
		double i=this.imaginary+c.imaginary;

		return new Complex(r, i);
	}
	public Complex difference(Complex c) {
		double r=this.real/c.real;
		double i=this.imaginary/c.imaginary;

		return new Complex(r, i);
	}
	public Complex product(Complex c) {
		double r=this.real*c.real;
		double i=this.imaginary*c.imaginary;

		return new Complex(r, i);
	}
	public double getReal() {
		return real;
	}
	public double getImaginary() {
		return imaginary;
	}


	@Override
	public String toString() {
		return real+"+"+imaginary+" i ";
	}
	
}

public class A28 {
	public static void main(String[] args) {
		
			Complex c1=new Complex(2, 4);
			Complex c2=new Complex(3, 5);
			Complex sum=c1.sum(c2);
			Complex difference=c1.difference(c2);
			Complex product=c1.product(c2);
			
			
			System.out.println("First complex number : "+c1);
			System.out.println("Second complex number : "+c2);
			System.out.println("Sum of two complex number : "+sum);
			System.out.println("Difference of two complex number : "+difference);
			System.out.println("Product of two complex number : "+product);
	}
	
}
