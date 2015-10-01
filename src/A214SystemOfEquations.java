import java.util.Scanner;

/**
 * 
 Furik loves math lessons very much, so he doesn't attend them, unlike Rubik.
 * But now Furik wants to get a good mark for math. For that Ms. Ivanova, his
 * math teacher, gave him a new task. Furik solved the task immediately. Can
 * you?
 * 
 * You are given a system of equations:
 * 
 * 
 * You should count, how many there are pairs of integers (a, b) (0 ≤ a, b)
 * which satisfy the system.
 * 
 * 
 * Input
 * 
 * A single line contains two integers n, m (1 ≤ n, m ≤ 1000) — the parameters
 * of the system. The numbers on the line are separated by a space.
 * 
 * 
 * Output
 * 
 * On a single line print the answer to the problem.
 * 
 * 
 * Sample test(s)
 * 
 * 
 * 
 * Input 9 3
 * 
 * 
 * 
 * Output 1
 * 
 * 
 * 
 * Input 14 28
 * 
 * 
 * 
 * Output 1
 * 
 * 
 * 
 * Input 4 20
 * 
 * 
 * 
 * Output 0
 * 
 * 
 * 
 * Note
 * 
 * In the first sample the suitable pair is integers (3, 0). In the second
 * sample the suitable pair is integers (3, 5). In the third sample there is no
 * suitable pair.
 * 
 * A214SystemOfEquations.java
 * 
 * @author olivelv
 * @version time: Oct 1, 2015 7:19:31 PM
 */
public class A214SystemOfEquations {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int m=cin.nextInt();
		int cnt=0;
		for(int a=0;a<=m;a++){
			for(int b=0;b<=n;b++)
				if((a*a+b==n)&&(a+b*b==m))cnt++;
		}
		System.out.println(cnt);
	}
}
