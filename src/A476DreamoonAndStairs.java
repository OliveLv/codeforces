import java.util.Scanner;

/**
 * Dreamoon wants to climb up a stair of n steps. He can climb 1 or 2 steps at
 * each move. Dreamoon wants the number of moves to be a multiple of an integer
 * m.
 * 
 * What is the minimal number of moves making him climb to the top of the stairs
 * that satisfies his condition?
 * 
 * Input 
 * The single line contains two space separated integers n, m
 * (0 < n ≤ 10000, 1 < m ≤ 10).
 * 
 * Output 
 * Print a single integer — the minimal number of moves being a multiple
 * of m. If there is no way he can climb satisfying condition print  - 1
 * instead.
 * 
 * Sample test(s) 
 * input 
 * 10 2 
 * output 
 * 6 
 * input 
 * 3 5 
 * output 
 * -1 
 * Note 
 * For the first sample, Dreamoon could climb in 6 moves with following sequence of steps: {2,2, 2, 2, 1, 1}.
 * 
 * For the second sample, there are only three valid sequence of steps {2, 1},
 * {1, 2}, {1, 1, 1} with 2, 2, and 3 steps respectively. All these numbers are
 * not multiples of 5.
 * 
 * @Title: A476DreamoonAndStairs.java
 * @author lxh
 * @date Sep 10, 2015 2:58:37 PM
 * 
 */

public class A476DreamoonAndStairs {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);	
		int n=cin.nextInt();
		int m=cin.nextInt();
		int min=Integer.MAX_VALUE;
		for(int i=0;2*i<=n;i++){
			int val=i+n-2*i;
			if(val%m==0){
				if(val<min)min=val;
			}
		}
		if(min==Integer.MAX_VALUE)System.out.println(-1);
		else
			System.out.println(min);
	}
}
