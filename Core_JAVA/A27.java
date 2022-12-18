/*Write a program to print the area and perimeter of a triangle having sides of 
  3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.
 */

package Core_JAVA;
import java.math.*;
class Triangle{
	double side1=5,side2=5,side3=5;
	double perimeter,s;
	double area;
	
	public Triangle() {
		
		perimeter=(side1+side2+side3);
		 area = Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
		//area=Math.sqrt(perimeter*(perimeter-side1)*(perimeter-side2)*(perimeter-side3));
	}
}

public class A27 {
	public static void main(String[] args) {
		
		Triangle t=new Triangle();
		
		System.out.println("Area of Triangle is : "+t.area);
		System.out.println("Perimeter of Triangle is : "+t.perimeter);
	}
}
