/*"Create a class named 'Member' having the following members:
1. Data members
2. Name
3. Age
4. Phone number
5. Address
6. Salary
It also has a method named 'printSalary' which prints the salary of the members."
*/

package Core_JAVA;

class Member{
	int dataMembers;
	String name;
	int age;
	String phoneNumber;
	String address;
	Double salary;
	
	Member(	int dataMembers, String name, int age, String phoneNumber, String address, Double salary){
		
		this.dataMembers=dataMembers;
		this.name=name;
		this.age=age;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.salary=salary;
		
	}
	
	
	public void printSalary() {
		System.out.println(dataMembers+" "+name+" salary is : "+salary);
	}
	
}
public class A25 {
	
	public static void main(String[] args) {
		
		Member m1=new Member(1, "Hemant", 25, "9265922471", "Ahmedabad", 10000.00);
		Member m2=new Member(2, "Kishor", 24, "9265922471", "Ahmedabad", 20000.00);
		Member m3=new Member(3, "Akash", 26, "9265922471", "Ukai", 15000.00);
		Member m4=new Member(4, "Sarth", 23, "9265922471", "Valsad", 30000.00);
		Member m5=new Member(5, "Karan", 22, "9265922471", "Gandhinagar", 25000.00);
		
		
		m1.printSalary();
		m2.printSalary();
		m3.printSalary();
		m4.printSalary();
		m5.printSalary();
	}
}
