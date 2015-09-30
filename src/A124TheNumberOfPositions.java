import java.util.Scanner;

/**
 * 
 Petr stands in line of n people, but he doesn't know exactly which position
 * he occupies. He can say that there are no less than a people standing in
 * front of him and no more than b people standing behind him. Find the number
 * of different positions Petr can occupy.
 * 
 * 
 * Input
 * 
 * The only line contains three integers n, a and b (0 ≤ a, b < n ≤ 100).
 * 
 * 
 * Output
 * 
 * Print the single number — the number of the sought positions.
 * 
 * 
 * Sample test(s)
 * 
 * 
 * 
 * Input 3 1 1
 * 
 * 
 * 
 * Output 2
 * 
 * 
 * 
 * Input 5 2 3
 * 
 * 
 * 
 * Output 3
 * 
 * 
 * 
 * Note
 * 
 * The possible positions in the first sample are: 2 and 3 (if we number the
 * positions starting with 1).
 * 
 * In the second sample they are 3, 4 and 5.
 * 
 * A124TheNumberOfPositions.java
 * 
 * @author olivelv
 * @version time: Sep 30, 2015 8:01:59 PM
 */
public class A124TheNumberOfPositions {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int a=cin.nextInt();
		int b=cin.nextInt();
		int tmp=Math.max(a+1, n-b);
		System.out.println(n-tmp+1);
	}
}
