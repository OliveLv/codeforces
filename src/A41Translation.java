import java.util.Scanner;

/**
 * The translation from the Berland language into the Birland language is not an
 * easy task. Those languages are very similar: a berlandish word differs from a
 * birlandish word with the same meaning a little: it is spelled (and
 * pronounced) reversely. For example, a Berlandish word code corresponds to a
 * Birlandish word edoc. However, it's easy to make a mistake during the
 * «translation». Vasya translated word s from Berlandish into Birlandish as t.
 * Help him: find out if he translated the word correctly.
 * 
 * Input 
 * The first line contains word s, the second line contains word t. The
 * words consist of lowercase Latin letters. The input data do not consist
 * unnecessary spaces. The words are not empty and their lengths do not exceed
 * 100 symbols.
 * 
 * Output 
 * If the word t is a word s, written reversely, print YES, otherwise
 * print NO.
 * 
 * Sample test(s) 
 * input 
 * code 
 * edoc 
 * output 
 * YES 
 * input 
 * abb 
 * aba 
 * output 
 * NO 
 * input 
 * code
 * code 
 * output 
 * NO
 * 
 * @Title: A41Translation.java
 * @author lxh
 * @date Aug 18, 2015 10:20:42 AM
 * 
 */

public class A41Translation {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		String a=cin.next();
		String b=cin.next();
		if(a.length()!=b.length()){
			System.out.println("NO");
			return ;
		}
		int n=a.length();
		for(int i=0;i<n;i++)
			if(a.charAt(i)!=b.charAt(n-i-1)){
				System.out.println("NO");
				return ;
			}
		System.out.println("YES");
	}
}
