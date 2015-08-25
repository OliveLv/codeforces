import java.util.Scanner;

/**
 * New Year is coming in Line World! In this world, there are n cells numbered
 * by integers from 1 to n, as a 1 × n board. People live in cells. However, it
 * was hard to move between distinct cells, because of the difficulty of
 * escaping the cell. People wanted to meet people who live in other cells.
 * 
 * So, user tncks0121 has made a transportation system to move between these
 * cells, to celebrate the New Year. First, he thought of n - 1 positive
 * integers a1, a2, ..., an - 1. For every integer i where 1 ≤ i ≤ n - 1 the
 * condition 1 ≤ ai ≤ n - i holds. Next, he made n - 1 portals, numbered by
 * integers from 1 to n - 1. The i-th (1 ≤ i ≤ n - 1) portal connects cell i and
 * cell (i + ai), and one can travel from cell i to cell (i + ai) using the i-th
 * portal. Unfortunately, one cannot use the portal backwards, which means one
 * cannot move from cell (i + ai) to cell i using the i-th portal. It is easy to
 * see that because of condition 1 ≤ ai ≤ n - i one can't leave the Line World
 * using portals.
 * 
 * Currently, I am standing at cell 1, and I want to go to cell t. However, I
 * don't know whether it is possible to go there. Please determine whether I can
 * go to cell t by only using the construted transportation system.
 * 
 * Input 
 * The first line contains two space-separated integers n
 * (3 ≤ n ≤ 3 × 104) and t (2 ≤ t ≤ n) — the number of cells, and the index of
 * the cell which I want to go to.
 * 
 * The second line contains n - 1 space-separated integers a1, a2, ..., an - 1
 * (1 ≤ ai ≤ n - i). It is guaranteed, that using the given transportation
 * system, one cannot leave the Line World.
 * 
 * Output 
 * If I can go to cell t using the transportation system, print "YES".
 * Otherwise, print "NO".
 * 
 * Sample test(s) 
 * input 
 * 8 4 
 * 1 2 1 2 1 2 1 
 * output 
 * YES 
 * input 
 * 8 5 
 * 1 2 1 2 1 1 1
 * output 
 * NO 
 * Note 
 * In the first sample, the visited cells are: 1, 2, 4; so we can
 * successfully visit the cell 4.
 * 
 * In the second sample, the possible cells to visit are: 1, 2, 4, 6, 7, 8; so
 * we can't visit the cell 5, which we want to visit.
 * 
 * @Title: A500NewYearTransportation.java
 * @author lxh
 * @date Aug 25, 2015 1:06:28 PM
 * 
 */

public class A500NewYearTransportation {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int t=cin.nextInt();
		int now=1;
		boolean flag=false;
		for(int i=1;i<n;i++){
			int val=cin.nextInt();
			if(t==now)flag=true;
			if(i==now)now+=val;
		}
		if(t==now)flag=true;
		if(flag)System.out.println("YES");
		else
			System.out.println("NO");
	}
}
