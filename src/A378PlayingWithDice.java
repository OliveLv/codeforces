import java.util.Scanner;

/**
 * Two players are playing a game. First each of them writes an integer from 1
 * to 6, and then a dice is thrown. The player whose written number got closer
 * to the number on the dice wins. If both payers have the same difference, it's
 * a draw.
 * 
 * The first player wrote number a, the second player wrote number b. How many
 * ways to throw a dice are there, at which the first player wins, or there is a
 * draw, or the second player wins?
 * 
 * Input 
 * The single line contains two integers a and b (1 ≤ a, b ≤ 6) — the
 * numbers written on the paper by the first and second player, correspondingly.
 * 
 * Output 
 * Print three integers: the number of ways to throw the dice at which
 * the first player wins, the game ends with a draw or the second player wins,
 * correspondingly.
 * 
 * Sample test(s) 
 * input 
 * 2 5 
 * output 
 * 3 0 3 
 * input 
 * 2 4 
 * output 
 * 2 1 3 
 * Note 
 * The dice is a standard cube-shaped six-sided object with each side containing a number
 * from 1 to 6, and where all numbers on all sides are distinct.
 * 
 * You can assume that number a is closer to number x than number b, if
 * |a - x| < |b - x|.
 * 
 * @Title: A378PlayingWithDice.java
 * @author lxh
 * @date Nov 10, 2015 8:24:00 AM
 * 
 */

public class A378PlayingWithDice {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int a=cin.nextInt();
		int b=cin.nextInt();
		int []res=new int[3];
		for(int i=1;i<=6;i++){
			int x=Math.abs(i-a);
			int y=Math.abs(i-b);
			if(x<y)res[0]++;
			else if(x==y)res[1]++;
			else
				res[2]++;
		}
		System.out.println(res[0]+" "+res[1]+" "+res[2]);
	}
}
