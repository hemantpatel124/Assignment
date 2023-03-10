/*
 Create an abstract class 'Bank' with an abstract method 'getBalance'. 
 $100, $150 and $200 are deposited in banks A, B and C respectively. 
 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having 
 a method named 'getBalance'. Call this method by creating an object of each of the three classes.
 */

package Core_JAVA;

abstract class Bank{
	
	abstract void getBalance();
}

class BankA extends Bank{

	void getBalance() {
		System.out.println("BankA balance is: $100");
	}	
}

class BankB extends Bank{

	void getBalance() {
		System.out.println("BankB balance is: $150");
	}	
}

class BankC extends Bank{

	void getBalance() {
		System.out.println("BankC balance is: $200");
	}	
}

public class A30 {
	
	public static void main(String[] args) {
		
		BankA a=new BankA();
		BankB b=new BankB();
		BankC c=new BankC();
		
		a.getBalance();
		b.getBalance();
		c.getBalance();
		
	}
}
