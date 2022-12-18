//W.A.J. P to create one thread by implementing Runnable interface in Class.

package Core_JAVA;

public class A43 implements Runnable {
		
		@Override
		public void run() {
			System.out.println("Thread is Ended !! ");
		}
		
		public static void main(String[] args) {
				A43 a=new A43();
				Thread t=new Thread(a);
				t.start();
				System.out.println("First thread start...");
		}

		
}
