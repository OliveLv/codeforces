import java.util.Scanner;

/**
 * A word or a sentence in some language is called a pangram if all the
 * characters of the alphabet of this language appear in it at least once.
 * Pangrams are often used to demonstrate fonts in printing or test the output
 * devices.
 * 
 * You are given a string consisting of lowercase and uppercase Latin letters.
 * Check whether this string is a pangram. We say that the string contains a
 * letter of the Latin alphabet if this letter occurs in the string in uppercase
 * or lowercase.
 * 
 * Input 
 * The first line contains a single integer n (1 ≤ n ≤ 100) — the number
 * of characters in the string.
 * 
 * The second line contains the string. The string consists only of uppercase
 * and lowercase Latin letters.
 * 
 * Output 
 * Output "YES", if the string is a pangram and "NO" otherwise.
 * 
 * Sample test(s) 
 * input 
 * 12 
 * toosmallword 
 * output 
 * NO 
 * input 
 * 35
 * TheQuickBrownFoxJumpsOverTheLazyDog 
 * output 
 * YES
 * 
 * @Title: A520Pangram.java
 * @author lxh
 * @date Sep 1, 2015 8:45:23 PM
 * 
 */

public class A520Pangram {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		String str=cin.next();
		if(n<26)System.out.println("NO");
		else{
			char[]chars=new char[26];
			str=str.toLowerCase();
			for(int i=0;i<n;i++){
				char val=str.charAt(i);
				chars[val-'a']++;
			}
			for(int i=0;i<26;i++)
				if(chars[i]==0){
					System.out.println("NO");
					return ;
				}
			System.out.println("YES");
		}
	}
}
