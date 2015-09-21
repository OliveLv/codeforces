import java.util.Scanner;

/**
 * 
 Andrewid the Android is a galaxy-famous detective. In his free time he likes
 * to think about strings containing zeros and ones.
 * 
 * Once he thought about a string of length n consisting of zeroes and ones.
 * Consider the following operation: we choose any two adjacent positions in the
 * string, and if one them contains 0, and the other contains 1, then we are
 * allowed to remove these two digits from the string, obtaining a string of
 * length n - 2 as a result.
 * 
 * Now Andreid thinks about what is the minimum length of the string that can
 * remain after applying the described operation several times (possibly, zero)?
 * Help him to calculate this number.
 * 
 * 
 * Input
 * 
 * First line of the input contains a single integer n (1 ≤ n ≤ 2·105), the
 * length of the string that Andreid has.
 * 
 * The second line contains the string of length n consisting only from zeros
 * and ones.
 * 
 * 
 * Output
 * 
 * Output the minimum length of the string that may remain after applying the
 * described operations several times.
 * 
 * 
 * Sample test(s)
 * 
 * 
 * 
 * Input 4 1100
 * 
 * 
 * 
 * Output 0
 * 
 * 
 * 
 * Input 5 01010
 * 
 * 
 * 
 * Output 1
 * 
 * 
 * 
 * Input 8 11101111
 * 
 * 
 * 
 * Output 6
 * 
 * 
 * 
 * Note
 * 
 * In the first sample test it is possible to change the string like the
 * following: .
 * 
 * In the second sample test it is possible to change the string like the
 * following: .
 * 
 * In the third sample test it is possible to change the string like the
 * following:
 * 
 * A556CaseoftheZerosAndOnes.java
 * 
 * @author olivelv
 * @version time: Sep 21, 2015 7:36:05 PM
 */
public class A556CaseoftheZerosAndOnes {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		String s=cin.next();
		int cnt=0;
		for(int i=0;i<n;i++){
			int val=s.charAt(i)-'0';
			cnt+=val;
		}
		int num=Math.min(cnt, n-cnt);
		System.out.println(n-2*num);
	}
}
