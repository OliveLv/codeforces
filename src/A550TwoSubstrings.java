import java.util.Scanner;

/**
 * You are given string s. Your task is to determine if the given string s
 * contains two non-overlapping substrings "AB" and "BA" (the substrings can go
 * in any order).
 * 
 * Input 
 * The only line of input contains a string s of length between 1 and 105
 * consisting of uppercase Latin letters.
 * 
 * Output 
 * Print "YES" (without the quotes), if string s contains two
 * non-overlapping substrings "AB" and "BA", and "NO" otherwise.
 * 
 * Sample test(s) input ABA output NO input BACFAB output YES input AXBYBXA
 * output NO Note In the first sample test, despite the fact that there are
 * substrings "AB" and "BA", their occurrences overlap, so the answer is "NO".
 * 
 * In the second sample test there are the following occurrences of the
 * substrings: BACFAB.
 * 
 * In the third sample test there is no substring "AB" nor substring "BA".
 * 
 * @Title: A550TwoSubstrings.java
 * @author lxh
 * @date Nov 13, 2015 8:34:32 AM
 * 
 */

public class A550TwoSubstrings {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		String s=cin.next();
		int l=s.length();
		for(int i=0;i<l-1;i++){
			if(s.charAt(i)=='A'&&s.charAt(i+1)=='B'){
				String sub=s.substring(0, i)+s.substring(i+2);
				if(sub.indexOf("BA")!=-1){
					System.out.println("YES");
					return ;
				}
			}
		}
		System.out.println("NO");
	}
}
