/*"W.A.J.P to find all interleaving of given strings. 
The given strings are: WX YZ
The interleaving strings are: YWZX WYZX YWXZ WXYZ YZWX WYXZ"
 */

package Core_JAVA;

import java.util.HashSet;
import java.util.*;

public class A19 {
	 public static void allInterleavings(String res, String s1, String s2, Set < String > s3) {
		  if (s1.length() == 0 && s2.length() == 0) {
		   s3.add(res);
		   return;
		  }
		  if (s1.length() > 0) {
		   allInterleavings(res + s1.charAt(0), s1.substring(1), s2, s3);
		  }
		  if (s2.length() > 0) {
		   allInterleavings(res + s2.charAt(0), s1, s2.substring(1), s3);
		  }
		 }

		 public static void main(String[] args) {
		  String s1 = "WX";
		  String s2 = "YZ";
		  System.out.println("The given strings are: " + s1 + "  " + s2);
		  System.out.println("The interleavings strings are: ");
		  Set < String > s3 = new HashSet < > ();
		  allInterleavings("", s1, s2, s3);

		  s3.stream().forEach(System.out::println);
	}
}
