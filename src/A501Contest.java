import java.util.Scanner;

/**
 * Misha and Vasya participated in a Codeforces contest. Unfortunately, each of
 * them solved only one problem, though successfully submitted it at the first
 * attempt. Misha solved the problem that costs a points and Vasya solved the
 * problem that costs b points. Besides, Misha submitted the problem c minutes
 * after the contest started and Vasya submitted the problem d minutes after the
 * contest started. As you know, on Codeforces the cost of a problem reduces as
 * a round continues. That is, if you submit a problem that costs p points t
 * minutes after the contest started, you get points.
 * 
 * Misha and Vasya are having an argument trying to find out who got more
 * points. Help them to find out the truth.
 * 
 * Input 
 * The first line contains four integers a, b, c, d (250 ≤ a, b ≤ 3500,
 * 0 ≤ c, d ≤ 180).
 * 
 * It is guaranteed that numbers a and b are divisible by 250 (just like on any
 * real Codeforces round).
 * 
 * Output 
 * Output on a single line:
 * 
 * "Misha" (without the quotes), if Misha got more points than Vasya.
 * 
 * "Vasya" (without the quotes), if Vasya got more points than Misha.
 * 
 * "Tie" (without the quotes), if both of them got the same number of points.
 * 
 * Sample test(s) input 500 1000 20 30 output Vasya input 1000 1000 1 1 output
 * Tie input 1500 1000 176 177 output Misha
 * 
 * @Title: A501Contest.java
 * @author lxh
 * @date Nov 10, 2015 8:38:00 AM
 * 
 */

public class A501Contest {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int a=cin.nextInt();
		int b=cin.nextInt();
		int c=cin.nextInt();
		int d=cin.nextInt();
		int x=Math.max(a/10*3, a-a/250*c);
		int y=Math.max(b/10*3, b-b/250*d);
		if(x>y)System.out.println("Misha");
		else if(x==y)System.out.println("Tie");
		else
			System.out.println("Vasya");
	}
}
