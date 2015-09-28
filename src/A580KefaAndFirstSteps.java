import java.util.Scanner;

/**
 * Kefa decided to make some money doing business on the Internet for exactly n
 * days. He knows that on the i-th day (1 ≤ i ≤ n) he makes ai money. Kefa loves
 * progress, that's why he wants to know the length of the maximum
 * non-decreasing subsegment in sequence ai. Let us remind you that the
 * subsegment of the sequence is its continuous fragment. A subsegment of
 * numbers is called non-decreasing if all numbers in it follow in the
 * non-decreasing order.
 * 
 * Help Kefa cope with this task!
 * 
 * Input 
 * The first line contains integer n (1 ≤ n ≤ 105).
 * 
 * The second line contains n integers a1,  a2,  ...,  an (1 ≤ ai ≤ 109).
 * 
 * Output 
 * Print a single integer — the length of the maximum non-decreasing
 * subsegment of sequence a.
 * 
 * Sample test(s) 
 * input 
 * 6 
 * 2 2 1 3 4 1 
 * output 
 * 3 
 * input 
 * 3 
 * 2 2 9 
 * output 
 * 3 
 * Note 
 * In the first test the maximum non-decreasing subsegment is the numbers from the
 * third to the fifth one.
 * 
 * In the second test the maximum non-decreasing subsegment is the numbers from
 * the first to the third one.
 * 
 * @Title: A580KefaAndFirstSteps.java
 * @author lxh
 * @date Sep 28, 2015 2:21:18 PM
 * 
 */

public class A580KefaAndFirstSteps {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int max=0;
		int l=0,r=0;
		int pre=cin.nextInt();
		for(int i=1;i<n;i++){
			int val=cin.nextInt();
			if(val<pre){
				if(r-l+1>max)max=r-l+1;
				l=r=i;
			}else
				r++;
			pre=val;
		}
		if(r-l+1>max)max=r-l+1;
		System.out.println(max);
	}
}
