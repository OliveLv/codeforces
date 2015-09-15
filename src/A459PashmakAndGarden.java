import java.util.Scanner;

/**
 * Pashmak has fallen in love with an attractive girl called Parmida since one
 * year ago...
 * 
 * Today, Pashmak set up a meeting with his partner in a romantic garden.
 * Unfortunately, Pashmak has forgotten where the garden is. But he remembers
 * that the garden looks like a square with sides parallel to the coordinate
 * axes. He also remembers that there is exactly one tree on each vertex of the
 * square. Now, Pashmak knows the position of only two of the trees. Help him to
 * find the position of two remaining ones.
 * 
 * Input 
 * The first line contains four space-separated x1, y1, x2, y2
 * ( - 100 ≤ x1, y1, x2, y2 ≤ 100) integers, where x1 and y1 are coordinates of
 * the first tree and x2 and y2 are coordinates of the second tree. It's
 * guaranteed that the given points are distinct.
 * 
 * Output 
 * If there is no solution to the problem, print -1. Otherwise print four
 * space-separated integers x3, y3, x4, y4 that correspond to the coordinates of
 * the two other trees. If there are several solutions you can output any of
 * them.
 * 
 * Note that x3, y3, x4, y4 must be in the range
 * ( - 1000 ≤ x3, y3, x4, y4 ≤ 1000).
 * 
 * Sample test(s) 
 * input 
 * 0 0 0 1 
 * output 
 * 1 0 1 1 
 * input 
 * 0 0 1 1 
 * output 
 * 0 1 1 0
 * input 
 * 0 0 1 2 
 * output 
 * -1
 * 
 * @Title: A459PashmakAndGarden.java
 * @author lxh
 * @date Sep 15, 2015 9:28:05 AM
 * 
 */

public class A459PashmakAndGarden {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);	
		int x1=cin.nextInt();
		int y1=cin.nextInt();
		int x2=cin.nextInt();
		int y2=cin.nextInt();
		if(x1==x2||y1==y2){
			if(x1==x2){
				int val=Math.abs(y1-y2);
				System.out.println((x1+val)+" "+y1+" "+(x2+val)+" "+y2);
			}else{
				int val=Math.abs(x1-x2);
				System.out.println(x1+" "+(y1+val)+" "+x2+" "+(y2+val));
			}
		}else{
			if(Math.abs(y2-y1)!=Math.abs(x1-x2))System.out.println("-1");
			else
				System.out.println(x1+" "+y2+" "+x2+" "+y1);
		}
	}
}
