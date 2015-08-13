import java.util.Scanner;

/**
 * 
 * Little Petya loves presents. His mum bought him two strings of the same size
 * for his birthday. The strings consist of uppercase and lowercase Latin
 * letters. Now Petya wants to compare those two strings lexicographically. The
 * letters' case does not matter, that is an uppercase letter is considered
 * equivalent to the corresponding lowercase letter. Help Petya perform the
 * comparison.
 * 
 * Input 
 * Each of the first two lines contains a bought string. The strings'
 * lengths range from 1 to 100 inclusive. It is guaranteed that the strings are
 * of the same length and also consist of uppercase and lowercase Latin letters.
 * 
 * Output 
 * If the first string is less than the second one, print "-1". If the
 * second string is less than the first one, print "1". If the strings are
 * equal, print "0". Note that the letters' case is not taken into consideration
 * when the strings are compared.
 * 
 * Sample test(s) 
 * input 
 * aaaa 
 * aaaA 
 * output 
 * 0 
 * input 
 * abs 
 * Abz 
 * output 
 * -1 
 * input 
 * abcdefg
 * AbCdEfF 
 * output 
 * 1 
 * Note 
 * If you want more formal information about the
 * lexicographical order (also known as the "dictionary order" or
 * "alphabetical order"), you can visit the following site:
 * 
 * http://en.wikipedia.org/wiki/Lexicographical_order
 * 
 * @Title: A112PetyaandStrings.java
 * @author olive
 * @date Aug 13, 2015 10:11:28 AM
 * 
 */

public class A112PetyaandStrings {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		String str1=cin.next();
		String str2=cin.next();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		int n=str1.length();
		for(int i=0;i<n;i++){
			char val1=str1.charAt(i);
			char val2=str2.charAt(i);
			if(val1-val2<0){
				System.out.println("-1");
				return ;
			}
			if(val1-val2>0){
				System.out.println("1");
				return ;
			}
		}
		System.out.println("0");
		
	}
}
