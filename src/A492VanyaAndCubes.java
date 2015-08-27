import java.util.Scanner;

/**
 * Vanya got n cubes. He decided to build a pyramid from them. Vanya wants to
 * build the pyramid as follows: the top level of the pyramid must consist of 1
 * cube, the second level must consist of 1 + 2 = 3 cubes, the third level must
 * have 1 + 2 + 3 = 6 cubes, and so on. Thus, the i-th level of the pyramid must
 * have 1 + 2 + ... + (i - 1) + i cubes.
 * 
 * Vanya wants to know what is the maximum height of the pyramid that he can
 * make using the given cubes.
 * 
 * Input 
 * The first line contains integer n (1 ≤ n ≤ 104) — the number of cubes
 * given to Vanya.
 * 
 * Output 
 * Print the maximum possible height of the pyramid in the single line.
 * 
 * Sample test(s) 
 * input 
 * 1 
 * output 
 * 1 
 * input 
 * 25 
 * output 
 * 4
 * 
 * @Title: A492VanyaAndCubes.java
 * @author lxh
 * @date Aug 27, 2015 2:41:31 PM
 * 
 */

public class A492VanyaAndCubes {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int s=0;
		int levels=1;
		int cubes=1;
		while(true){
			s+=cubes;
			if(s>=n)break;
			levels++;
			cubes+=levels;
		}
		if(s>n)System.out.println(levels-1);
		else
			System.out.println(levels);
		
	}
}
