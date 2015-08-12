import java.util.Scanner;

/**
 * Petya loves football very much. One day, as he was watching a football match,
 * he was writing the players' current positions on a piece of paper. To
 * simplify the situation he depicted it as a string consisting of zeroes and
 * ones. A zero corresponds to players of one team; a one corresponds to players
 * of another team. If there are at least 7 players of some team standing one
 * after another, then the situation is considered dangerous. For example, the
 * situation 00100110111111101 is dangerous and 11110111011101 is not. You are
 * given the current situation. Determine whether it is dangerous or not.
 * 
 * Input 
 * The first input line contains a non-empty string consisting of
 * characters "0" and "1", which represents players. The length of the string
 * does not exceed 100 characters. There's at least one player from each team
 * present on the field.
 * 
 * Output 
 * Print "YES" if the situation is dangerous. Otherwise, print "NO".
 * 
 * Sample test(s) 
 * input 
 * 001001 
 * output 
 * NO 
 * input 
 * 1000000001 
 * output 
 * YES
 * 
 * @Title: A96Football.java
 * @author olive
 * @date Aug 12, 2015 4:13:12 PM
 * 
 */

public class A96Football {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		String str=cin.next();
		int n=str.length();
		if(n<7){
			System.out.println("NO");
			return ;
		}
		char now=str.charAt(0);
		int len=1;
		for(int i=1;i<n;i++){
			char val=str.charAt(i);
			if(val==now)len++;
			else{
				now=val;
				len=1;
			}
			if(len>=7)break;
		}
		if(len>=7)System.out.println("YES");
		else
			System.out.println("NO");
	}
}
