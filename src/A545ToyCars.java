import java.util.Scanner;

/**
 * Little Susie, thanks to her older brother, likes to play with cars. Today she
 * decided to set up a tournament between them. The process of a tournament is
 * described in the next paragraph.
 * 
 * There are n toy cars. Each pair collides. The result of a collision can be
 * one of the following: no car turned over, one car turned over, both cars
 * turned over. A car is good if it turned over in no collision. The results of
 * the collisions are determined by an n × n matrix А: there is a number on the
 * intersection of the і-th row and j-th column that describes the result of the
 * collision of the і-th and the j-th car:
 * 
 *  - 1: if this pair of cars never collided.  - 1 occurs only on the main
 * diagonal of the matrix. 0: if no car turned over during the collision. 1: if
 * only the i-th car turned over during the collision. 2: if only the j-th car
 * turned over during the collision. 3: if both cars turned over during the
 * collision. Susie wants to find all the good cars. She quickly determined
 * which cars are good. Can you cope with the task?
 * 
 * Input 
 * The first line contains integer n (1 ≤ n ≤ 100) — the number of cars.
 * 
 * Each of the next n lines contains n space-separated integers that determine
 * matrix A.
 * 
 * It is guaranteed that on the main diagonal there are  - 1, and  - 1 doesn't
 * appear anywhere else in the matrix.
 * 
 * It is guaranteed that the input is correct, that is, if Aij = 1, then
 * Aji = 2, if Aij = 3, then Aji = 3, and if Aij = 0, then Aji = 0.
 * 
 * Output 
 * Print the number of good cars and in the next line print their
 * space-separated indices in the increasing order.
 * 
 * Sample test(s) 
 * input 
 * 3 
 * -1 0 0 
 * 0 -1 1 
 * 0 2 -1 
 * output 
 * 2 
 * 1 3 
 * input 
 * 4 
 * -1 3 3 3 
 * 3 -1 3 3 
 * 3 3 -1 3 
 * 3 3 3 -1 
 * output 
 * 0
 * 
 * @Title: A545ToyCars.java
 * @author lxh
 * @date Oct 13, 2015 8:09:18 AM
 * 
 */

public class A545ToyCars {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int []res=new int[n];
		int k=0;
		for(int i=0;i<n;i++){
			boolean flag=true;
			for(int j=0;j<n;j++){
				int val=cin.nextInt();
				if(val==1||val==3)flag=false;
			}
			if(flag)res[k++]=i+1;
		}
		System.out.println(k);
		for(int i=0;i<k;i++){
			if(i!=0)System.out.print(" ");
			System.out.print(res[i]);
		}
	}
}
