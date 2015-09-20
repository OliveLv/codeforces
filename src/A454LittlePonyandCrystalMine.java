import java.util.Scanner;

/**
 * Twilight Sparkle once got a crystal from the Crystal Mine. A crystal of size
 * n (n is odd; n > 1) is an n × n matrix with a diamond inscribed into it.
 * 
 * You are given an odd integer n. You need to draw a crystal of size n. The
 * diamond cells of the matrix should be represented by character "D". All other
 * cells of the matrix should be represented by character "*". Look at the
 * examples to understand what you need to draw.
 * 
 * Input 
 * The only line contains an integer n (3 ≤ n ≤ 101; n is odd).
 * 
 * Output 
 * Output a crystal of size n.
 * 
 * Sample test(s)
 * input 
 * 3 
 * output 
 * D* DDD D* 
 * input 
 * 5 
 * output 
 * D** DDD* DDDDD DDD*
 * D** 
 * input 
 * 7 
 * output 
 * D*** DDD** DDDDD* DDDDDDD DDDDD* DDD** D***
 * 
 * @Title: A454LittlePonyandCrystalMine.java
 * @author lxh
 * @date Sep 20, 2015 1:35:45 PM
 * 
 */

public class A454LittlePonyandCrystalMine {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		for(int i=1;i<=(n+1)/2;i++){
			for(int j=0;j<(n+1-2*i)/2;j++)System.out.print("*");
			for(int j=0;j<2*i-1;j++)System.out.print("D");
			for(int j=0;j<(n+1-2*i)/2;j++)System.out.print("*");
			System.out.println();
		}
		for(int i=(n+1)/2+1;i<=n;i++){
			int idx=i-(n+1)/2;
			for(int j=0;j<idx;j++)System.out.print("*");
			for(int j=0;j<n-2*idx;j++)System.out.print("D");
			for(int j=0;j<idx;j++)System.out.print("*");
			System.out.println();
		}
	}
}
