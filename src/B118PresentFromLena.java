import java.util.Scanner;

/**
 * 
 Vasya's birthday is approaching and Lena decided to sew a patterned
 * handkerchief to him as a present. Lena chose digits from 0 to n as the
 * pattern. The digits will form a rhombus. The largest digit n should be
 * located in the centre. The digits should decrease as they approach the edges.
 * For example, for n = 5 the handkerchief pattern should look like that:
 * 
 * 0 0 1 0 0 1 2 1 0 0 1 2 3 2 1 0 0 1 2 3 4 3 2 1 0 0 1 2 3 4 5 4 3 2 1 0 0 1 2
 * 3 4 3 2 1 0 0 1 2 3 2 1 0 0 1 2 1 0 0 1 0 0
 * 
 * 
 * Your task is to determine the way the handkerchief will look like by the
 * given n.
 * 
 * 
 * Input
 * 
 * The first line contains the single integer n (2 ≤ n ≤ 9).
 * 
 * 
 * Output
 * 
 * Print a picture for the given n. You should strictly observe the number of
 * spaces before the first digit on each line. Every two adjacent digits in the
 * same line should be separated by exactly one space. There should be no spaces
 * after the last digit at the end of each line.
 * 
 * 
 * Sample test(s)
 * 
 * 
 * 
 * Input 
 * 2
 * 
 * 
 * 
 * Output 
 * 0 0 1 0 0 1 2 1 0 0 1 0 0
 * 
 * 
 * 
 * Input 3
 * 
 * 
 * 
 * Output 0 0 1 0 0 1 2 1 0 0 1 2 3 2 1 0 0 1 2 1 0 0 1 0 0
 * 
 * B118PresentFromLena.java
 * 
 * @author olivelv
 * @version time: Sep 21, 2015 7:41:26 PM
 */
public class B118PresentFromLena {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int num=2*n+1;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i;j++){
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++){
				if(j!=0)System.out.print(" ");
				System.out.print(j);
			}
			for(int j=i-1;j>=0;j--){
				System.out.print(" ");
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=0;i<=n;i++){
			if(i!=0)System.out.print(" ");
			System.out.print(i);
		}
		for(int i=n-1;i>=0;i--){
			System.out.print(" "+i);
		}
		System.out.println();
		for(int i=n-1;i>=0;i--){
			for(int j=0;j<n-i;j++){
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++){
				if(j!=0)System.out.print(" ");
				System.out.print(j);
			}
			for(int j=i-1;j>=0;j--){
				System.out.print(" ");
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
