import java.util.Scanner;

/**
 * The new "Die Hard" movie has just been released! There are n people at the
 * cinema box office standing in a huge line. Each of them has a single 100, 50
 * or 25 ruble bill. A "Die Hard" ticket costs 25 rubles. Can the booking clerk
 * sell a ticket to each person and give the change if he initially has no money
 * and sells the tickets strictly in the order people follow in the line?
 * 
 * Input The first line contains integer n (1 ≤ n ≤ 105) — the number of people
 * in the line. The next line contains n integers, each of them equals 25, 50 or
 * 100 — the values of the bills the people have. The numbers are given in the
 * order from the beginning of the line (at the box office) to the end of the
 * line.
 * 
 * Output 
 * Print "YES" (without the quotes) if the booking clerk can sell a
 * ticket to each person and give the change. Otherwise print "NO".
 * 
 * Sample test(s) 
 * input 
 * 4 
 * 25 25 50 50 
 * output 
 * YES 
 * input 
 * 2 
 * 25 100 
 * output 
 * NO 
 * input
 * 4 
 * 50 50 25 25 
 * output 
 * NO
 * 
 * @Title: A349CinemaLine.java
 * @author lxh
 * @date Sep 28, 2015 1:41:07 PM
 * 
 */

public class A349CinemaLine {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int left25=0,left50=0,left100=0;
		boolean flag=false;
		for(int i=0;i<n;i++){
			int val=cin.nextInt();
			if(flag)continue;
			if(val==25)left25++;
			else if(val==50){
				if(left25!=0){
					left50++;
					left25--;
				}else
					flag=true;
			}else{
				if(left50!=0&&left25!=0){
					left50--;
					left25--;
					left100++;
				}else if(left25>=3){
					left100++;
					left25-=3;
				}else
					flag=true;
			}
		}
		if(flag)System.out.println("NO");
		else
			System.out.println("YES");
	}
}
