/*Create a class named 'Shape' with a method to print "This is this is shape". 
  Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, 
  both having a method to print "This is rectangular shape" and "This is circular shape" respectively. 
  Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle". 
  Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.
 */

package Core_JAVA;
class Shape1{
	
			public void print() {
				System.out.println("This is this is shape");
			}
}
class Rectangel extends Shape1{
			public void print() {
				super.print();
				System.out.println("This is rectangular shape");
			}
}
class Square1 extends Rectangel{
			public void print() {
				super.print();
				System.out.println("Square is a rectangle");
			}
			
}

class Circle extends Shape1{
			public void print() {
				super.print();
				System.out.println("This is circular shape");
			}
}

public class A35 {
	
	public static void main(String[] args) {
			Square1 s=new Square1();
			s.print();
			
	}
}
