import java.util.Scanner;

/**
 * Bizon the Champion is called the Champion for a reason.
 * 
 * Bizon the Champion has recently got a present — a new glass cupboard with n
 * shelves and he decided to put all his presents there. All the presents can be
 * divided into two types: medals and cups. Bizon the Champion has a1 first
 * prize cups, a2 second prize cups and a3 third prize cups. Besides, he has b1
 * first prize medals, b2 second prize medals and b3 third prize medals.
 * 
 * Naturally, the rewards in the cupboard must look good, that's why Bizon the
 * Champion decided to follow the rules:
 * 
 * any shelf cannot contain both cups and medals at the same time; no shelf can
 * contain more than five cups; no shelf can have more than ten medals. Help
 * Bizon the Champion find out if we can put all the rewards so that all the
 * conditions are fulfilled.
 * 
 * Input 
 * The first line contains integers a1, a2 and a3 (0 ≤ a1, a2, a3 ≤ 100).
 * The second line contains integers b1, b2 and b3 (0 ≤ b1, b2, b3 ≤ 100). The
 * third line contains integer n (1 ≤ n ≤ 100).
 * 
 * The numbers in the lines are separated by single spaces.
 * 
 * Output 
 * Print "YES" (without the quotes) if all the rewards can be put on the
 * shelves in the described manner. Otherwise, print "NO" (without the quotes).
 * 
 * Sample test(s) 
 * input 
 * 1 1 1 
 * 1 1 1 
 * 4 
 * output 
 * YES 
 * input 
 * 1 1 3 
 * 2 3 4 
 * 2 
 * output 
 * YES
 * input 
 * 1 0 0 
 * 1 0 0 
 * 1 
 * output 
 * NO
 * 
 * @Title: A448Rewards.java
 * @author lxh
 * @date Aug 29, 2015 7:30:08 PM
 * 
 */

public class A448Rewards {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int cs=0;
		int ms=0;
		for(int i=0;i<3;i++){
			int val=cin.nextInt();
			cs+=val;
		}
		for(int i=0;i<3;i++){
			int val=cin.nextInt();
			ms+=val;
		}
		int n=cin.nextInt();
		n-=cs%5==0?cs/5:cs/5+1;
		if(n<0){
			System.out.println("NO");
			return ;
		}
		n-=ms%10==0?ms/10:ms/10+1;
		if(n<0){
			System.out.println("NO");
			return ;
		}
		System.out.println("YES");
	}
}
