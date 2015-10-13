import java.util.Scanner;

/**
 * Olesya loves numbers consisting of n digits, and Rodion only likes numbers
 * that are divisible by t. Find some number that satisfies both of them.
 * 
 * Your task is: given the n and t print an integer strictly larger than zero
 * consisting of n digits that is divisible by t. If such number doesn't exist,
 * print  - 1.
 * 
 * Input 
 * The single line contains two numbers, n and t (1 ≤ n ≤ 100, 2 ≤ t ≤ 10)
 * — the length of the number and the number it should be divisible by.
 * 
 * Output 
 * Print one such positive number without leading zeroes, — the answer to
 * the problem, or  - 1, if such number doesn't exist. If there are multiple
 * possible answers, you are allowed to print any of them.
 * 
 * Sample test(s) 
 * input 
 * 3 2 
 * output 
 * 712
 * 
 * @Title: A584OlesyaAndRodion.java
 * @author lxh
 * @date Oct 13, 2015 7:47:01 AM
 * 
 */

public class A584OlesyaAndRodion {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int t=cin.nextInt();
		String s="";
		if(n==1&&t==10){
			System.out.println(-1);
			return ;
		}
		if(t==10){
			s+=1;
			for(int i=1;i<n;i++)s+="0";
		}else{
		for(int i=0;i<n;i++)s+=t;
		}
		System.out.println(s);
		
	}
}
