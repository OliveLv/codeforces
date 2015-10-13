import java.util.Scanner;

/**
 * There are n children in Jzzhu's school. Jzzhu is going to give some candies
 * to them. Let's number all the children from 1 to n. The i-th child wants to
 * get at least ai candies.
 * 
 * Jzzhu asks children to line up. Initially, the i-th child stands at the i-th
 * place of the line. Then Jzzhu start distribution of the candies. He follows
 * the algorithm:
 * 
 * Give m candies to the first child of the line. If this child still haven't
 * got enough candies, then the child goes to the end of the line, else the
 * child go home. Repeat the first two steps while the line is not empty.
 * Consider all the children in the order they go home. Jzzhu wants to know,
 * which child will be the last in this order?
 * 
 * Input 
 * The first line contains two integers n, m (1 ≤ n ≤ 100; 1 ≤ m ≤ 100).
 * The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 100).
 * 
 * Output 
 * Output a single integer, representing the number of the last child.
 * 
 * Sample test(s) 
 * input 
 * 5 2 
 * 1 3 1 4 2 
 * output 
 * 4 
 * input 
 * 6 4 
 * 1 1 2 2 3 3 
 * output 
 * 6
 * Note 
 * Let's consider the first sample.
 * 
 * Firstly child 1 gets 2 candies and go home. Then child 2 gets 2 candies and
 * go to the end of the line. Currently the line looks like [3, 4, 5, 2]
 * (indices of the children in order of the line). Then child 3 gets 2 candies
 * and go home, and then child 4 gets 2 candies and goes to the end of the line.
 * Currently the line looks like [5, 2, 4]. Then child 5 gets 2 candies and goes
 * home. Then child 2 gets two candies and goes home, and finally child 4 gets 2
 * candies and goes home.
 * 
 * Child 4 is the last one who goes home.
 * 
 * @Title: A450JzzhuAndChildren.java
 * @author lxh
 * @date Oct 13, 2015 7:55:59 AM
 * 
 */

public class A450JzzhuAndChildren {
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int m=cin.nextInt();
		int max=0;
		int idx=-1;
		for(int i=1;i<=n;i++){
			int val=cin.nextInt();
			int tmp=val%m==0?val/m:val/m+1;
			if(tmp>=max){
				max=tmp;
				idx=i;
			}
		}
		System.out.println(idx);
	}
}
