import java.util.Scanner;

/**
 * Bob is preparing to pass IQ test. The most frequent task in this test is to
 * find out which one of the given n numbers differs from the others. Bob
 * observed that one number usually differs from the others in evenness. Help
 * Bob — to check his answers, he needs a program that among the given n numbers
 * finds one that is different in evenness.
 * 
 * Input 
 * The first line contains integer n (3 ≤ n ≤ 100) — amount of numbers in
 * the task. The second line contains n space-separated natural numbers, not
 * exceeding 100. It is guaranteed, that exactly one of these numbers differs
 * from the others in evenness.
 * 
 * Output 
 * Output index of number that differs from the others in evenness.
 * Numbers are numbered from 1 in the input order.
 * 
 * Sample test(s) 
 * input 
 * 5 
 * 2 4 7 8 10 
 * output 
 * 3 
 * input 
 * 4 
 * 1 2 1 1 
 * output 
 * 2
 * 
 * @Title: A25IQTest.java
 * @author lxh
 * @date Sep 9, 2015 4:11:34 PM
 * 
 */

public class A25IQTest {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int no=0,ne=0;
		int lo=0,le=0;
		for(int i=0;i<n;i++){
			int val=cin.nextInt();
			if(val%2==0){
				ne++;
				le=i+1;
			}else{
				no++;
				lo=i+1;
			}
		}
		if(no==1)System.out.println(lo);
		else
			System.out.println(le);
	}
}
