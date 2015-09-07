import java.util.Scanner;

/**
 * Scrooge McDuck keeps his most treasured savings in a home safe with a
 * combination lock. Each time he wants to put there the treasures that he's
 * earned fair and square, he has to open the lock.
 * 
 * 
 * The combination lock is represented by n rotating disks with digits from 0 to
 * 9 written on them. Scrooge McDuck has to turn some disks so that the
 * combination of digits on the disks forms a secret combination. In one move,
 * he can rotate one disk one digit forwards or backwards. In particular, in one
 * move he can go from digit 0 to digit 9 and vice versa. What minimum number of
 * actions does he need for that?
 * 
 * Input 
 * The first line contains a single integer n (1 ≤ n ≤ 1000) — the number
 * of disks on the combination lock.
 * 
 * The second line contains a string of n digits — the original state of the
 * disks.
 * 
 * The third line contains a string of n digits — Scrooge McDuck's combination
 * that opens the lock.
 * 
 * Output 
 * Print a single integer — the minimum number of moves Scrooge McDuck
 * needs to open the lock.
 * 
 * Sample test(s) 
 * input 
 * 5 
 * 82195 
 * 64723 
 * output 
 * 13 
 * Note 
 * In the sample he needs 13 moves:
 * 
 * 1 disk: 2 disk: 3 disk: 4 disk: 5 disk:
 * 
 * @Title: A540CombinationLock.java
 * @author lxh
 * @date Sep 7, 2015 2:19:31 PM
 * 
 */

public class A540CombinationLock {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int []a=new int[n];
		int movs=0;
		String str1=cin.next();
		String str2=cin.next();
		for(int i=0;i<n;i++){
			int val=Math.abs(str1.charAt(i)-str2.charAt(i));
			movs+=Math.min(val,10-val );
		}
		System.out.println(movs);
	}
}
