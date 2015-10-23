import java.util.Arrays;
import java.util.Scanner;

/**
 * Colonel has n badges. He wants to give one badge to every of his n soldiers.
 * Each badge has a coolness factor, which shows how much it's owner reached.
 * Coolness factor can be increased by one for the cost of one coin.
 * 
 * For every pair of soldiers one of them should get a badge with strictly
 * higher factor than the second one. Exact values of their factors aren't
 * important, they just need to have distinct factors.
 * 
 * Colonel knows, which soldier is supposed to get which badge initially, but
 * there is a problem. Some of badges may have the same factor of coolness. Help
 * him and calculate how much money has to be paid for making all badges have
 * different factors of coolness.
 * 
 * Input 
 * First line of input consists of one integer n (1 ≤ n ≤ 3000).
 * 
 * Next line consists of n integers ai (1 ≤ ai ≤ n), which stand for coolness
 * factor of each badge.
 * 
 * Output 
 * Output single integer — minimum amount of coins the colonel has to
 * pay.
 * 
 * Sample test(s) 
 * input 
 * 4 
 * 1 3 1 4 
 * output 
 * 1 
 * input 
 * 5 
 * 1 2 3 2 5 
 * output 
 * 2 
 * Note 
 * In first sample test we can increase factor of first badge by 1.
 * 
 * In second sample test we can increase factors of the second and the third
 * badge by 1.
 * 
 * @Title: B546SoldierAndBadges.java
 * @author lxh
 * @date Oct 23, 2015 8:08:57 AM
 * 
 */

public class B546SoldierAndBadges {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++)a[i]=cin.nextInt();
		Arrays.sort(a);
		int ans=0;
		for(int i=1;i<n;i++){
			if(a[i]<=a[i-1]){
				ans+=a[i-1]+1-a[i];
				a[i]=a[i-1]+1;
				
			}
		}
		System.out.println(ans);
	}
}
