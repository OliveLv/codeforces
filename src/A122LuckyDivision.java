import java.util.Scanner;

/**
 * Petya loves lucky numbers. Everybody knows that lucky numbers are positive
 * integers whose decimal representation contains only the lucky digits 4 and 7.
 * For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.
 * 
 * Petya calls a number almost lucky if it could be evenly divided by some lucky
 * number. Help him find out if the given number n is almost lucky.
 * 
 * Input 
 * The single line contains an integer n (1 ≤ n ≤ 1000) — the number that
 * needs to be checked.
 * 
 * Output 
 * In the only line print "YES" (without the quotes), if number n is
 * almost lucky. Otherwise, print "NO" (without the quotes).
 * 
 * Sample test(s) 
 * input 
 * 47 
 * output 
 * YES 
 * input 
 * 16 
 * output 
 * YES 
 * input 
 * 78 
 * output 
 * NO
 * Note 
 * Note that all lucky numbers are almost lucky as any number is evenly
 * divisible by itself.
 * 
 * In the first sample 47 is a lucky number. In the second sample 16 is
 * divisible by 4.
 * 
 * @Title: A122LuckyDivision.java
 * @author lxh
 * @date Aug 17, 2015 3:27:12 PM
 * 
 */

public class A122LuckyDivision {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n=cin.nextInt();
		if(n%4==0||n%7==0||n%47==0||n%74==0){
			System.out.println("YES");
			return ;
		}
		String str=String.valueOf(n);
		int l=str.length();
		int i=0;
		for(;i<l;i++){
			char val=str.charAt(i);
			if(val!='4'&&val!='7')break;
		}
		if(i<l)System.out.println("NO");
		else
			System.out.println("YES");
	}
}
