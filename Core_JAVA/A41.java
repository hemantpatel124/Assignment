/*"W.A.J.P to create a custom exception if Customer withdraw amount which is greater than 
  account balance then program will show custom exception otherwise amount 
  will deduct from account balance. Account balance is: 2000 Enter withdraw amount: 2500
  Sorry, insufficient balance, you need more 500 Rs. To perform this transaction."
 */
package Core_JAVA;

class UserDefinedException extends Exception{
	
	String s;
	public UserDefinedException(String s) {
		this.s=s;
	}
	public String toString(){
		return s;
	}
}
public class A41 {
	public static void main(String[] args) throws UserDefinedException {
		
		int acountbal=2000,wdamt=2500;
		try {
				if(acountbal<wdamt) {
					throw new UserDefinedException("Sorry , insufficient balance, you nedd more 500 Rs. To perform this transaction.");
				}
		}
		catch (UserDefinedException e) {
			System.out.println(e);
		}
	}
		

}
