import java.util.Scanner;

/**
 * A soldier wants to buy w bananas in the shop. He has to pay k dollars for the
 * first banana, 2k dollars for the second one and so on (in other words, he has
 * to pay i·k dollars for the i-th banana).
 * 
 * He has n dollars. How many dollars does he have to borrow from his friend
 * soldier to buy w bananas?
 * 
 * Input 
 * The first line contains three positive integers k, n, w
 * (1  ≤  k, w  ≤  1000, 0 ≤ n ≤ 109), the cost of the first banana, initial
 * number of dollars the soldier has and number of bananas he wants.
 * 
 * Output 
 * Output one integer — the amount of dollars that the soldier must
 * borrow from his friend. If he doesn't have to borrow money, output 0.
 * 
 * Sample test(s) 
 * input 
 * 3 17 4 
 * output 
 * 13
 * 
 * @Title: A546SoldierAndBananas.java
 * @author lxh
 * @date Aug 19, 2015 7:28:05 PM
 * 
 */

public class A546SoldierAndBananas {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int k=cin.nextInt();
		int n=cin.nextInt();
		int w=cin.nextInt();
		int res=w%2==0?w/2*(w+1)*k:(w+1)/2*w*k;
		if(res>n)System.out.println(res-n);
		else
			System.out.println("0");
	}
}
