import java.util.Scanner;

/**
 * Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at
 * numbers but he loves inverting digits in them. Inverting digit t means
 * replacing it with digit 9 - t.
 * 
 * Help Chewbacca to transform the initial number x to the minimum possible
 * positive number by inverting some (possibly, zero) digits. The decimal
 * representation of the final number shouldn't start with a zero.
 * 
 * Input 
 * The first line contains a single integer x (1 ≤ x ≤ 1018) — the number
 * that Luke Skywalker gave to Chewbacca.
 * 
 * Output 
 * Print the minimum possible positive number that Chewbacca can obtain
 * after inverting some digits. The number shouldn't contain leading zeroes.
 * 
 * Sample test(s) 
 * input 
 * 27 
 * output 
 * 22 
 * input 
 * 4545 
 * output 
 * 4444
 * 
 * @Title: A514ChewbaсcaAndNumber.java
 * @author lxh
 * @date Sep 16, 2015 1:43:49 PM
 * 
 */

public class A514ChewbaсcaAndNumber {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		String s=cin.next();
		int n=s.length();
		if(s.equals("9")){
			System.out.println(9);
			return ;
		}
		String str="";
		for(int i=0;i<n;i++){
			int val=s.charAt(i)-'0';
			if(i==0&&val==9){
				str+=val;
				continue;
			}
			str+=Math.min(val, 9-val);
		}
		System.out.println(str);
	}
}
