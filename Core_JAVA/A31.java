/* We have to calculate the percentage of marks obtained in three subjects (each out of 100) 
   by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' 
   with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' 
   each having a method with the same name which returns the percentage of the students. 
   
   The constructor of student A takes the marks in three subjects as its parameters and the marks 
   in four subjects as its parameters for student B. Create an object for each of the two classes 
   and print the percentage of marks for both the students.
 */

package Core_JAVA;

abstract class Marks{
	abstract void getPercentage();
}

class StudentA extends Marks{
	
	int sub1,sub2,sub3;
	double total,percentage;

	
	public StudentA(int n1, int n2, int n3) {
		this.sub1=n1;
		this.sub2=n2;
		this.sub3=n3;
	}
	void getPercentage() {
		total=sub1+sub2+sub3;
		percentage=((total/300)*100);
		System.out.println("StudentA Percentage : "+percentage);
	}	
}

class StudentB extends Marks{
	
	int sub1,sub2,sub3, sub4;
	double total,percentage;

	public StudentB(int n1, int n2, int n3,int n4) {
		this.sub1=n1;
		this.sub2=n2;
		this.sub3=n3;
		this.sub4=n4;
	}
	
	void getPercentage() {
		total=sub1+sub2+sub3+sub4;
		percentage=((total/400)*100);
		System.out.println("StudentA Percentage : "+percentage);
	}
	
}


public class A31 {
	
	public static void main(String[] args) {
		
		StudentA s1=new StudentA(45,87,75);
		StudentB s2=new StudentB(45,87,75,80);
		
		s1.getPercentage();
		s2.getPercentage();
	}

}
