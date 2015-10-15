import java.util.Scanner;

/**
 * You are given two arrays A and B consisting of integers, sorted in
 * non-decreasing order. Check whether it is possible to choose k numbers in
 * array A and choose m numbers in array B so that any number chosen in the
 * first array is strictly less than any number chosen in the second array.
 * 
 * Input 
 * The first line contains two integers nA, nB (1 ≤ nA, nB ≤ 105),
 * separated by a space — the sizes of arrays A and B, correspondingly.
 * 
 * The second line contains two integers k and m (1 ≤ k ≤ nA, 1 ≤ m ≤ nB),
 * separated by a space.
 * 
 * The third line contains nA numbers a1, a2, ... anA
 * ( - 109 ≤ a1 ≤ a2 ≤ ... ≤ anA ≤ 109), separated by spaces — elements of array
 * A.
 * 
 * The fourth line contains nB integers b1, b2, ... bnB
 * ( - 109 ≤ b1 ≤ b2 ≤ ... ≤ bnB ≤ 109), separated by spaces — elements of array
 * B.
 * 
 * Output 
 * Print "YES" (without the quotes), if you can choose k numbers in array
 * A and m numbers in array B so that any number chosen in array A was strictly
 * less than any number chosen in array B. Otherwise, print "NO" (without the
 * quotes).
 * 
 * Sample test(s) 
 * input 
 * 3 3 
 * 2 1 
 * 1 2 3 
 * 3 4 5 
 * output 
 * YES 
 * input 
 * 3 3 
 * 3 3 
 * 1 2 3 
 * 3 4 5
 * output 
 * NO 
 * input 
 * 5 2 
 * 3 1 
 * 1 1 1 1 1 
 * 2 2 
 * output 
 * YES 
 * Note 
 * In the first sample test you can, for example, choose numbers 1 and 2 from array A and number 3
 * from array B (1 < 3 and 2 < 3).
 * 
 * In the second sample test the only way to choose k elements in the first
 * array and m elements in the second one is to choose all numbers in both
 * arrays, but then not all the numbers chosen in A will be less than all the
 * numbers chosen in B: .
 * 
 * @Title: A572Arrays.java
 * @author lxh
 * @date Oct 15, 2015 7:32:43 AM
 * 
 */

public class A572Arrays {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int na=cin.nextInt();
		int nb=cin.nextInt();
		int k=cin.nextInt();
		int m=cin.nextInt();
		int a=0,b=0;
		for(int i=1;i<=na;i++){
			int val=cin.nextInt();
			if(i==k)a=val;
		}
		for(int i=1;i<=nb;i++){
			int val=cin.nextInt();
			if(i==(nb-m+1))b=val;
		}
		if(a<b)System.out.println("YES");
		else
			System.out.println("NO");
	}
}
