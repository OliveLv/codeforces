import java.util.Scanner;

/**
 * Emuskald needs a fence around his farm, but he is too lazy to build it
 * himself. So he purchased a fence-building robot.
 * 
 * He wants the fence to be a regular polygon. The robot builds the fence along
 * a single path, but it can only make fence corners at a single angle a.
 * 
 * Will the robot be able to build the fence Emuskald wants? In other words, is
 * there a regular polygon which angles are equal to a?
 * 
 * Input 
 * The first line of input contains an integer t (0 < t < 180) — the
 * number of tests. Each of the following t lines contains a single integer a
 * (0 < a < 180) — the angle the robot can make corners at measured in degrees.
 * 
 * Output 
 * For each test, output on a single line "YES" (without quotes), if the
 * robot can build a fence Emuskald wants, and "NO" (without quotes), if it is
 * impossible.
 * 
 * Sample test(s) 
 * input 
 * 3 
 * 30 
 * 60 
 * 90 
 * output 
 * NO 
 * YES 
 * YES 
 * Note 
 * In the first test case, it is impossible to build the fence, since there is no regular polygon
 * with angle .
 * 
 * In the second test case, the fence is a regular triangle, and in the last
 * test case — a square.
 * 
 * @Title: A270FancyFence.java
 * @author lxh
 * @date Sep 20, 2015 1:54:12 PM
 * 
 */

public class A270FancyFence {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int T=cin.nextInt();
		for(int t=0;t<T;t++){
			int a=cin.nextInt();
			if(360%(180-a)==0)System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
