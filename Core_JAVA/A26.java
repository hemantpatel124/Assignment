/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' 
  and two methods to print the area and perimeter of the rectangle respectively.
  
  Its constructor having parameters for length and breadth is used to initialize 
  the length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class 
  with its constructor having a parameter for its side (suppose s) calling the constructor of 
  its parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square. 
 */
//Rectagnle->  Area=W*L Perimeter=2*(L+W)
//Squar-> Area=L*L      Perimeter=4*L


package Core_JAVA;

class Rectangle{
	int length, breadth;
	public Rectangle(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
	public void printArea() {
		System.out.println("Area is : "+(length*breadth));
	}
	
	public void printPerimeter() {
		System.out.println("Perimeter is : "+(2*(length+breadth)));
	}
	
}
class Square extends Rectangle{
	
		public Square(int side) {
			super(side,side);
		}	
}


public class A26 {
	
	public static void main(String[] args) {
			
		Rectangle r=new Rectangle(5,5);
		Square s=new Square(4);
		
		System.out.println("Rectangle : ");
		r.printArea();
		r.printPerimeter();
		
		System.out.println("\nSquare : ");
		s.printArea();
		s.printPerimeter();
	}
}
