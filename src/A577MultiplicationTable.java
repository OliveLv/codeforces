import java.util.Scanner;

/**
 * 
 Let's consider a table consisting of n rows and n columns. The cell located
 * at the intersection of i-th row and j-th column contains number i × j. The
 * rows and columns are numbered starting from 1.
 * 
 * You are given a positive integer x. Your task is to count the number of cells
 * in a table that contain number x.
 * 
 * 
 * Input
 * 
 * The single line contains numbers n and x (1 ≤ n ≤ 105, 1 ≤ x ≤ 109) — the
 * size of the table and the number that we are looking for in the table.
 * 
 * 
 * Output
 * 
 * Print a single number: the number of times x occurs in the table.
 * 
 * 
 * Sample test(s)
 * 
 * 
 * 
 * Input 10 5
 * 
 * 
 * 
 * Output 2
 * 
 * 
 * 
 * Input 6 12
 * 
 * 
 * 
 * Output 4
 * 
 * 
 * 
 * Input 5 13
 * 
 * 
 * 
 * Output 0
 * 
 * 
 * 
 * Note
 * 
 * A table for the second sample test is given below. The occurrences of number
 * 12 are marked bold
 * 
 * A577MultiplicationTable.java
 * 
 * @author olivelv
 * @version time: Oct 7, 2015 10:06:06 PM
 */
public class A577MultiplicationTable {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		long n=cin.nextLong();
		long x=cin.nextLong();
		long cnt=0;
		for(long i=1;i<=n;i++)
			if(x%i==0&&x/i<=n)cnt++;
		System.out.println(cnt);
	}
}
