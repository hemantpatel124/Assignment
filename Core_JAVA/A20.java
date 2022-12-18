/*W.A.J.P to find the second most frequent character in a given string. 
 The given string is: successes The second most frequent char in the string is: c
 */
package Core_JAVA;

import java.util.HashMap;

public class A20 {
	static final int totalchars=256;
	static char get2ndMostFreq(String s1) {
		
		int[] ch=new int[totalchars];
		int i;
		for(i=0;i<s1.length();i++) {
			(ch[s1.charAt(i)])++;
		}
		
		int ch1=0, ch2=0;
		
		for(i=0;i<totalchars;i++) {
			if(ch[i]>ch[ch1]) {
				ch2=ch1;
				ch1=i;
			}
			else if(ch[i]>ch[ch2] && ch[i]!=ch[ch1]) {
				ch2=i;
			}

		}
		return (char)ch2;
	}
	
	
	
	public static void main(String[] args) {
		
		String s="successes";
		
		System.out.println("The given string is :"+s);
		char res=get2ndMostFreq(s);
		if(res!='\0') {
			System.out.println("The second most frequent char in the string  is : "+ res);
		}
		else {
			System.out.println("No second most frequent char in the string  is : "+ res);

		}
		
		
	}
}
