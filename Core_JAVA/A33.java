/*We have to calculate the area of a rectangle, a square and a circle. 
 Create an abstract class 'Shape' with three abstract methods namely 
 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' 
 taking one parameter each. The parameters of 'RectangleArea' are its 
 length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. 
 
 Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' 
 for printing the area of rectangle, square and circle respectively. Create an object of class 'Area' and call all the three methods. 	
 */
package Core_JAVA;

abstract class Shape{
	abstract void rectangleArea(int length,int breadth);
	abstract void squareArea(int side);
	abstract void circleArea(int radius);
}

class Area extends Shape{

	@Override
	void rectangleArea(int length, int breadth) {
	
		System.out.println("Rectagne Area: "+(length*breadth));
	}

	@Override
	void squareArea(int side) {
		System.out.println("Rectagne Area: "+(side*side));
	}

	@Override
	void circleArea(int radius) {
		double pi=3.14;
		System.out.println("Rectagne Area: "+(pi*radius*radius));
	}
	
}

public class A33 {
	public static void main(String[] args) {
		
		Area a=new Area();
		a.rectangleArea(5,5);
		a.squareArea(5);
		a.circleArea(5);
	}
}
